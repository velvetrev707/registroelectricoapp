package com.bad115.registroelectricoapp.registroelectricoapp;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
// import org.springframework.web.servlet.config.annotation.EnableWebMvc;
// import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter; deprecado por eso se removio

@Configuration
// @EnableWebMvc
@ComponentScan({"com.bad115.registroelectricoapp.controller"})
public class MvcConfiguration implements WebMvcConfigurer {
	
	/*public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}*/
	
	public void addViewsControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("home");
	}
}
