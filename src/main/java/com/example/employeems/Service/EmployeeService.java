package com.example.employeems.Service;

import com.example.employeems.DTO.EmployeeDTO;
import com.example.employeems.Entity.Employee;
import com.example.employeems.Repo.EmployeeRepo;
import com.example.employeems.Util.VarList;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private ModelMapper modelMapper;

    public String saveEmployee(EmployeeDTO employeeDTO){

        if(employeeRepo.existsById(employeeDTO.getEmpID())){

            return VarList.Response_Duplicated ;
        }else{

            employeeRepo.save(modelMapper.map(employeeDTO,Employee.class));
            return VarList.Response_success;
        }
    }
}
