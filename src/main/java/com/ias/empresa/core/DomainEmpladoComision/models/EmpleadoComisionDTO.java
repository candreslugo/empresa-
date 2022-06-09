package com.ias.empresa.core.DomainEmpladoComision.models;

import com.ias.empresa.core.DomainEmpleado.models.EmpleadoDTO;

import java.time.LocalDate;

public class EmpleadoComisionDTO extends EmpleadoDTO {

    private Integer idemplaedoComision;
    private Integer clientesCaptados;
    private Integer montoPorCliente;
    private Integer salarioMinimo;

    public EmpleadoComisionDTO(Integer ideEmpleado, String nombre, String apellido, LocalDate añoIngreso, Integer idemplaedoComision, Integer clientesCaptados, Integer montoPorCliente, Integer salarioMinimo) {
        super(ideEmpleado, nombre, apellido, añoIngreso);
        this.idemplaedoComision = idemplaedoComision;
        this.clientesCaptados = clientesCaptados;
        this.montoPorCliente = montoPorCliente;
        this.salarioMinimo = salarioMinimo;
    }



    @Override
    public double getSalario() {
        return 0;
    }



    public Integer getIdemplaedoComision() {
        return idemplaedoComision;
    }

    public void setIdemplaedoComision(Integer idemplaedoComision) {
        this.idemplaedoComision = idemplaedoComision;
    }

    public Integer getClientesCaptados() {
        return clientesCaptados;
    }

    public void setClientesCaptados(Integer clientesCaptados) {
        this.clientesCaptados = clientesCaptados;
    }

    public Integer getMontoPorCliente() {
        return montoPorCliente;
    }

    public void setMontoPorCliente(Integer montoPorCliente) {
        this.montoPorCliente = montoPorCliente;
    }

    public Integer getSalarioMinimo() {
        return salarioMinimo;
    }

    public void setSalarioMinimo(Integer salarioMinimo) {
        this.salarioMinimo = salarioMinimo;
    }



}
