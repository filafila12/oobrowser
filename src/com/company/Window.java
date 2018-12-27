package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mmabdar on 2018-12-23.
 */
public class Window {
    private ArrayList<Tab> tabs = new ArrayList<>();
    private Tab current_tab ;
    private Bookmark bookmark = new Bookmark();
    private Download download = new Download();


    public Tab add_tab() {
        Tab t = new Tab();
        this.tabs.add(t);
        current_tab = t;
        System.out.println("a new tab is created");
        return current_tab;
    }

    public void remove_tab(Tab t) {
        int ind = tabs.indexOf(t);
        if (ind >= 0) {
            this.tabs.remove(t);
            System.out.println("tab no. " + ind + " removed!");
            if (ind > 0) {
                ind--;
                current_tab = tabs.get(ind);

            } else {
                current_tab = null;
            }
        } else {
            System.out.println("no tab for remove!");
        }

    }

    public Tab get_current_tab() {
        return this.current_tab;
    }

    public Tab switch_tab(int i) {
        int ind = tabs.indexOf(current_tab);
        if (current_tab != null) {
            ind += i;
            ind = ind % tabs.size();
        }
        return tabs.get(ind);
    }

    public Bookmark get_bookmark(){
        return bookmark;
    }

    public History get_history(){
        History h = new History();
        System.out.println("history list has been called!");
        for(Tab ta : tabs){
            h.add_batch((List<WebURL>) ta.get_history());
        }
        return h;
    }
}
