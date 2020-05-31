package com.company.seven.two;

public class Main {
    public static void main(String[] args){
        Journal paper = new Journal();
        paper.addMagazine("New-York Times");
        paper.addMagazine("Abu gets full");

        Observer fsubscriber = new Subscriber("Sabu");
        Observer ssubscriber = new Subscriber("Abu");

        paper.addObserver(fsubscriber);
        paper.addObserver(ssubscriber);

        //every subscriber will be notified that paper was added!
        paper.addMagazine("Future billioners in 2020");

        //every subscriber will be notified that paper was removed!
        paper.removeMagazine("Scrim from $uicideBoy$ is the best album for OOP assignment");
    }
}
