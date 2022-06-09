package com.ias.empresa.core.DomainEmpladoComision.domain;

public class MontoPorCliente {

    private final Integer value;

    public MontoPorCliente(Integer value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
