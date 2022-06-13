package com.ias.empresa.core.DomainEmpresaServices;

import com.ias.empresa.core.DomainEmpleado.models.EmpleadoDTO;


import java.util.ArrayList;

public class Empresa {

    private ArrayList<EmpleadoDTO> empleadoDTOS;

    public Empresa(){
        this.empleadoDTOS=new ArrayList<>();
    }

    public void agregarEmpleado(EmpleadoDTO empleadoDTO){
        this.empleadoDTOS.add(empleadoDTO);
    }

    public String mostrarSalarios(){
        for (EmpleadoDTO empleado:empleadoDTOS) {
          return empleado.nombreCompleto()+": $"+empleado.getSalario();
        }
  return mostrarSalarios();
    }

    public EmpleadoDTO empleadosConMasClientes(){
        return  null;//
    }
}
