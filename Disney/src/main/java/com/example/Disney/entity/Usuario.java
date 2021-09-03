package com.example.Disney.entity;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
@Table (name = "Usuario")

public class Usuario implements Serializable, UserDetails {
	

	private static final long serialVersionUID = -2845171103561039401L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idusuario;
	
    private String usuario;
	
	private String password;
	
	public Usuario(String usuario) {
		
		this.usuario = usuario;
	}
	
	
    public Usuario() {	
	}
    

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return usuario;
	}
	
	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return "pass";
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	
	

}
