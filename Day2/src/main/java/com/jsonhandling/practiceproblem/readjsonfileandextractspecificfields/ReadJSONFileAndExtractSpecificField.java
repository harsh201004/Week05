package com.jsonhandling.practiceproblem.readjsondileandextractspecificfields;

import org.json.*;
import java.nio.file.*;

public class ReadJSONFileAndExtractSpecificField {
    public static void main(String[] args) {
        try {
            // Read JSON file as a String
            String content = new String(Files.readAllBytes(Paths.get("C:\\Users\\harsh\\OneDrive\\Desktop\\Training\\Week5\\Day2\\src\\main\\java\\com\\jsonhandling\\practiceproblem\\readjsondileandextractspecificfields\\Data.json")));

            // Convert to JSON object
            JSONObject json = new JSONObject(content);

            // Extract specific fields
            String name = json.getString("name");
            String email = json.getString("email");

            // Print results
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
