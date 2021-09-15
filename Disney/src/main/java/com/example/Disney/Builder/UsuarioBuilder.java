package com.example.Disney.Builder;

import com.example.Disney.Model.Usuario;
import com.example.Disney.dto.UsuarioDto;

public class UsuarioBuilder {
	private String name;
	private String lastName;
	private String mail;
	private String username;
	private String password;
	
	public UsuarioBuilder withUsuarioDto(UsuarioDto usuarioDto) {
		this.name = usuarioDto.getName();
		this.lastName = usuarioDto.getLastName();
		this.mail = usuarioDto.getMail();
		this.username = usuarioDto.getUsername();
		this.password = usuarioDto.getPassword();
		return this;
	}
	
	public Usuario build() {
		return new Usuario(name, lastName, mail, username, password);
	}
}