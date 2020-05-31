package com.company.seven.two;

import java.util.List;

public class Subscriber implements Observer{
    private String name;

    public Subscriber(String name){
        this.name = name;
    }
    @Override
    public void handleEvent(List<String> magazine) {
        System.out.println("Dear " + name + "\nWe have changes in magazine and paper: \n" + magazine + "\n========================================================================================\n");
    }
}
