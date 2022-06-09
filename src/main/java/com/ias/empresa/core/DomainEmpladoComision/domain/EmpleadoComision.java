package com.ias.empresa.core.DomainEmpladoComision.domain;

public class EmpleadoComision {
    private final IDEmpleadoComision idEmpleadoComision;
    private final ClientesCaptados clientesCaptados;
    private final MontoPorCliente montoPorCliente;
    private final SalarioMinimo salarioMinimo;

    public EmpleadoComision(IDEmpleadoComision idEmpleadoComision, ClientesCaptados clientesCaptados, MontoPorCliente montoPorCliente, SalarioMinimo salarioMinimo) {
        this.idEmpleadoComision = idEmpleadoComision;
        this.clientesCaptados = clientesCaptados;
        this.montoPorCliente = montoPorCliente;
        this.salarioMinimo = salarioMinimo;
    }

    public IDEmpleadoComision getIdEmpleadoComision() {
        return idEmpleadoComision;
    }

    public ClientesCaptados getClientesCaptados() {
        return clientesCaptados;
    }

    public MontoPorCliente getMontoPorCliente() {
        return montoPorCliente;
    }

    public SalarioMinimo getSalarioMinimo() {
        return salarioMinimo;
    }

    @Override
    public String toString() {
        return "EmpleadoComision{" +
                "idEmpleadoComision=" + idEmpleadoComision +
                ", clientesCaptados=" + clientesCaptados +
                ", montoPorCliente=" + montoPorCliente +
                ", salarioMinimo=" + salarioMinimo +
                '}';
    }
}
