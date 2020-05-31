package com.company.seven.one;

public class Main {


    public static void main(String[] args) {
        Hero hero = new Hero();

        hero.setMove(new Troll());
        hero.doMove();

        hero.setMove(new Vampires());
        hero.doMove();

        hero.setMove(new Pegasus());
        hero.doMove();

        hero.setMove(new Elves());
        hero.doMove();

        hero.setMove(new Orcs());
        hero.doMove();
    }
}
