package com.example.springapplication.Employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
@ControllerAdvice
@RequestMapping("/employees")
public class EmployeeController {

    public Logger logger = LogManager.getLogger(EmployeeController.class);
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/getEmployees")
    public List<EmployeeEntity> getEmployees(){
        logger.info("Fetching the list of all the employees");
        List<EmployeeEntity> test = employeeRepository.findAll();
        logger.info("Returned the list of all employees");
        return test;
    }

    @GetMapping("/employee/{id}")
    public Optional<EmployeeEntity> getById(@PathVariable Integer id){
        logger.info("Fetching the employee record with ID : {}", id);
        Optional<EmployeeEntity> entity = employeeRepository.findById(id);
        if(entity.isPresent()) {
            return entity;
        }else {
            throw new NoEmployeeFoundException("Employee with id " + id + " not found");
        }
    }

    @PostMapping("/addEmployee")
    public String addEmployee(@RequestBody EmployeeEntity employeeEntity){
        logger.info("Adding a new employee");
        employeeRepository.save(new EmployeeEntity(employeeEntity.getFirstName(), employeeEntity.getLastName()));
        return "success";
    }

    @ExceptionHandler(NoEmployeeFoundException.class)
    public ResponseEntity<String> handleEmployeeNotFoundCase(NoEmployeeFoundException exception){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());
    }

}
