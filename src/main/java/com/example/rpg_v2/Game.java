package com.example.rpg_v2;

import java.util.Random;
import java.util.Scanner;



public class Game {
    private static Enemy[] listeEnemy = new Enemy[5];
    private static int enemyChoisi;
    static Hero hero1 = new Hunter("Hunter", 100, 50, 80, 10);
    static Hero hero2 = new Warrior("Warrior", 100, 40, 50, 10);
    static Hero hero3 = new Mage("Mage", 100, 75, 15, 10);
    static Hero hero4 = new Healer("Healer", 100, 50, 20, 10);


    public static void Play() {

        Scanner scanner = new Scanner(System.in);

        // Demande au joueur le nombre de héros
        System.out.println("Combien de heros voulez-vous creer ?");
        int nbHeros = scanner.nextInt();

        // Création d'un tableau pour stocker les héros
        Hero[] heroes = new Hero[nbHeros];

        // Demande à chaque joueur de choisir sa classe
        for (int i = 0; i < nbHeros; i++) {
            System.out.println("Quelle est la classe du heros " + (i + 1) + " ?");
            System.out.println("1. Hunter");
            System.out.println("2. Warrior");
            System.out.println("3. Mage");
            System.out.println("4. Healer");
            int choice = scanner.nextInt();

            // Création du héros en fonction de la classe choisie
            switch (choice) {
                case 1:
                    heroes[i] = hero1;
                    break;
                case 2:
                    heroes[i] = hero2;
                    break;
                case 3:
                    heroes[i] = hero3;
                    break;
                case 4:
                    heroes[i] = hero4;
                    break;
                default:
                    System.out.println("Vous devez choisir une classe valide !");
                    i--;
                    break;
            }
        }


        //create weapon
        Fist fist = new Fist();
        Bow bow = new Bow();
        FireBall fireball = new FireBall();
        HealingSpell healingSpell = new HealingSpell();

        //create item
        Apple apple = new Apple();
        Meat meat = new Meat();
        Fish fish = new Fish();
        Chocolate_Bar chocolate_bar = new Chocolate_Bar();
        ManaPotion manaPotion = new ManaPotion();
        Energetic_Drink energetic_drink = new Energetic_Drink();


        hero1.addArmory(bow);
        hero1.addInventory(manaPotion);
        hero1.addInventory(energetic_drink);
        hero1.addInventory(meat);
        hero1.addInventory(fish);
        hero1.addInventory(apple);
        hero1.addInventory(chocolate_bar);

        hero2.addArmory(fist);
        hero2.addInventory(manaPotion);
        hero2.addInventory(energetic_drink);
        hero2.addInventory(meat);
        hero2.addInventory(fish);
        hero2.addInventory(apple);
        hero2.addInventory(chocolate_bar);

        hero3.addArmory(fireball);
        hero3.addInventory(manaPotion);
        hero3.addInventory(energetic_drink);
        hero3.addInventory(meat);
        hero3.addInventory(fish);
        hero3.addInventory(apple);
        hero3.addInventory(chocolate_bar);


        hero4.addArmory(healingSpell);
        hero4.addInventory(manaPotion);
        hero4.addInventory(energetic_drink);
        hero4.addInventory(meat);
        hero4.addInventory(fish);
        hero4.addInventory(apple);
        hero4.addInventory(chocolate_bar);


        Enemy chien_enrage = new Enemy("chien_enrage", 100, 75, 20, 100, 15);
        Enemy loup = new Enemy("loup", 200, 75, 20, 100, 25);
        Enemy mage_noire = new Enemy("mage_noire", 300, 75, 20, 100, 40);
        Enemy dragon = new Enemy("dragon", 400, 75, 20, 100, 50);
        Enemy boss = new Enemy("Boss", 600, 75, 20, 100, 100);
        Enemy[] listeEnemy = {chien_enrage,loup,mage_noire,dragon,boss};


        Team team = new Team();
        for (int i = 0; i < nbHeros; i++) {
            team.addHero(heroes[i]);
        }


        EnemyTeam enemyTeam = new EnemyTeam();
        enemyTeam.addEnemy(chien_enrage);
        enemyTeam.addEnemy(loup);
        enemyTeam.addEnemy(mage_noire);
        enemyTeam.addEnemy(dragon);
        enemyTeam.addEnemy(boss);

        System.out.println("Your team :");
        team.printHero();

        System.out.println();
        System.out.println("Enemy team :");
        enemyTeam.printEnemy();


        int turn = 0;
        while (!enemyTeam.isDead()) {
            System.out.println("\n");


            //action du hero
            boolean choiceDone = false;
            while (!choiceDone) {
                System.out.println("Do you want to : " + "\n" + "1. See the inventory" + "\n" + "2. Interact" + "\n" + "3. Use an item ?" + "\n");
                System.out.print("Type 1, 2 or 3 : ");
                int choice = scanner.nextInt();
                if (choice == 1) {
                    System.out.println("Your team is composed of : ");
                    System.out.println("\n");
                    team.printHero();
                    System.out.println("\n");
                    System.out.println("Witch hero do you want to choose? ");
                    System.out.print("Type his number : ");
                    int choiceHero = scanner.nextInt();
                    team.getHero(choiceHero - 1).printInventory();
                    System.out.println("\n");

                } else if (choice == 2) {
                    int i = 0;
                    choiceDone = true;
                    while (i < 3) {

                        System.out.println("Your team is composed of : ");
                        System.out.println("\n");
                        team.printHero();
                        System.out.println("\n");

                        System.out.println("Witch hero do you want to choose? ");
                        System.out.print("Type his number : ");
                        int choiceHero = scanner.nextInt();
                        System.out.println("It's the turn of " + team.getHero(choiceHero - 1).getName());
                        System.out.println("\n");

                        System.out.println("Vous allez affronter un ennemi !");
                        System.out.println("\n");
                        enemyTeam.printEnemy();
                        System.out.println("\n");
                        System.out.println("choisi un ennemi : ");
                        int target = scanner.nextInt();


                        team.getHero(choiceHero - 1).interact(enemyTeam.getEnemy(target - 1));
                        enemyTeam.getEnemy(target - 1).updateAlive();


                        if (!enemyTeam.getEnemy(target - 1).getLive()) {
                            System.out.println(enemyTeam.getEnemy(target - 1).getName() + "is dead");
                            enemyTeam.removeEnemy(enemyTeam.getEnemy(target - 1));
                            i++;
                        }

                        //attaque de l'ennemi avec simulation aléatoire :

                        Game.getRandomEnemy();
                        //(team.getHero(choiceHero - 1).updateHP(team.getHero(choiceHero - 1).getHP() - listeEnemy[enemyChoisi]));


                        System.out.println("\n");

                    }

                }
                else if (choice==3){
                    choiceDone = true;
                    team.getHero(turn).consume();
                }

                else{
                    System.out.println("Instruction unclear");
                    System.out.println("\n");
                }


                //update turn
                if (turn < team.getSize() - 1) {
                    turn++;
                } else {
                    turn = 0;
                }


            }
            System.out.println("\n" + "\n" + "\n");
            System.out.println("You defeated the enemy team");

        }


    }

    //Fonction pour afficher un ennemi à combattre au hasard
    private static void getRandomEnemy() {
        Random rand = new Random();
        int num_random = rand.nextInt(listeEnemy.length);
        enemyChoisi = num_random;
    }

}



