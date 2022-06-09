package com.ias.empresa.core.DomainEmpleadoSalario.models;

import com.ias.empresa.core.DomainEmpleado.models.EmpleadoDTO;


import java.time.LocalDate;
//@Entity
//@Table(name = "empeado salario")
public class EmpleadoSalarioDTO extends EmpleadoDTO {
   // @Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEmpleadoSalario;
    private double sueldoBasico;
    private double PORCENTAJE1 = 0.05;
    private double PORCENTAJE2 = 0.1;

    public EmpleadoSalarioDTO(Integer ideEmpleado, String nombre, String apellido, LocalDate añoIngreso,double sb) {
        super(ideEmpleado, nombre, apellido, añoIngreso);
        this.sueldoBasico=sb;
    }

    public EmpleadoSalarioDTO() {
        super();
    }

    @Override
    public double getSalario() {
        return 0;
    }


    private double porcentajeAdicional() {
        return 0;
    }



    public Long getIdEmpleadoSalario() {
        return idEmpleadoSalario;
    }

    public void setIdEmpleadoSalario(Long idEmpleadoSalario) {
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
}
