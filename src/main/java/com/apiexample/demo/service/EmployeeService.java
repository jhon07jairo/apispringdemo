package com.apiexample.demo.service;

import com.apiexample.demo.model.EmployeeIdResponse;
import com.apiexample.demo.model.EmployeeResponse;

public interface EmployeeService {
    EmployeeResponse findAll();
    EmployeeIdResponse findById(Integer id);
}
