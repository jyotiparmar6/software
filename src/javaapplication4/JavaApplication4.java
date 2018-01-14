/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 1793615
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws ParseException {
         SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
        Team testee = new Team();

        System.out.println("addEmployee");

        String lastName = "Zaier";
        String firstName = "Zied";
        Date dob = new Date();
        

      //  testee.addEmployee(lastName, firstName, dob);

        System.out.println(testee.getEmployee().size());
        System.out.println("addEmployee");

        Employee student = new Employee("Zdfgaiedfgr", "Zieddfg", new Date());

       //testee.addEmployee(student);

        System.out.println(testee.getEmployee().size());
        System.out.println("getEmployeeByEmployeeNumber");

        Employee employee = new Employee("Zaier", "Zied", formater.parse("12/12/1977"));

        String permCode = employee.getEmployeeNumber();
      // employee.setHoursPerProject("Mobile App", 70.0);

        testee.addEmployee(employee);

        System.out.println(testee.getEmployee().size());

        Employee result = testee.getEmployeeByEmployeeNumber(permCode);

        System.out.println(result);

        result = testee.getEmployeeByEmployeeNumber("XXXX111111");
        System.out.println(result);
        System.out.println("getTeamAverageHoursPerProject");
        
        Employee employee1 = new Employee("kuljeet", "Gill", new Date());
        employee1.setHoursPerProject("Mobile App", 70.0);
        employee1.setHoursPerProject("Web App", 50.0);
        testee.addEmployee(employee1);
        
           
        Employee employee2 = new Employee("karwar", "singh", new Date());
        employee2.setHoursPerProject("Mobile App", 30.0);
        employee2.setHoursPerProject("Web App", 120.0);
        testee.addEmployee(employee2);
        
           
        Employee employee3 = new Employee("kjfhsjkd", "Gsdfsfill", new Date());
        employee3.setHoursPerProject("Mobile App", 60.0);
        employee3.setHoursPerProject("Web App", 30.0);
        testee.addEmployee(employee3);
        
        System.out.println(testee.getEmployee().size());;
        
        Double sum = employee1.getAverageHoursPerProject() +employee2.getAverageHoursPerProject() +employee3.getAverageHoursPerProject();
        Double expResult = sum/3;
        System.out.println(expResult);
        Double result2 = testee.getTeamAverageHoursPerProject();
        System.out.println(result2);
        

    }

}
