package com.example.employeems.Repo;

import com.example.employeems.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

//entity type-employee, type of primary key-int
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
}
