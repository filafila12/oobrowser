package com.company;

import java.util.ArrayList;

/**
 * Created by mmabdar on 2018-12-23.
 */
public class Navigation {

    private ArrayList<WebURL> navigation_list = new ArrayList<>();
    private WebURL curWebURL;

    public void add_new_web_url(WebURL webURL){
        navigation_list.add(webURL);
        curWebURL = webURL;
    }

    public WebURL get_backward(){
        int ind = navigation_list.lastIndexOf(curWebURL);
        if(ind>0){
            ind--;
            curWebURL = navigation_list.get(ind);
        }
        return curWebURL;
    }

    public WebURL get_forward(){
        int ind = navigation_list.lastIndexOf(curWebURL);
        if(ind<navigation_list.size()){
            ind++;
            curWebURL = navigation_list.get(ind);
        }
        return curWebURL;
    }

    public WebURL current_url(){
        return curWebURL;
    }
}
