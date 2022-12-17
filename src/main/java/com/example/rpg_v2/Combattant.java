package com.example.rpg_v2;

import java.util.ArrayList;



public class Combattant {


    private final String name;
    private int hp;
    private final int strength;
    private int mana;
    private final int defense;
    private boolean isAlive;


    private int[] position;
    private final ArrayList<Consumable> inventory;
    private final ArrayList<Weapons> armory;


    public Combattant(String name, int hp, int strength, int mana, int defense) {
        this.name = name;
        this.hp = hp;
        this.strength = strength;
        this.mana = mana;
        this.defense = defense;
        this.armory = new ArrayList<>();
        this.inventory = new ArrayList<>();
        this.isAlive = true;

    }

    //getter

    public String getName() {
        return this.name;
    }

    public int getHP() {
        return this.hp;
    }

    public int getStrength() {
        return this.strength;
    }

    public int getDefense() {
        return this.defense;
    }

    public int getMana() {
        return this.mana;
    }

    public boolean getLive() {
        return this.isAlive;
    }

    public ArrayList<Weapons> getArmory() {
        return this.armory;
    }

    public ArrayList<Consumable> getInventory() {
        return this.inventory;
    }


    //Update

    public void addArmory(Weapons weapon) {
        this.armory.add(weapon);
    }

    public void deleteArmory(Weapons weapon) {
        this.armory.remove(weapon);
    }

    public void addInventory(Consumable consumable) {
        this.inventory.add(consumable);
    }

    public void deleteInventory(Consumable consumable) {
        this.inventory.remove(consumable);
    }

    public void updateHP(int delta) {
        this.hp += delta;
    }

    public void updateMana(int delta) {
        this.mana += delta;
    }

    public void updateAlive() {
        if (this.hp <= 0) {
            this.isAlive = false;
        }
    }


    //print
    public void printInventory() {
        if (this.getInventory().size() == 0) {
            System.out.println("You don't have any item!");
        } else {
            System.out.print("You have : ");
            for (int i = 0; i < this.getInventory().size(); i++) {
                if (i == this.getInventory().size() - 1) {
                    System.out.print(this.getInventory().get(i).name + " .");
                } else {
                    System.out.print(this.getInventory().get(i).name + " / ");
                }

            }
            System.out.println();
        }

        System.out.print("In your armory you have : ");
        for (int i = 0; i < this.getArmory().size(); i++) {
            if (i == this.getArmory().size() - 1) {
                System.out.print(this.getArmory().get(i).name + " .");
            } else {
                System.out.print(this.getArmory().get(i).name + " / ");
            }

        }
    }
}