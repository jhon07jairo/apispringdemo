package com.apiexample.demo.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    public void getAnnualSalary() {
        // Arrange
        //int employeeSalary = 50000;
        Employee employee = new Employee(1, "Tiger Nixon",320800,61,"");

        // Act
        double annualSalary = employee.getAnnualSalary();

        // Assert
        assertEquals(3849600.0, annualSalary, 0.001);
    }
}