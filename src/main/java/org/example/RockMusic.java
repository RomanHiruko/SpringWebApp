package org.example;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("Class RockMusic created");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Class RockMusic destroyed");
    }
}
