package com.jsonhandling.practiceproblem.convertjavaobjectintojson;

import org.json.JSONObject;

public class ObjectConvertionMain {
    public static void main(String[] args) {
        ConvertJavaObjectIntoJSON car = new ConvertJavaObjectIntoJSON("Land Lover", "Range Rover");

        JSONObject carJSONObj = new JSONObject();
        carJSONObj.put("branch", car.brand);
        carJSONObj.put("model", car.model);
        System.out.println(carJSONObj.toString());
    }
}
