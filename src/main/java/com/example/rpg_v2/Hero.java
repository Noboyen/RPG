package com.example.rpg_v2;

import java.util.Scanner;

public class Hero extends Combattant {



    public Hero(String name, int hp, int strength, int mana, int defense) {
        super(name, hp, strength, mana, defense);

    }



    //action
    public void interact(Combattant target){
        System.out.print("You are about to interact with " + target.getName() + " (HP = " + target.getHP());
        System.out.println(" , defense = " + target.getDefense() + " )");
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        if (this.getArmory().size()>1){
            String name1 = this.getArmory().get(0).name;
            String name2 = this.getArmory().get(1).name;

            System.out.println("Do you want to use your first weapon (" + name1 + ") or your second (" + name2 + ") ?");
            System.out.println("Type 1 or 2:");
            choice = scan.nextInt() -1;
        }

        this.getArmory().get(choice).interaction(this,target);


    }


    public void consume(){
        Scanner scan = new Scanner(System.in);

        if (this.getInventory().size() == 0) {
            System.out.println("You don't have any item sorry.");
        } else {
            System.out.print("You have : ");
            for (int i = 0; i < this.getInventory().size(); i++) {
                if (i == this.getInventory().size() - 1) {
                    System.out.print("(" + (i +1)+ ")" + this.getInventory().get(i).name + " .");
                } else {
                    System.out.print("(" + (i +1)+ ")" +this.getInventory().get(i).name + " / ");
                }
            }


            System.out.print("What item do you want to use? Type it's number : ");

            int choice = scan.nextInt()-1;
            this.getInventory().get(choice).consume(this);
            this.deleteInventory(this.getInventory().get(choice));
            System.out.println(this.getName() +  " now has " + this.getHP() + "hp and " + this.getMana() + " mana");


        }


    }
}