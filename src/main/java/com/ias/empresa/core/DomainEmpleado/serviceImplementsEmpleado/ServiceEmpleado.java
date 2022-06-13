package com.ias.empresa.core.DomainEmpleado.serviceImplementsEmpleado;

import com.ias.empresa.core.DomainEmpladoComision.models.EmpleadoComisionDTO;
import com.ias.empresa.core.DomainEmpladoComision.ports.in.GetEmpleadoComisionUseCase;
import com.ias.empresa.core.DomainEmpleado.ports.in.GetEmpleado;
import com.ias.empresa.core.DomainEmpleadoSalario.models.EmpleadoSalarioDTO;
import com.ias.empresa.core.DomainEmpleadoSalario.ports.In.GetEmpleadoSalario;

public class ServiceEmpleado implements GetEmpleadoSalario {


    private final GetEmpleado getEmpleado;
    private final GetEmpleadoSalario getEmpleadoSalario;
    private final GetEmpleadoComisionUseCase getEmpleadoComisionUseCase;

    public ServiceEmpleado(GetEmpleado getEmpleado, GetEmpleadoSalario getEmpleadoSalario, GetEmpleadoComisionUseCase getEmpleadoComisionUseCase) {
        this.getEmpleado = getEmpleado;
        this.getEmpleadoSalario = getEmpleadoSalario;
        this.getEmpleadoComisionUseCase = getEmpleadoComisionUseCase;
    }


    @Override
    public EmpleadoSalarioDTO excute(EmpleadoSalarioDTO empleadoSalarioDTO) {
        return null;
    }
}
