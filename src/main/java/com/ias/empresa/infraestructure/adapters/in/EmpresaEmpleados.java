package com.ias.empresa.infraestructure.adapters.in;

import com.ias.empresa.core.DomainEmpladoComision.ports.out.RepositoryEmpleadoComision;
import com.ias.empresa.core.DomainEmpleado.models.EmpleadoDTO;
import com.ias.empresa.core.DomainEmpleado.ports.out.RepositoryEmpleado;

import com.ias.empresa.core.DomainEmpleadoSalario.ports.Out.RepositoryEmpleadoSalario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class EmpresaEmpleados {

    private RepositoryEmpleado repositoryEmpleado;
    private RepositoryEmpleadoSalario repositoryEmpleadoSalario;
    private RepositoryEmpleadoComision repositoryEmpleadoComision;
    private ArrayList<EmpleadoDTO> empleadoDTOS;


    double getSalario() {
        return 0;
    }

    double porcentajeAdicional() {
        return 0;
    }

    void agregarempleado(EmpleadoDTO empleadoDTO) {

    }

    EmpleadoDTO empleadoConMasClientes() {
        return null;
    }

    public String mostrarSalarios() {
        for (EmpleadoDTO empleado : empleadoDTOS) {
            return empleado.nombreCompleto() + ": $" + empleado.getSalario();
        }
        return mostrarSalarios();
    }

}
