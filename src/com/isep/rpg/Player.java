package com.isep.rpg;
import java.util.*;

public class Player extends Hero{

    public Player(int lifePoints, String armor, int weaponDamage, List<Potion> potions, List<Food> lembas) {
        super(lifePoints, armor, weaponDamage, potions, lembas);
    }

    @Override
    public int attack(){
        return 0;
    }

    @Override
    public int defend(){
        return 0;
    }

}