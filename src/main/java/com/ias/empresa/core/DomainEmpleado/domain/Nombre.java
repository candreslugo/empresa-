package com.ias.empresa.core.DomainEmpleado.domain;

public class Nombre {

    private final String value;

    public Nombre(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
