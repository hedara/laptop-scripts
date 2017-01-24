package com.samples.example1;

import com.google.gson.Gson;
import spark.ResponseTransformer;

/**
 * Created by edara on 9/28/16.
 */
public class JsonTransformer implements ResponseTransformer {
    private Gson gson = new Gson();
    @Override
    public String render(Object model) throws Exception {
        return gson.toJson(model);
    }
}
