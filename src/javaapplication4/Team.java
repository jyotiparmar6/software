/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 1793615
 */
public class Team {
    public Map<String, Employee> employees;

    public Team() {
        this.employees = new HashMap<>();
    }

    public Collection<Employee>getEmployee() {
        return employees.values();
    }

    public void addEmployee(String lastName, String firstName, Date dob) {
        addEmployee(new Employee(lastName, firstName, dob));
    }

    public void addEmployee(Employee employee) {
        employees.put(employee.employeeNumber, employee);
    }

    public Employee getEmployeeByEmployeeNumber(String employeeNumber) {
        return employees.get(employeeNumber);
    }

    public Double getTeamAverageHoursPerProject() {
        double sum = 0.0;
        for (Employee employee : employees.values()) {
            
            sum = sum+employee.getAverageHoursPerProject();
            
           
        }
         System.out.println("Sumteam=" + sum);
          if(employees.size()>0){
        return sum / employees.size();
          }
          else
              return 0.0;
    }

}
