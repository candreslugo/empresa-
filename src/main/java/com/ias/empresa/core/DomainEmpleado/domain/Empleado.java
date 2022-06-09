package com.ias.empresa.core.DomainEmpleado.domain;

public class Empleado {

    private final IDEmpleado idEmpleado;
    private final Nombre nombre;
    private final Apellido apellido;
    private final AñoIngreso añoIngreso;

    public Empleado(IDEmpleado idEmpleado, Nombre nombre, Apellido apellido, AñoIngreso añoIngreso) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.añoIngreso = añoIngreso;
    }

    public IDEmpleado getIdEmpleado() {
        return idEmpleado;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Apellido getApellido() {
        return apellido;
    }

    public AñoIngreso getAñoIngreso() {
        return añoIngreso;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "idEmpleado=" + idEmpleado +
                ", nombre=" + nombre +
                ", apellido=" + apellido +
                ", añoIngreso=" + añoIngreso +
                '}';
    }
}
