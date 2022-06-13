package com.ias.empresa.core.DomainEmpladoComision.ports.in;

import com.ias.empresa.Commons.UseCase;
import com.ias.empresa.core.DomainEmpladoComision.models.EmpleadoComisionDTO;

public interface GetEmpleadoComisionUseCase extends UseCase<EmpleadoComisionDTO,EmpleadoComisionDTO> {

    void getsalario();

}
