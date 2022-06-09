package com.ias.empresa.core.DomainEmpleado.domain;

public class IDEmpleado {

    private final Integer value;

    public IDEmpleado(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
