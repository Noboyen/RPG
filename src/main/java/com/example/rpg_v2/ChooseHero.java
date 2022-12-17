package com.example.rpg_v2;

public class ChooseHero {


    String Hunter, Warrior, Mage, Healer;
    int hp;


    public ChooseHero (String Hunter, String Warrior, String Mage, String Healer, int hp){
        this.Hunter = Hunter;
        this.Warrior = Warrior;
        this.Mage = Mage;
        this.Healer = Healer;
        this.hp = hp;
    }


    public int getHP(){return hp;};

    public int getWarrior(){return hp;};

    public int getMage(){return hp;};

    public int getHealer(){return hp;};

    public int getHunter(){return hp;};

}
