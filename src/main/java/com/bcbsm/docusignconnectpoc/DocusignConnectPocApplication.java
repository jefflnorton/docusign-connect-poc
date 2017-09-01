package com.bcbsm.docusignconnectpoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class DocusignConnectPocApplication extends SpringBootServletInitializer {
    private static Class<DocusignConnectPocApplication> applicationClass = DocusignConnectPocApplication.class;

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass);
    }
	public static void main(String[] args) {
		SpringApplication.run(DocusignConnectPocApplication.class, args);
	}
}
