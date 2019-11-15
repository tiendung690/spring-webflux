package spring.boot.web.flux.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;

@Configuration
@EnableWebFlux
public class WebFluxConfig {

	// no need to inject reactive Freemarker and Thymeleaf beans
}