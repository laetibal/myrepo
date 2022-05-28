package com.isep.rpg;
import java.util.*;

import com.isep.rpg.Hero;
import com.isep.utils.InputParser;

public class Game {
    private List<Hero> heroes;
    private int playerTurn;
    private InputParser inputParser;

    public static void clearConsole(){
        for(int i = 0; i < 100; i++)
            System.out.println();
    }

    public static void printSeparator(int n){
        for(int i = 0; i < n; i++)
            System.out.println("-");
        System.out.println();
    }

    public static void printHeading(String title){
        printSeparator(30);
        System.out.println(title);
        printSeparator(30);
    }

    public static void playGame(){
        boolean nameSet;
        String name;
        clearConsole();
    }

}