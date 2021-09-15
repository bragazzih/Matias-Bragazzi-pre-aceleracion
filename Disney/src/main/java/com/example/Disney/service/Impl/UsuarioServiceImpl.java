package com.example.Disney.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import com.example.Disney.Builder.UsuarioBuilder;
import com.example.Disney.Model.Usuario;
import com.example.Disney.dto.UsuarioDto;
import com.example.Disney.repository.UsuarioRepository;
import com.example.Disney.service.ISendMailService;
import com.example.Disney.service.IUsuarioService;



@Service
public class UsuarioServiceImpl implements IUsuarioService{
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	private ISendMailService sendMailService;
	
	@Override
	public Usuario findByUsername(String username) {
		Usuario usuario = usuarioRepository.findByUsername(username);
		return usuario;
	}

	@Override
	public Usuario save(UsuarioDto usuarioDto) {
		SimpleMailMessage message = new SimpleMailMessage();
		Usuario usuario = new UsuarioBuilder().withUsuarioDto(usuarioDto).build();
		usuario = usuarioRepository.save(usuario);
		message.setTo(usuario.getMail());
		return usuario;
	}


}