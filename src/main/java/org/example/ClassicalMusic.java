package org.example;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class ClassicalMusic implements Music {

    public static ClassicalMusic getClassicalMusic() {
        System.out.println("Factory method called ALARMMMMMMMMMMMMMMMMMMM");
        return new ClassicalMusic();
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("Class ClassicalMusic created");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Class ClassicalMusic destroyed");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
