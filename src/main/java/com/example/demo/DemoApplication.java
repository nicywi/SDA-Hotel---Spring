package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
// POJO - klasa ma pola
// Java Bean - metody getery i setery
// Spring Bean - Obiekt zarządzany przez kontekst spring
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
