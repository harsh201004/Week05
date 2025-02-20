package com.jsonhandling.practiceproblem.createjsonobject;

import org.json.*;

public class CreateJSONObject {
    public static void main(String[] args) {
        JSONObject student = new JSONObject();
        student.put("Name", "A");
        student.put("Age", "19");

        JSONArray subjects = new JSONArray();
        subjects.put("Physics");
        subjects.put("Chemistry");
        subjects.put("Maths");
        subjects.put("English");
        subjects.put("Hindi");

        student.put("Subject", subjects);

        System.out.println(student.toString());

    }
}
