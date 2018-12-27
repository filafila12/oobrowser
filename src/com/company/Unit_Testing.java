package com.company;


import java.util.List;

/**
 * Created by mmabdar on 2018-12-24.
 */
public class Unit_Testing {

    public static void test_func(){
        Window window = new Window();
        Tab t = window.add_tab();
        t = window.add_tab();
        t = window.add_tab();
        t = window.add_tab();
        t = window.add_tab();
        t = window.add_tab();
        t.accessWebPage("https://www.google.com/");


        t = window.switch_tab(2);
        t.accessWebPage("instagram.com");

        t = window.switch_tab(4);
        t.accessWebPage("iust.ac.ir");

        History h = window.get_history();
        h.remove_history(2);
        List<WebURL> hl = h.get_history_list();

        for(WebURL w : hl){
            System.out.println(w.getURL());
        }

        h.clear_history();
        List<WebURL> h2 = h.get_history_list();
        if(h2.isEmpty()){
            System.out.println(" history list is cleared successfuly");
        } else {
            System.out.println("Failure : history couldn't clear!!!");
        }


        window.remove_tab(window.get_current_tab());
        window.remove_tab(window.get_current_tab());
        window.remove_tab(window.get_current_tab());
        window.remove_tab(window.get_current_tab());
        window.remove_tab(window.get_current_tab());
        window.remove_tab(window.get_current_tab());
    }

}
