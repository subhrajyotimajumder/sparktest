package com.spark.test.main;

import static spark.Spark.*;

/**
 * Created by subhrajyoti_majumder on 15/03/16.
 */
public class ExceptionMapping {
    public static void main(String[] args) {
        get("/throwexception", (request, response) -> {
            throw new RuntimeException();
        });

        exception(RuntimeException.class, (e, request, response) -> {
            response.status(404);
            response.body("Resource not found");
        });
    }
}
