package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by mmabdar on 2018-12-23.
 */
public class History {
    private ArrayList<WebURL> history_list = new ArrayList<>();

    public void add(WebURL webURL){
        history_list.add(webURL);
    }

    public void add_batch(List<WebURL> ww){
        for(int i=0;i<ww.size();i++){
            history_list.add(ww.get(i));
        }
    }

    public List<WebURL> get_history_list(){
        return history_list;
    }

    public void clear_history(){
        List<WebURL> ii = history_list;
        history_list.clear();
    }

    public WebURL remove_history(int i){
        WebURL ii = history_list.get(i);
        history_list.remove(i);
        return ii;
    }

}
