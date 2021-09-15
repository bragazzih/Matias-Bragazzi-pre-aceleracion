package com.example.Disney.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import com.example.Disney.Model.Usuario;
import com.example.Disney.service.ISendMailService;

public class SendMailService implements ISendMailService {

	@Autowired
    private JavaMailSender mailSender;

	@Override
	public void sendEmail(Usuario usuario) {

		SimpleMailMessage message = new SimpleMailMessage();
		 
		message.setFrom("bragazzih@gmail.com");
		message.setTo(usuario.getMail());
		message.setSubject("Bienvenido a disney");
		message.setText("Usuario creado correctamente");
		 
		mailSender.send(message);
		
		
		
	}

}
