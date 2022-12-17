package com.example.rpg_v2;


public class Magical_Weapon extends Weapons {

    int mana;
    int damage;
    int cost;


    @Override
    public void interaction(Combattant attacker, Combattant target) {

        int damage = this.damage ;
        if (attacker instanceof Warrior) {
            damage *= 2;
        }


        target.updateHP(-damage);

        //message for terminal game
        System.out.print(attacker.getName() + " dealt " + damage + " to " + target.getName());
        System.out.print(" with his " + this.name + ". ");
        System.out.println(target.getName() + " now have " + target.getHP() + " hp.");
    }
}
