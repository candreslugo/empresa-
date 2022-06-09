package com.ias.empresa.core.DomainEmpleadoSalario.domain;

public class SueldoBasico {

    private  final Integer value;

    public SueldoBasico(Integer value) {
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
