package com.zoller_doblander.calculator;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication implements CommandLineRunner

{

    public static void main(String[] args) {
        SpringApplication.run(CalculatorApplication.class, args);
    }

    @java.lang.Override
    public void run(java.lang.String... args) throws Exception {

        logic.startCalculator();


    }
}

