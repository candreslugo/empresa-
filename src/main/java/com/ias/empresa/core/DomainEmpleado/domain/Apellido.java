package com.ias.empresa.core.DomainEmpleado.domain;

public class Apellido {

   private final String value;

    public Apellido(String value) {
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
