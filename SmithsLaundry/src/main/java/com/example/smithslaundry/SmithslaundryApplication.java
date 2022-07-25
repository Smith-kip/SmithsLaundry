package com.example.smithslaundry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.lang.String;

@SpringBootApplication
public class SmithslaundryApplication {
    public static void main(String[] args) {
        SpringApplication.run(SmithslaundryApplication.class, args);
        System.out.println("hello from spring boot");
    }
}
