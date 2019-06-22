package com.bad115.registroelectricoapp.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebMVCSecurityConfiguration extends WebSecurityConfigurerAdapter{

		@Override
		protected void configure(HttpSecurity http) throws Exception {
			http.authorizeRequests()
				.antMatchers("css/**","images/**","js/**","plugins/**","scss/**").permitAll()
				.anyRequest().authenticated()
				.and()
			.formLogin()
			.failureUrl("/login")
			.loginPage("/login")
			.defaultSuccessUrl("/dashboard")
			.permitAll()
			;			
			
		}
}

