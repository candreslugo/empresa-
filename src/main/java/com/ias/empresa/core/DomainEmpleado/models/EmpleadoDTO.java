package com.ias.empresa.core.DomainEmpleado.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class EmpleadoDTO {
    private Integer ideEmpleado;
    private String nombre;
    private String apellido;
    private int añoIngreso;

    public EmpleadoDTO(Integer ideEmpleado, String nombre, String apellido,int añoIngreso) {
        this.ideEmpleado = ideEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.añoIngreso = añoIngreso;
    }

    public EmpleadoDTO() {

    }

    public String nombreCompleto(){
        return nombre + "" + apellido;
    }


    public  abstract double getSalario();


    public int antieguedadEmpleados(){
        int anioActual = LocalDate.now().getYear();
        return anioActual - añoIngreso;
    }

    public Integer getIdeEmpleado() {
        return ideEmpleado;
    }

    public void setIdeEmpleado(Integer ideEmpleado) {
        this.ideEmpleado = ideEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getAñoIngreso() {
        return añoIngreso;
    }

    public void setAñoIngreso(int añoIngreso) {
        this.añoIngreso = añoIngreso;
    }
}
