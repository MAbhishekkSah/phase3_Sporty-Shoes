package com.api.ecommerce.shoes.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {
	
	@Bean
    public Docket getBean() {
       return new Docket(DocumentationType.SWAGGER_2).select().paths(PathSelectors.regex("/api.*")).build();
    }
	
	@SuppressWarnings("unused")
	private ApiInfo getInfo() {
		return new ApiInfoBuilder().title("GvStuidiozz").description("Sporty Shoes").license("GvStudiozz").build();
	}
}

