
package com.mycompany.testperson;

public class TestPerson {

    public static void main(String[] args) 
    {
        // Creating a Student object
        Students student = new Students();
        student.setName("John Doe");
        student.setID(1001);
        student.setCourse("Computer Science");

        // Creating a Lecturer object
        Lecturer lecturer = new Lecturer();
        lecturer.setName("Dr. Jane Smith");
        lecturer.setID(2001);
        lecturer.setProgramme("Software Engineering");

        // Printing details of the Student and Lecturer
        System.out.println("Student Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("ID: " + student.getID());
        System.out.println("Course: " + student.getCourse());

        System.out.println("\nLecturer Details:");
        System.out.println("Name: " + lecturer.getName());
        System.out.println("ID: " + lecturer.getID());
        System.out.println("Programme: " + lecturer.getProgramme());
    }
    }

