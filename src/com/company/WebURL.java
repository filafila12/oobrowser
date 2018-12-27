package com.company;

/**
 * Created by mmabdar on 2018-12-23.
 */
public class WebURL {
    private String URL;
    private String name;

    public String getURL() {
        return URL;
    }

    public String getName() {
        return name;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WebURL(String URL, String name) {
        this.name = name;
        this.URL = URL;
    }

    public  WebURL(){

    }
}
