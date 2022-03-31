package com.example.carparkproject.Service;

import com.example.carparkproject.DTO.EmployeeDTO;

import java.util.List;

public interface EmployeeService {

    void addEmployee(EmployeeDTO employeeDTO);

    List<EmployeeDTO> getAllEmployee();

    EmployeeDTO getEmployeeById(Integer id);

}
