package com.SpringTraining.Endpoints;

public class Restful {

    private final long id;
    private final String content;

    public Restful(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}

