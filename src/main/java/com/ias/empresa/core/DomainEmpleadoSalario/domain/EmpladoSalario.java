package com.ias.empresa.core.DomainEmpleadoSalario.domain;

public class EmpladoSalario {
    private final IDEmpleadoSalario idEmpleadoSalario;
    private final SueldoBasico sueldoBasico;

    public EmpladoSalario(IDEmpleadoSalario idEmpleadoSalario, SueldoBasico sueldoBasico) {
        this.idEmpleadoSalario = idEmpleadoSalario;
        this.sueldoBasico = sueldoBasico;
    }

    public IDEmpleadoSalario getIdEmpleadoSalario() {
        return idEmpleadoSalario;
    }

    public SueldoBasico getSueldoBasico() {
        return sueldoBasico;
    }

    @Override
    public String toString() {
        return "EmpladoSalario{" +
                "idEmpleadoSalario=" + idEmpleadoSalario +
                ", sueldoBasico=" + sueldoBasico +
                '}';
    }
}
