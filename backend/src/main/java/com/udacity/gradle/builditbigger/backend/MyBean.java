package com.udacity.gradle.builditbigger.backend;

import io.geekgirl.android.lib.JokesBank;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private JokesBank jokesBank;
    private String joke;

    public MyBean(){
        jokesBank = new JokesBank();
    }

    public void setJoke() {
        joke =  jokesBank.getJoke();
    }

    public String getJoke() {
        return joke;
    }
}