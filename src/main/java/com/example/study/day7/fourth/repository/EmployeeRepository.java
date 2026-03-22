package com.example.study.day7.fourth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.study.day7.fourth.entity.Employee;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
  List<Employee> findByDepartmentAndSalaryGreaterThanEqual(String department, int Salary);
}
