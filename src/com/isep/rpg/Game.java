package com.isep.rpg;
import java.util.*;

import com.isep.rpg.Hero;
import com.isep.utils.InputParser;

public class Game{

    public static Scanner scanner = new Scanner(System.in);
    public static Scanner sc = new Scanner(System.in);
    public static Scanner sn = new Scanner(System.in);
    public static Scanner sar = new Scanner(System.in);

    protected static List<Hero> heroes;
    protected static int playerTurn;
    protected static InputParser inputParser;
    protected static int choix;


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
        printSeparator(40);
        System.out.println("Mini RPG Lite 3000");
        printSeparator(40);
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
        }
    }
