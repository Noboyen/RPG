package com.example.rpg_v2;


public abstract class Consumable extends Item {

    int heal;

    int manaSpell;

    public abstract void consume(Combattant hero);

}