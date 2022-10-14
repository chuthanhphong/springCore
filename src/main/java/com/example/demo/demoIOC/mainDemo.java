package com.example.demo.demoIOC;

public class mainDemo {
    public static void main(String[] args) {
        CustomerIOC ioc = new CustomerIOC("phong");
        CustomerIOC emp = new CustomerIOC("Thanh");

        IocDemo demo = new IocDemo();

        demo.setEmployee(new Employee("name"));
        System.out.println(demo.getEmployee().SayHello());
    }


}
