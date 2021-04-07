package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication implements CommandLineRunner {

    @Value("${connectionString}")
    private String connectionString;

    public static void main(String[] args) {
      SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("get")
    public String get() {
      return connectionString;
    }

    public void run(String... varl) throws Exception {
      System.out.println(String.format("\nConnection String stored in Azure Key Vault:\n%s\n",connectionString));
    }
  }