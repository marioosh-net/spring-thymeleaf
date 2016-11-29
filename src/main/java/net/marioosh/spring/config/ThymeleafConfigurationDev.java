package net.marioosh.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.thymeleaf.templateresolver.FileTemplateResolver;
import org.thymeleaf.templateresolver.ITemplateResolver;

/**
 * Provide refreshable Thymeleaf templates for development 
 * @author marioosh
 */
@Configuration
@Profile("dev")
public class ThymeleafConfigurationDev {
	
	@Bean
	public ITemplateResolver templateResolver() {
		FileTemplateResolver resolver = new FileTemplateResolver();
		resolver.setSuffix(".html");
		resolver.setPrefix("src/main/webapp/WEB-INF/views/");
		resolver.setTemplateMode("HTML5");
		resolver.setCharacterEncoding("UTF-8");
		resolver.setCacheable(false);
		return resolver;
	}	
}
