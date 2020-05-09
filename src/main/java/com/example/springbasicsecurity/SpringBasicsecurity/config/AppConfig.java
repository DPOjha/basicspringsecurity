package com.example.springbasicsecurity.SpringBasicsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class AppConfig extends WebSecurityConfigurerAdapter {

	/*
	 * security for particular url
	 * 
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/auth/**").fullyAuthenticated().and().httpBasic();
	}

	/*
	 * security for anyRequest
	 * 
	 */
	/*
	 * @Override protected void configure(HttpSecurity http) throws Exception{
	 * http.authorizeRequests().anyRequest().fullyAuthenticated().and().httpBasic();
	 * }
	 */

	@Bean
	public UserDetailsService userDetailsService() {

		@SuppressWarnings("deprecation")
		User.UserBuilder users = User.withDefaultPasswordEncoder();
		InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
		manager.createUser(users.username("user").password("password").roles("USER").build());
		// manager.createUser(users.username("admin").password("password").roles("USER",
		// "ADMIN").build());
		return manager;

	}
}
