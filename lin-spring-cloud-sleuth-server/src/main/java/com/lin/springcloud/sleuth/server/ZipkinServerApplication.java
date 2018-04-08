package com.lin.springcloud.sleuth.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.client.RestTemplate;

import zipkin2.Span;
import zipkin2.reporter.Reporter;

@SpringBootApplication
@EnableAsync
public class ZipkinServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinServerApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	// Use this for debugging (or if there is no Zipkin server running on port 9411)
//	@Bean
//	@ConditionalOnProperty(value = "sample.zipkin.enabled", havingValue = "false")
//	public Reporter<Span> spanReporter() {
//		return Reporter.CONSOLE;
//	}

}
