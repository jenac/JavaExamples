package org.jenac.java.examples.dagger.models;

import lombok.Getter;

public class Brand {
    @Getter
    private String name;

    public Brand(String name) {
        this.name = name;
    }
}
