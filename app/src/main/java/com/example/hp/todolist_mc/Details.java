package com.example.hp.todolist_mc;

/**
 * Created by HP on 06-11-2016.
 */
public class Details {
    String title;
    String descp;
    int image;

    public Details(String title, String descp, int image){
        this.title=title;
        this.descp=descp;
        this.image=image;
    }

    public String getTitle() {
        return title;
    }

    public String getDescp() {
        return descp;
    }

    public int getImage() {
        return image;
    }
}
