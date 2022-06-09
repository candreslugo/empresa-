package com.ias.empresa.core.DomainEmpladoComision.domain;

public class ClientesCaptados {
     private final Integer value;

    public ClientesCaptados(Integer value) {
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
