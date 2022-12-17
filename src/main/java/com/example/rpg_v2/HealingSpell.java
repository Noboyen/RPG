package com.example.rpg_v2;

public class HealingSpell extends Healing_Weapon {

    public HealingSpell(){
        this.name = "healing stick";
        this.heal = 25;
        this.cost = 5;

    }



    @Override
    public void interaction(Combattant attacker, Combattant target) {
        if(attacker.getMana()>=this.cost){
            attacker.updateMana(-this.cost);
            int heal = this.heal;
            target.updateHP(heal);
            System.out.println(attacker.getName() + " spent " + this.cost + " mana to heal " + target.getName() + " " + this.heal + "hp") ;
            System.out.println(target.getName() + " now have " + target.getHP() + "hp");
        }
        else{
            System.out.println("You don't have enough mana");
        }

    }

}

