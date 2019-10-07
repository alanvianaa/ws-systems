package com.alanviana.usersecurity.services;

import org.springframework.mail.SimpleMailMessage;

import com.alanviana.usersecurity.domain.Cliente;

public interface EmailService {


	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}
