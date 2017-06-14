package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {
    private B b;
    private C c;
    @Autowired
    private D d;

    @Autowired//constructor injection
    public A(B b) {
        this.b = b;
        System.out.println("B created");
    }

    @Autowired//setter injection
    public void setC(C c) {
        this.c = c;
        System.out.println("C created");
    }

    public void displayD() {
        System.out.println("d created");
    }
}