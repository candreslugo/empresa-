package com.ias.empresa.core.DomainEmpladoComision.ports.out;

import com.ias.empresa.core.DomainEmpladoComision.domain.EmpleadoComision;

import java.util.List;

public interface RepositoryEmpleadoComision{

    List<EmpleadoComision> getEmpleadoComision(EmpleadoComision empleadoComision);



}
