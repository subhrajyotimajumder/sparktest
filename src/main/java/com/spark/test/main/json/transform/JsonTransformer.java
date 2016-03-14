package com.spark.test.main.json.transform;

/**
 * Created by subhrajyoti_majumder on 15/03/16.
 */
import com.google.gson.Gson;
import spark.ResponseTransformer;

public class JsonTransformer implements ResponseTransformer {

    private Gson gson = new Gson();

    @Override
    public String render(Object model) {
        return gson.toJson(model);
    }

}
