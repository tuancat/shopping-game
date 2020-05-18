package vn.ecoe.pigame.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

/**
 * @author nhanvt
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("vn.ecoe.pigame.api"))
                .build().apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfo("ECOE REST API for contact", "See the information.", "API ECOE01", "Terms of service",
                new Contact("ECOE company", "https://ecoegroup.com", "info@ecoe.vn"), "License of ECOE company",
                "API license URL", Collections.emptyList());
    }

    /*
     * @Bean public Docket productApi() { return new
     * Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any
     * ()) .paths(PathSelectors.any()).build(); }
     */
}