package com.example.demo.demoIOC;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerIOC implements Person {
    private String name ;

    @Override
    public String SayHello() {
        return "Hello i am " + this.name;
    }
}
