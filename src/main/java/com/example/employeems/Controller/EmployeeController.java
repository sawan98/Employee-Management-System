package com.example.employeems.Controller;

import com.example.employeems.DTO.EmployeeDTO;
import com.example.employeems.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/employee")

public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    //to pass http types get,post,put,delete
    @PostMapping(value="/saveEmployee")
    public ResponseEntity saveEmployee(@RequestBody EmployeeDTO employeeDTO){

        try {
            String res= employeeService.saveEmployee(employeeDTO);
            
            if(res.equals("00")){
                
            } else if (res.equals("06")) {
                
            }
        }catch (){

        }
    }
}
