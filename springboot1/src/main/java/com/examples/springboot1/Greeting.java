package com.examples.springboot1;

/**
 * Created by edara on 7/18/16.
 */
public class Greeting {
    private int id;
    private String content;

    Greeting(int id, String content) {
        this.id = id;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
