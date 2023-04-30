package br.com.duarte.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenApiConfig {
	
	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("RESTful API with Java 18 Spring Boot 3")
						.version("v1")
						.description("Qualquer coisa sobre a api")
						.termsOfService("https://www.twitch.tv/srtasaints")
						.license(new License()
						.name("Apache 2.0")
						.url("https://www.twitch.tv/srtasaints")));
		
	}

}
