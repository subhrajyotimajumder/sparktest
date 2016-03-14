package com.spark.test.main;

import static spark.Spark.*;

/**
 * Created by subhrajyoti_majumder on 15/03/16.
 */
public class AfterFilter {
    public static void main(String[] args) {

        after((request, response) -> {
            response.header("foo", "set by after filter");
        });

        get("/hello", (request, response) -> "find header parameter foo");
    }
}
