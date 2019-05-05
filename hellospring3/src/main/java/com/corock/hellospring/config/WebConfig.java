package com.corock.hellospring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @EnableWebMvc: <mvc:annotation-driven /> in spring-servlet.xml
 * @ComponentScan: <context:component-scan> in applicationConext.xml
 */
@Configuration
@EnableWebMvc
@ComponentScan( "com.corock.hellospring.controller" )
public class WebConfig {

	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix( "WEB-INF/views/" );
		resolver.setSuffix( ".jsp" );
		resolver.setExposeContextBeansAsAttributes( true );
		
		return resolver;
	}
	
}
