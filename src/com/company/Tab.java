package com.company;

/**
 * Created by mmabdar on 2018-12-23.
 */
public class Tab {
    private Navigation nav = new Navigation();
//    private Bookmark bookmark;
    private History history = new History();

    private WebDriver wb = WebBrowserEngine.get_web_driver();

    private WebURL webURL;

    public WebURL getWebURL(){
        return webURL;
    }
    public String getURL() {
        return webURL.getURL();
    }

    public void setURL(String URL) {
        this.webURL.setURL(URL);
    }

    public String getName() {
        return webURL.getName();
    }

    public void setName(String name) {
        this.webURL.setName(name);
    }

    public void accessWebPage(String wuu){
        WebURL wu = new WebURL();
        wu.setURL(wuu);
        wu.setName("new url");
        wb.access_web_url(wu);
        history.add(wu);
        nav.add_new_web_url(wu);
    }

    public Iterable<WebURL> get_history(){
        return history.get_history_list();
    }

//    public Bookmark getBookmark(){
//        return bookmark;
//    }

}
