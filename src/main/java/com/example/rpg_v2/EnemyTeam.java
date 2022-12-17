package com.example.rpg_v2;

import java.util.ArrayList;

public class EnemyTeam {

    ArrayList<Enemy> enemyTeam = new ArrayList<>();
    boolean dead = false;


    public int getSize() {
        return this.enemyTeam.size();
    }

    public void addEnemy(Enemy enemy) {
        this.enemyTeam.add(enemy);
    }

    public Enemy getEnemy(int index) {
        return this.enemyTeam.get(index);
    }

    public boolean Dead() {
        return dead;
    }


    public void removeEnemy(Enemy enemy) {
        this.enemyTeam.remove(enemy);
        if (this.enemyTeam.size() == 0) {
            this.dead = true;
        }
    }

    public void printEnemy() {
        for (int i = 0; i < this.enemyTeam.size(); i++) {
            System.out.print(i + 1 + ") " + this.enemyTeam.get(i).getName() + " : " + this.enemyTeam.get(i).getHP() + "hp, ");
            System.out.println(this.enemyTeam.get(i).getMana() + " mana");
        }


    }

    public boolean isDead() {
        return false;
    }
}
