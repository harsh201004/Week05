package com.jsonhandling.practiceproblem.convertlistintojsonarray;

import org.json.*;
import java.util.*;

public class ConvertListObjectsIntoJSONArray {

    static  class Student {
        public String name;
        public int age;

        Student (String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("A",18));
        studentList.add(new Student("B",20));

        JSONArray jsonArray = new JSONArray();

        for(Student student : studentList) {
            JSONObject jsonObject = new JSONObject();

            jsonObject.put("name", student.name);
            jsonObject.put("age", student.age);

            jsonArray.put(jsonObject);
        }

        System.out.println("JSON array:\n" + jsonArray.toString());
    }
}
