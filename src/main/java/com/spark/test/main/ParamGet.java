package com.spark.test.main;


import static spark.Spark.before;
import static spark.Spark.get;
import static spark.Spark.halt;

/**
 * Created by subhrajyoti_majumder on 15/03/16.
 */
public class ParamGet {
    public static void main(String[] args) {

        // matches "GET /hello/foo" and "GET /hello/bar"
        // request.params(":name") is 'foo' or 'bar'
        get("/hello/:name", (request, response) -> "Hello: " + request.params(":name"));


        // matches "GET /say/hello/to/world"
        // request.splat()[0] is 'hello' and request.splat()[1] 'world'
        get("/say/*/to/*", (request, response) -> {
            return "Number of splat parameters: " + request.splat().length;
        });



        // halting request
        get("/donotcallme",(req,res)-> {
            //issue - http code not propagated
            halt(401, "Go away!");
            return "GO AWAY";
        });
    }
}
