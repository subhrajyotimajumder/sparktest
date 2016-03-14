package com.spark.test.main;

import static spark.Spark.*;

/**
 * Created by subhrajyoti_majumder on 15/03/16.
 */
public class HelloWorld {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "GET: Hello World");

        post("/hello", (req, res) -> "POST: Hello World");

        put("/hello",(req,res)-> "PUT: Hello World");

        delete("/hello", (req, res) -> "DELETE: Hello World");

        head("/hello",(req,res)-> "HEAD: Hello World");
    }
}
