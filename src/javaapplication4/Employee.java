/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 1793615
 */
public class Employee {
    
    public Map<String, Double> hoursPerProject;
    public String employeeNumber;
    public Integer employeeAge;

    public Employee(String lastName, String firstName, Date dob) {
        this.hoursPerProject = new HashMap();
        this.employeeNumber = buildEmployeeNumber(lastName, firstName, dob);
        this.employeeAge = convertDateToAge(dob);
    }

    private String buildEmployeeNumber(String lastName, String firstName, Date dob) {
        SimpleDateFormat formater = new SimpleDateFormat("yyMMdd");
        return lastName.substring(0, 3).toUpperCase() + firstName.substring(0, 1).toUpperCase() + formater.format(dob);

    }

    public Integer convertDateToAge(Date dob) {
        SimpleDateFormat formater = new SimpleDateFormat("yyyy");
        int currentYear = Integer.parseInt(formater.format(new Date()));
        int dobYear = Integer.parseInt(formater.format(dob));
        return currentYear - dobYear;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public Integer getEmployeeAge() {
        return employeeAge;
    }

    public void setHoursPerProject(String project, Double hours) {
        this.hoursPerProject.put(project, hours);
    }

    public Double getHoursPerProject(String project) {
        return this.hoursPerProject.get(project);
    }

    public Double getAverageHoursPerProject() {
        Double sum = 0.0;
          System.out.println("project hours =" + hoursPerProject);
        for (Double project : hoursPerProject.values()) {
            
           
            System.out.println("project employees=" + project);
            sum += project;
            
        }
        System.out.println("Sumemployees=" + sum +"sum divide= "+  sum / hoursPerProject.size());
       
             if(hoursPerProject.size()>0){
     
         return sum / hoursPerProject.size();
          }
          else
              return 0.0;
    }
}
