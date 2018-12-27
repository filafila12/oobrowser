package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mmabdar on 2018-12-23.
 */
public class Bookmark {
    private ArrayList<WebURL> bookmark_list = new ArrayList<>();

    public void add(WebURL webURL){
        bookmark_list.add(webURL);
    }

    public void add(Tab tab){
        WebURL ww = tab.getWebURL();
        add(ww);
    }

    public Iterable<WebURL> get_bookmarks_list(){
        System.out.println("get bookmark list called!");
        return bookmark_list;
    }

    public Iterable<WebURL> clear_bookmarks(){
        Iterable<WebURL> ii = bookmark_list;
        bookmark_list.clear();
        return ii;
    }

    public WebURL remove_bookmark(int i){
        WebURL ii = bookmark_list.get(i);
        bookmark_list.remove(i);
        return ii;
    }

    public void edit_bookmark(WebURL webURL, String newName){
        WebURL wu = bookmark_list.remove(bookmark_list.lastIndexOf(webURL));
        wu.setName(newName);
        bookmark_list.add(wu);
    }
}
