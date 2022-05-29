package com.isep.rpg;
import java.util.*;

public abstract class Hero{

    //attributs des différents heros
    public int lifePoints;
    public String nom;
    public String armor;
    public int weaponDamage;
    public List<Potion> potions;
    public List<Food> lembas;

    public Hero(int lifePoints, String armor, int weaponDamage, List<Potion> potions, List<Food> lembas){
        this.lifePoints = lifePoints;
        this.nom = nom;
        this.armor = armor;
        this.weaponDamage = weaponDamage;
        this.potions = potions;
        this.lembas = lembas;
    }

    abstract int attack();
    abstract int defend();

    public static void useConsumable(Consumable consumable){

    }

}

