package com.apiexample.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Employee {

    private Integer id;

    @JsonProperty ("employee_name")
    private String employeeName;

    @JsonProperty ("employee_salary")
    private Integer employeeSalary;

    @JsonProperty ("employee_age")
    private Integer employeeAge;

    @JsonProperty ("profile_image")
    private String profileImage;

    @JsonProperty ("employee_annual_salary")
    public double getAnnualSalary() {
        return Math.round(employeeSalary * 12);
    }

    public Employee(Integer id, String employeeName, Integer employeeSalary, Integer employeeAge, String profileImage) {
        this.id = id;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        this.employeeAge = employeeAge;
        this.profileImage = profileImage;
    }
}
