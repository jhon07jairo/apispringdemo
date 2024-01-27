package com.apiexample.demo.controller;

import com.apiexample.demo.model.EmployeeIdResponse;
import com.apiexample.demo.model.EmployeeResponse;
import com.apiexample.demo.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/employees")
    public EmployeeResponse findAll(){
        return this.employeeService.findAll();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/employee/{id}")
    public EmployeeIdResponse findById(@PathVariable("id") Integer id) {
        return this.employeeService.findById(id);
    }
}


