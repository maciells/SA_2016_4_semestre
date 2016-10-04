package br.senai.sc.thekidsschool.commons;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

public class CustomAuthenticationHandler implements AuthenticationSuccessHandler {

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {

		RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
		Collection<? extends GrantedAuthority> permissoes = authentication.getAuthorities();
		for (GrantedAuthority ga : permissoes) {
			if (ga.getAuthority().equals("ROLE_ADMIN")) {
				redirectStrategy.sendRedirect(request, response, "/Admin/homeAdmin.xhtml");
			} else if (ga.getAuthority().equals("ROLE_PROF")) {
				redirectStrategy.sendRedirect(request, response, "/Prof/homeProf.xhtml");
			} else if (ga.getAuthority().equals("ROLE_ALUNO")) {
				redirectStrategy.sendRedirect(request, response, "/Aluno/homeAluno.xhtml");
			}
		}
	}
}
