package com.example.carparkproject.Repository;

import com.example.carparkproject.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    @Query("SELECT e from Employee e")
    List<Employee> getAllEmployee();

    @Query("SELECT e from Employee e WHERE e.employeeId=:id")
    Employee getEmployeeByEmployeeId(Integer id);

    @Query("SELECT e from Employee e WHERE e.employeeName=:name")
    List<Employee> getEmployeeByName(String name);

    @Query("DELETE FROM Employee e WHERE e.employeeId=:id")
    Employee deleteEmployeeById(Integer id);
}
