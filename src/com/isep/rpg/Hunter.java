package com.isep.rpg;

import java.util.List;

public class Hunter extends Hero{
    public static String nom;

    public Hunter(int lifePoints, String armor, int weaponDamage, List<Potion> potions, List<Food> lembas) {
        super(lifePoints, armor, weaponDamage, potions, lembas);
    }

    @Override
    int attack() {
        return 0;
    }

    @Override
    int defend() {
        return 0;
    }
}
