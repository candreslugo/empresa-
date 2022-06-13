package com.ias.empresa.core.DomainEmpleadoSalario.ports.Out;

import com.ias.empresa.core.DomainEmpleadoSalario.models.EmpleadoSalarioDTO;

import java.util.List;

public interface RepositoryEmpleadoSalario {

    List<EmpleadoSalarioDTO> getEmpleadoSalario();

    void mostrarSlararios();

    double getSalario();

    double porcentajeAdicional();
}
