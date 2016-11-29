package net.marioosh.spring.config;

import javax.servlet.ServletContext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

@Configuration
@Profile("default")
public class ThymeleafConfiguration {
	
	@Bean
	public ServletContextTemplateResolver servletContextTemplateResolver(ServletContext ctx) {
		ServletContextTemplateResolver resolver = new ServletContextTemplateResolver(ctx);
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".html");
		return resolver;
	}
}
