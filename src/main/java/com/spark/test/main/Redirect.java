package com.spark.test.main;

import static spark.Spark.*;

/**
 * Created by subhrajyoti_majumder on 15/03/16.
 */
public class Redirect {

    public static void main(String[] args) {
        get("/foo",(request, response) -> {
            response.redirect("/bar", 301);
            return "foo";
        });

        get("/bar",(request, response) -> "Returned from BAR");
    }
}
