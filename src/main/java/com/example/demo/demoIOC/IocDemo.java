package com.example.demo.demoIOC;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IocDemo {

    private CustomerIOC customerIOC;
    private Employee employee;


}
