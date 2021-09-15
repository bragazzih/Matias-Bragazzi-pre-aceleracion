package com.example.Disney.service;
import com.example.Disney.Model.Usuario;
import com.example.Disney.dto.UsuarioDto;



public interface IUsuarioService {
	public Usuario findByUsername(String username);
	public Usuario save(UsuarioDto usuarioDto);
}