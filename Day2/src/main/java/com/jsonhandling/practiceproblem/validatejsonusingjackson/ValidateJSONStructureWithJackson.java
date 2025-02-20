package com.jsonhandling.practiceproblem.validatejsonusingjackson;

import com.fasterxml.jackson.databind.*;

import java.io.File;

public class ValidateJSONStructureWithJackson {

    static class Student {
         public String name;
         public int age;
         public int experience;
         public String department;
    }

    public static void main(String[] args) {

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Convert JSON string to Student object
            Student student = objectMapper.readValue(new File("C:\\Users\\harsh\\OneDrive\\Desktop\\Training\\Week5\\Day2\\src\\main\\java\\com\\jsonhandling\\practiceproblem\\validatejsonusingjackson\\StudentDetails.json"), Student.class);
            System.out.println(" Valid JSON: " + student.name + ", Age: " + student.age + ", Experience: " + student.experience + ", Department: " + student.department);
        } catch (Exception e) {
            System.out.println(" Invalid JSON: " + e.getMessage());
        }
    }
}
