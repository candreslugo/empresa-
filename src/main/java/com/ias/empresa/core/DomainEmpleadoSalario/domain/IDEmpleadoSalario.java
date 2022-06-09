package com.ias.empresa.core.DomainEmpleadoSalario.domain;

public class IDEmpleadoSalario {

    private final Integer value;

    public IDEmpleadoSalario(Integer value) {
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
