package br.senai.sc.thekidsschool.bean;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.senai.sc.thekidsschool.commons.MailUtil;
import br.senai.sc.thekidsschool.model.EnvioEmail;

@ManagedBean
public class EnvioEmailMb {
	
	private EnvioEmail envioEmail; 
	
	@PostConstruct
	public void init(){
		envioEmail = new EnvioEmail();
	}

	public String email() { 
		String texto = envioEmail.getMensagem();
		String email = envioEmail.getEmail();
		String assunto = envioEmail.getAssunto();
		MailUtil.enviarEmail(email, assunto, texto);
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "E-mail enviado com sucesso!", "");
		FacesContext.getCurrentInstance().addMessage(null, message);
		envioEmail = new EnvioEmail();
		return "";
	}

	public EnvioEmail getEnvioEmail() {
		return envioEmail;
	}

	public void setEnvioEmail(EnvioEmail envioEmail) {
		this.envioEmail = envioEmail;
	}
	
}
