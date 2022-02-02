package com.example.springapplication.Employees;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Integer> {

    List<EmployeeEntity> findAll();

    Optional<EmployeeEntity> findById(Integer id);

    EmployeeEntity save(EmployeeEntity employeeEntity);
}
