

package com.mycompany.testemployee;


public class TestEmployee {

    public static void main(String[] args) 
    {
        // Creating objects for Mr. Bogdan and Ms. Bird
        Employee bogdan = new Employee();
        Employee bird = new Employee();

        // Setting required values using setters
        bogdan.setEmpID(101);
        bogdan.setEmpName("Mr. Bogdan");
        bogdan.setEmpDesignation("Software Engineer");

        bird.setEmpID(102);
        bird.setEmpName("Ms. Bird");
        bird.setEmpDesignation("HR Manager");

        // Printing the details using getters
        System.out.println("Mr. Bogdan Details:");
        System.out.println("Employee ID: " + bogdan.getEmpID());
        System.out.println("Employee Name: " + bogdan.getEmpName());
        System.out.println("Employee Designation: " + bogdan.getEmpDesignation());

        System.out.println("\nMs. Bird Details:");
        System.out.println("Employee ID: " + bird.getEmpID());
        System.out.println("Employee Name: " + bird.getEmpName());
        System.out.println("Employee Designation: " + bird.getEmpDesignation());
    }
    }

