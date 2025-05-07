// package com.example.jhwsample.Config;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import java.util.ArrayList;
// import java.util.List;

// @Configuration
// @EnableSwagger2
// public class SwaggerConfig {

// @Bean
// public Docket api() {
// return new Docket(DocumentationType.SWAGGER_2)
// .select()
// .apis(RequestHandlerSelectors.basePackage("com.jhwsample.controller"))
// .paths(PathSelectors.any())
// .build();
// }

// private ApiInfo apiInfo() {
// return new ApiInfoBuilder()
// .title("jhw sample project API")
// .description("Sample API for demonstration purposes")
// .version("1.0")
// .build();
// }
// }