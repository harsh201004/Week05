package com.jsonhandling.practiceproblem.parsejasonandfilter;

import org.json.*;
import java.io.*;
import java.nio.file.*;

public class ParseJSONAndFilter {
    public static void main(String[] args) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get("C:\\Users\\harsh\\OneDrive\\Desktop\\Training\\Week5\\Day2\\src\\main\\java\\com\\jsonhandling\\practiceproblem\\parsejasonandfilter\\Details.json")));

        JSONArray jsonArray = new JSONArray(content);
        JSONArray filteredArray = new JSONArray();

        // Filter JSON objects where age > 25
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject obj = jsonArray.getJSONObject(i);
            if (obj.getInt("age") > 25) {
                filteredArray.put(obj);
            }
        }
        // Print filtered JSON array
        System.out.println("Filtered JSON where age > 25:\n" + filteredArray.toString(2));
    }
}
