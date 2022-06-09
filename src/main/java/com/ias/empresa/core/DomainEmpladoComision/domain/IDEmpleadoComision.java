package com.ias.empresa.core.DomainEmpladoComision.domain;

public class IDEmpleadoComision {
    private final Integer value;

    public IDEmpleadoComision(Integer value) {
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
