package com.ias.empresa.core.DomainEmpleadoSalario.models;

import com.ias.empresa.core.DomainEmpleado.models.EmpleadoDTO;

//@Entity
//@Table(name = "empeado salario")
public class EmpleadoSalarioDTO extends EmpleadoDTO {
    // @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idEmpleadoSalario;
    private double sueldoBasico;
    private double PORCENTAJE1 = 0.05;
    private double PORCENTAJE2 = 0.1;
    private int ANOINGRESO1 = 2;
    private int ANOINGRESO2 = 5;


    public EmpleadoSalarioDTO(Integer ideEmpleado, String nombre, String apellido, int añoIngreso, Integer idEmpleadoSalario, double sb, double PORCENTAJE1, double PORCENTAJE2, int ANOINGRESO1, int ANOINGRESO2) {
        super(ideEmpleado, nombre, apellido, añoIngreso);
        this.idEmpleadoSalario = idEmpleadoSalario;
        this.sueldoBasico = sb;
        this.PORCENTAJE1 = PORCENTAJE1;
        this.PORCENTAJE2 = PORCENTAJE2;
        this.ANOINGRESO1 = ANOINGRESO1;
        this.ANOINGRESO2 = ANOINGRESO2;
    }

    public EmpleadoSalarioDTO(Integer idEmpleadoSalario, double sueldoBasico, double PORCENTAJE1, double PORCENTAJE2, int ANOINGRESO1, int ANOINGRESO2) {
        this.idEmpleadoSalario = idEmpleadoSalario;
        this.sueldoBasico = sueldoBasico;
        this.PORCENTAJE1 = PORCENTAJE1;
        this.PORCENTAJE2 = PORCENTAJE2;
        this.ANOINGRESO1 = ANOINGRESO1;
        this.ANOINGRESO2 = ANOINGRESO2;
    }

    public EmpleadoSalarioDTO() {
        super();
    }

    private double porcentajeAdicional(){
    int antiguedad=antieguedadEmpleados();
    double porcentaje=0;
    if (antiguedad > PORCENTAJE2)
        porcentaje = PORCENTAJE2;
    else if (antiguedad > PORCENTAJE1)
        porcentaje = PORCENTAJE1;
    return porcentaje;
    }

    @Override
    public double getSalario() {
        return sueldoBasico + sueldoBasico * porcentajeAdicional();
    }

    public Integer getIdEmpleadoSalario() {
        return idEmpleadoSalario;
    }

    public void setIdEmpleadoSalario(Integer idEmpleadoSalario) {
        this.idEmpleadoSalario = idEmpleadoSalario;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public double getPORCENTAJE1() {
        return PORCENTAJE1;
    }

    public void setPORCENTAJE1(double PORCENTAJE1) {
        this.PORCENTAJE1 = PORCENTAJE1;
    }

    public double getPORCENTAJE2() {
        return PORCENTAJE2;
    }

    public void setPORCENTAJE2(double PORCENTAJE2) {
        this.PORCENTAJE2 = PORCENTAJE2;
    }

    public int getANOINGRESO1() {
        return ANOINGRESO1;
    }

    public void setANOINGRESO1(int ANOINGRESO1) {
        this.ANOINGRESO1 = ANOINGRESO1;
    }

    public int getANOINGRESO2() {
        return ANOINGRESO2;
    }

    public void setANOINGRESO2(int ANOINGRESO2) {
        this.ANOINGRESO2 = ANOINGRESO2;
    }
}
