package ru.job4j.di.annotation;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Pet<Cat> {
    private String name = "Cat";
    @Override
    public String print() {
        return "Cat name = %s".formatted(name);
    }
}
