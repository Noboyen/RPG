package com.example.rpg_v2;

public class ManaPotion extends Potion{

    public ManaPotion(){
        this.name = "mana potion";
        this.manaBoost = 10;
    }

    @Override
    public void consume(Combattant hero) {
        hero.updateMana(manaBoost);
    }
}
