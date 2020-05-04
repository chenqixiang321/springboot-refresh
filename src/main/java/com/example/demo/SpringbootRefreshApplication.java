package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication(scanBasePackages = "com.example.demo")
@ServletComponentScan
@EnableDiscoveryClient

public class SpringbootRefreshApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRefreshApplication.class, args);
	}

}
