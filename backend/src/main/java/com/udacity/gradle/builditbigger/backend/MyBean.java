package com.udacity.gradle.builditbigger.backend;

import io.geekgirl.android.lib.JokesBank;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String joke;

    public MyBean() {
        this.joke = "hahahaha";
    }


    public String getJoke() {
        return joke;
    }

    public void setJoke() {
        this.joke = JokesBank._getJoke();
    }
}