package com.spark.test.main.json.transform;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

/**
 * Created by subhrajyoti_majumder on 15/03/16.
 */
public class JsonGet {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "hello");
        map.put(2, "world");


        get("/hellojson", "application/json", ((request, response) -> map) , new JsonTransformer());
    }
}
