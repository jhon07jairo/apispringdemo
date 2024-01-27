package com.apiexample.demo.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class EmployeeResponse {
    private String status;

    @JsonProperty("data")
    public List<Employee> employees;

    private String message;
}
