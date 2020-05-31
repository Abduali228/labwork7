package com.company.seven.two;

import java.util.ArrayList;
import java.util.List;

public class Journal implements Observed{
    List<String> paper = new ArrayList<>();
    List<Observer> subscribers = new ArrayList<>();

    public void addJournal(String paper){
        this.paper.add(paper);
        notifyObservers();
    }

    public void removeJournal(String paper){
        this.paper.remove(paper);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : subscribers){
            observer.handleEvent(this.paper);
        }
    }
}