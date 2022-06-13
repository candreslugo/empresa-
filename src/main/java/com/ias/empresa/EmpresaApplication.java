package com.ias.empresa;

import com.ias.empresa.core.DomainEmpleadoSalario.models.EmpleadoSalarioDTO;
import com.ias.empresa.core.DomainEmpresaServices.Empresa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmpresaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmpresaApplication.class, args);

        Empresa empresa = new Empresa();


    }


}
