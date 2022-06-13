package com.ias.empresa.core.DomainEmpladoComision.serviseImplementsEmpleadoComision;

import com.ias.empresa.core.DomainEmpladoComision.models.EmpleadoComisionDTO;
import com.ias.empresa.core.DomainEmpladoComision.ports.in.GetEmpleadoComisionUseCase;
import com.ias.empresa.core.DomainEmpladoComision.ports.out.RepositoryEmpleadoComision;

public class ServiceEmpleadoComision implements GetEmpleadoComisionUseCase {

    private RepositoryEmpleadoComision repositoryEmpleadoComision;

    public ServiceEmpleadoComision(RepositoryEmpleadoComision repositoryEmpleadoComision) {
        this.repositoryEmpleadoComision = repositoryEmpleadoComision;
    }

    @Override
    public EmpleadoComisionDTO excute(EmpleadoComisionDTO empleadoComisionDTO) {
        return null;
    }


    @Override
    public void getsalario() {

    }
}


