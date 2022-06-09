package com.ias.empresa.core.DomainEmpladoComision.domain;

public class SalarioMinimo {

    private final Integer value;

    public SalarioMinimo(Integer value) {
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
