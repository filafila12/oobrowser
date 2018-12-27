package com.company;

/**
 * Created by mmabdar on 2018-12-23.
 */
public class WebBrowserEngine {

    public static WebDriver get_web_driver(){
        return new WebDriver();
    }

    public FileDriver get_file_driver(){
        return new FileDriver();
    }
}
