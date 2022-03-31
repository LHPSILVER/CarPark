package com.example.carparkproject.Controller;

import com.example.carparkproject.DTO.EmployeeDTO;
import com.example.carparkproject.Service.EmployeeService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/Employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/listEmployee")
    public List<EmployeeDTO> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @GetMapping("/findEmployeeById")
    public EmployeeDTO getEmployeeById(@RequestParam Integer id){
        return employeeService.getEmployeeById(id);
    }

    @PostMapping("/addEmployee")
    public void addEmployee(@RequestBody EmployeeDTO employeeDTO){
        employeeService.addEmployee(employeeDTO);
    }

    // edit dung PutMapping

}
