package com.ias.empresa.core.DomainEmpleadoSalario.serviceImplementsEmpleadoSalarioFijo;

import com.ias.empresa.core.DomainEmpleadoSalario.models.EmpleadoSalarioDTO;
import com.ias.empresa.core.DomainEmpleadoSalario.ports.In.GetEmpleadoSalario;
import com.ias.empresa.core.DomainEmpleadoSalario.ports.Out.RepositoryEmpleadoSalario;

public class ServiceEmpleadoSalarioFijo implements GetEmpleadoSalario {

    private RepositoryEmpleadoSalario repositoryEmpleadoSalario;

    public ServiceEmpleadoSalarioFijo(RepositoryEmpleadoSalario repositoryEmpleadoSalario) {
        this.repositoryEmpleadoSalario = repositoryEmpleadoSalario;
    }

    @Override
    public EmpleadoSalarioDTO excute(EmpleadoSalarioDTO empleadoSalarioDTO) {
        return null;
    }
}
