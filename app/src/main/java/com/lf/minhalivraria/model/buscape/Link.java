package com.lf.minhalivraria.model.buscape;

import java.io.Serializable;

public class Link implements Serializable {
    private String type;

    private String url;

    public Link() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Link{" +
                "type='" + type + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
