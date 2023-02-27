package com.SonarVibon.SonarVibon;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.BufferedImageHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.filter.ShallowEtagHeaderFilter;

import java.awt.image.BufferedImage;


@Configuration
public class SpringConfig {

    @Bean
    public ShallowEtagHeaderFilter shallowEtagHeaderFilter() {
        return new ShallowEtagHeaderFilter();
    }

    @Bean
    public OpenAPI openApi() {
        return new OpenAPI()
                .info(new Info().title("ACME,Inc. API1 - LocalHost8080")
                .description("API for managing products and its reviews and votes")
                .version("v1.0"));

    }

    @Bean
    public HttpMessageConverter<BufferedImage> createImageHttpMessageConverter() {
        return new BufferedImageHttpMessageConverter();
    }

}
