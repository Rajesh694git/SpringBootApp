package com.example.springapplication.Employees;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NoEmployeeFoundException extends RuntimeException{

    public NoEmployeeFoundException(String errorMessage){
        super(errorMessage);
    }

}
