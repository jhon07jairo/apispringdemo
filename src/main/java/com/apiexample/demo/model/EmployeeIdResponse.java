package com.apiexample.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class EmployeeIdResponse {

    private String status;

    @JsonProperty("data")
    public Employee employee;

    private String message;

    public EmployeeIdResponse(String status, Employee employee, String message) {
        this.status = status;
        this.employee = employee;
        this.message = message;
    }
}
