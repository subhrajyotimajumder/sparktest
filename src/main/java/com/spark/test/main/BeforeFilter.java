package com.spark.test.main;

import static spark.Spark.*;

/**
 * Created by subhrajyoti_majumder on 15/03/16.
 */
public class BeforeFilter {
    public static void main(String[] args) {

        before((request, response) -> {
            boolean authenticated = false;
            // ... check if authenticated
            if (!authenticated) {
                halt(401, "You are not welcome here");
            }
        });

        get("/iamimmune",(request, response) -> "IMMUNITY");
    }
}
