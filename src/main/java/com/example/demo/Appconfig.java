package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig {

    @Bean
    public MesageTest demoBean(){
        MesageTest mesageTest = new MesageTest();
        mesageTest.setSayHello("Hello i am a bean");
        return mesageTest;
    }
}
