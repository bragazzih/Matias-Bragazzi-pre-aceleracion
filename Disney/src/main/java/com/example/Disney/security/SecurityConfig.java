  
package com.example.Disney.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.context.annotation.Bean;



@Configuration


public class SecurityConfig extends WebSecurityConfigurerAdapter {
@Autowired
UserDetailsService userDetailsService;

	/* @Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService);
	}
	*/
	
@Override
public void configure(WebSecurity web) throws Exception {
    web.ignoring().antMatchers("/genero");
    web.ignoring().antMatchers("/movies");
    web.ignoring().antMatchers("/characters");
    web.ignoring().antMatchers("/genero/**");
    web.ignoring().antMatchers("/movies/**");
    web.ignoring().antMatchers("/characters/**");
}

@Override
protected void configure(HttpSecurity httpSecurity) throws Exception {
    httpSecurity.authorizeRequests().antMatchers("/genero").permitAll();
    httpSecurity.authorizeRequests().antMatchers("/movies").permitAll();
    httpSecurity.authorizeRequests().antMatchers("/characters").permitAll();
}


	/* @Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		//.antMatchers("/admin").hasRole("ADMIN")
		//.antMatchers("/user").hasRole("ADMIN,USER")
		.antMatchers("/genero").permitAll();
		*/


	

		
	}
	
/* @Bean
public PasswordEncoder getPasswodEncoder() {
	return NoOpPasswordEncoder.getInstance();
}

	*/
	

	
