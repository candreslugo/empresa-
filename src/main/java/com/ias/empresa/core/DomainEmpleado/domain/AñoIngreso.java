package com.ias.empresa.core.DomainEmpleado.domain;

public class AñoIngreso {

    private  final Integer value;

    public AñoIngreso(Integer value) {
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
