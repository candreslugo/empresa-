package com.ias.empresa.core.DomainEmpleado.ports.out;

import com.ias.empresa.core.DomainEmpleado.models.EmpleadoDTO;

import java.util.List;

public interface RepositoryEmpleado {

    List<EmpleadoDTO> getEmpleado(EmpleadoDTO empleadoDTO);

    void agregarempleado(EmpleadoDTO empleadoDTO);

    double getSalario();

    double porcentajeAdicional();

    EmpleadoDTO empleadoConMasClientes();

    String mostrarSalarios();

}
