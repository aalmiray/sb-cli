package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {
    @Override
    public void run(String... args) {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}