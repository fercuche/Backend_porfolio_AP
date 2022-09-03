package ar.edu.ap.portfolio.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI springOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Portfolio Argentina Programa")
                        .description("My API service documentation. ")
                        .version("v1.0")
                        .license(new License().name("Terms of Use").url("https://localhost:8080/terms.html")));
    }
}
