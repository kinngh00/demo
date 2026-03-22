package com.example.study.day7.fourth.controller;

import com.example.study.day7.fourth.entity.Employee;
import com.example.study.day7.fourth.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
  private EmployeeRepository employeeRepository;

  public EmployeeController(EmployeeRepository employeeRepository) {
    this.employeeRepository = employeeRepository;
  }

  @PostMapping
  public Employee createEmployee(@RequestBody Employee newEmployee) {
    return employeeRepository.save(newEmployee);
  }

  @GetMapping("/search")
  public List<Employee> getEmployee(@RequestParam(required = true) String dept, @RequestParam(required = true) int minSalary) {
    return employeeRepository.findByDepartmentAndSalaryGreaterThanEqual(dept, minSalary);
  }

  @PatchMapping("/{id}")
  public Employee updateSalary(@PathVariable Long id, @RequestBody Employee updateEmployee) {
    Employee employee = employeeRepository.findById(id).orElseThrow();
    employee.setSalary(updateEmployee.getSalary());

    return employeeRepository.save(employee);
  }

  @DeleteMapping("/{id}")
  public void deleteEmployee(@PathVariable Long id) {
    employeeRepository.deleteById(id);
  }
}
