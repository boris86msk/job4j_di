package ru.job4j.di.model;

import org.springframework.stereotype.Component;
import ru.job4j.di.model.Store;

@Component
public class StartUI {
    private Store store;

    public StartUI(Store store) {
        this.store = store;
    }

    public void add(String value) {
        store.add(value);
    }

    public void print() {
        store.getAll().forEach(System.out::println);
    }
}
