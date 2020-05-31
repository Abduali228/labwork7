package com.company.seven.one;

public class Hero {
    Move move;

    public void setMove(Move move){
        this.move = move;
    }
    public void doMove(){
        move.move();
    }
}
