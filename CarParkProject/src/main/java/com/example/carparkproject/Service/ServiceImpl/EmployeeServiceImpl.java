package com.example.carparkproject.Service.ServiceImpl;

import com.example.carparkproject.DTO.EmployeeDTO;
import com.example.carparkproject.Entity.Employee;
import com.example.carparkproject.Repository.EmployeeRepository;
import com.example.carparkproject.Service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository, ModelMapper modelMapper) {
        this.employeeRepository = employeeRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void addEmployee(EmployeeDTO employeeDTO) {
        //map Entity -> DTO
        Employee employee = modelMapper.map(employeeDTO, Employee.class);
        employeeRepository.save(employee);

    }

    @Override
    public List<EmployeeDTO> getAllEmployee() {
        return  employeeRepository.getAllEmployee().stream().map(item -> modelMapper.map(item, EmployeeDTO.class)).collect(Collectors.toList());
    }

    @Override
    public EmployeeDTO getEmployeeById(Integer id) {
        EmployeeDTO employeeDTO = modelMapper.map(employeeRepository.getEmployeeByEmployeeId(id),EmployeeDTO.class);
        return employeeDTO;
    }
}
