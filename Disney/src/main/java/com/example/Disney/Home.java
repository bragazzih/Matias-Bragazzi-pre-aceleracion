package com.example.Disney;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class Home {

	@GetMapping("")
	
	public String home() {
		
		return("<h1>Bienvenido a Disney, no tienes ningun rol</h1>");
		
	} 
	
	@GetMapping("/user")
	
	public String usuario() {
		
		return("<h1>Bienvenido a Disney, eres usuario, logueate</h1>");
		
	} 
	
	@GetMapping("/admin")
	
	public String admin() {
		
		return("<h1>Bienvenido a Disney, eres administrador</h1>");
		
	} 
	
}
