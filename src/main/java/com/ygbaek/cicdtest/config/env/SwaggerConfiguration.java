package com.ygbaek.cicdtest.config.env;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @package : com.ygbaek.cicdtest.config
 * @name : SwaggerConfiguration.java
 * @data : 2024-11-24
 * @author : ygbaek
 * @version : 1.0.0
 **/

@Configuration
public class SwaggerConfiguration {

    private static final String API_NAME = "Spring Boot Applicaion";
    private static final String API_VERSION = "1.0.0";
    private static final String API_DESCRIPTION = "Spring Boot Applicaion";


@Bean
    public OpenAPI OpenAPIConfig() {
        return new OpenAPI()
                .info(new Info()
                        .title(API_NAME)
                        .description(API_DESCRIPTION)
                        .version(API_VERSION));
    }
}