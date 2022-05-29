package com.isep.rpg;
import java.util.*;
import java.util.Scanner;

import com.isep.rpg.Hero;
import com.isep.utils.InputParser;

import static com.isep.rpg.Food.*;
import static com.isep.rpg.Potion.*;

public class Game {

    protected static ArrayList<String> inventaire = new ArrayList<String>();
    protected static ArrayList<String> inventaireRemove = new ArrayList<String>();

    public static Scanner scanner = new Scanner(System.in);
    public static Scanner sc = new Scanner(System.in);
    public static Scanner sn = new Scanner(System.in);
    public static Scanner sa = new Scanner(System.in);
    public static Scanner sar = new Scanner(System.in);
    public static Scanner so = new Scanner(System.in);
    public static Scanner se = new Scanner(System.in);
    public static Scanner sco = new Scanner(System.in);
    public static Scanner scc = new Scanner(System.in);
    public static Scanner sii = new Scanner(System.in);

    protected static List<Hero> heroes;
    protected static int playerTurn;
    protected static InputParser inputParser;
    protected static int choix;
    protected static int choixConsumable;
    protected static int choixPotion;
    protected static int choixNourriture;
    protected static int choixPotion2;
    protected static int choixNourriture2;
    protected static int choixInventaire;
    protected static int action;


    public static void clearConsole(){
        for(int i = 0; i < 100; i++)
            System.out.println();
    }

    public static void printSeparator(int n){
        for(int i = 0; i < n; i++)
            System.out.println("-");
        System.out.println();
    }


    public static void anythingToContinue(){
        System.out.println("Enter anything to continue");
        scanner.next();
    }

    public static void playGame(){
        boolean nameSet = false;
        String name;
        clearConsole();
        printSeparator(20);
        System.out.println("Mini RPG Lite 3000");
        printSeparator(20);
        anythingToContinue();

        do{
            System.out.println("\tIndiquer la classe dans laquelle vous voulez jouer :");
            System.out.println("(1) Hunter\n" +
                    "(2) Warrior\n" +
                    "(3) Mage\n" +
                    "(4) Healer\n");
            choix=sc.nextInt();
        }while (choix!=1 && choix!=2 && choix!=3 && choix!=4);

        if (choix==1){
            System.out.print("Quel nom voulez vous donner à votre Hunter ? ");
            Hunter.nom=sn.nextLine();
            //System.out.println("New name : "+Hunter.nom);
        }
        else if (choix==2){
            System.out.print("Quel nom voulez vous donner à votre Warrior ? ");
            Warrior.nom=sar.nextLine();
            //System.out.println("New name : "+Warrior.nom);
        }
        else if (choix==3){
            System.out.print("Quel nom voulez vous donner à votre Mage ? ");
            Mage.nom=sar.nextLine();
            //System.out.println("New name : "+Mage.nom);
        }
        else {
            System.out.print("Quel nom voulez vous donner à votre Healer ? ");
            Healer.nom=sn.nextLine();
            //System.out.println("New name : "+Healer.nom);
        }
        do {
            menu();
            action = sa.nextInt();
            action(action);
        } while (action!=4);
        }
    public static void menu(){

        System.out.println(" ");
        System.out.println("\tFaites votre choix :\n" +
                "(1) Ajouter un consumable\n" +
                "(2) Choisir une potion\n" +
                "(2) Choisir de la nourriture\n" +
                "(4) Quitter le jeu");
        System.out.println(" ");

    }

    public static int action(int action){
        switch (action){
            case 1:
                creerInventaires(inventaire);
                break;

            case 2 :
                choisirPotion();
                break;

            case 3 :
                choisirNourriture();
                break;

        }
        return choix;
    }

    public static ArrayList<String> creerInventaires(ArrayList<String> inventaire) {

        System.out.println("Quel consumable souhaitez-vous ajouter ?\n" +
                "(1) Potion\n" +
                "(2) Nourriture\n");
        choixConsumable=so.nextInt();

        if (choixConsumable==1){

            System.out.println("Quel potion souhaitez-vous ajouter ?\n" +
                    "(1) Potion du dragon\n" +
                    "(2) Potion de vie\n" +
                    "(3) Potion de feu\n");
            choixPotion=se.nextInt();

            if (choixPotion==1){
                System.out.println("Potion du dragon ajoutée !");
                inventaire.add(PotionDuDragon.nom);
            }

            else if(choixPotion==2){
                System.out.println("Potion de vie ajoutée !");
                inventaire.add(PotionDeVie.nom);
            }

            else if(choixPotion==3){
                System.out.println("Potion de feu ajoutée !");
                inventaire.add(PotionDeFeu.nom);
            }
        }

        else{
            System.out.println("Quel nourriture souhaitez-vous ajouter ?\n" +
                    "(1) Lembas d'or\n" +
                    "(2) Lembas de cuivre\n" +
                    "(3) Lembas de sable\n");
            choixNourriture=sco.nextInt();

            if (choixNourriture==1){
                System.out.println("Lembas d'or ajoutée !");
                inventaire.add(LembasdOr.nom);
            }

            else if(choixNourriture==2){
                System.out.println("Lembas de cuivre ajoutée !");
                inventaire.add(LembasDeCuivre.nom);
            }

            else if(choixNourriture==3){
                System.out.println("Lembas de sable ajoutée !");
                inventaire.add(LembasDeSable.nom);
            }
        }
        System.out.println("Voila votre inventaire : "+inventaire);
        return inventaire;
        }

    public static void choisirPotion(){
        System.out.println(" ");
        System.out.println("Quel potion souhaitez-vous utiliser ?\n");

        for (int i =0; i<inventaire.size();i++){
            System.out.println("("+i+")"+" "+inventaire.get(i));
        }

        choixPotion2=scc.nextInt();

        System.out.println("Vous avez consommé "+inventaire.get(choixInventaire)+" !");
        inventaire.remove(choixPotion2);
    }

    public static void choisirNourriture(){
        System.out.println(" ");
        System.out.println("Quel nourriture souhaitez-vous utiliser ?\n");

        for (int i =0; i<inventaire.size();i++){
            System.out.println("("+i+")"+" "+inventaire.get(i));
        }

        choixNourriture2=sii.nextInt();

        System.out.println("Vous avez consommé "+inventaire.get(choixInventaire)+" !");
        inventaire.remove(choixNourriture2);
    }

    }