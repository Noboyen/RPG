package com.example.rpg_v2;

public class Food extends Consumable {


    @Override
    public void consume(Combattant hero) {
        hero.updateHP(this.heal);

    }
}