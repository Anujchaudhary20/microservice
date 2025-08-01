package com.easybytes.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.easybytes.accounts.dto.AccountsContactInfoDto;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef="auditAwareImpl")
@EnableConfigurationProperties(value = {AccountsContactInfoDto.class})
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts microservice REST API Documentation",
				description = "EasyBank Accounts microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Anuj Singh",
						email = "tutor@easybytes.com",
						url = "https://www.linkedin.com/in/anujsingh25/"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.linkedin.com/in/anujsingh25/"
				)
		),
		externalDocs = @ExternalDocumentation(
				description =  "EasyBank Accounts microservice REST API Documentation",
				url = "https://www.linkedin.com/in/anujsingh25/"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
