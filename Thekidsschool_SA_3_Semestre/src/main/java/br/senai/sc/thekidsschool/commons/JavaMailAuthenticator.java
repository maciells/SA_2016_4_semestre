package br.senai.sc.thekidsschool.commons;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class JavaMailAuthenticator extends Authenticator {

	@Override
	protected PasswordAuthentication getPasswordAuthentication() {
		return new PasswordAuthentication("exemploenviosenai@hotmail.com", "DEsmKg]D");
	}
	
}
