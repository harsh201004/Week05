package com.jsonhandling.practiceproblem.mergeteojsonobject;

import org.json.*;

public class MergeJSONObjectsIntoOne {
    public static void main(String[] args) {
        JSONObject jo1 = new JSONObject();

        jo1.put("name", "A");
        jo1.put("age", "20");
        jo1.put("Experience", "2 years");

        JSONObject jo2 = new JSONObject();
        jo2.put("Department", "IT");


        for (String key : jo2.keySet()) {
            jo1.put(key, jo2.get(key));
        }

        System.out.println("Merged JSON object: \n" + jo1.toString());
    }
}
