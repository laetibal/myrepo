package com.isep.rpg;
import java.util.*;

import com.isep.utils.InputParser;

public abstract class Hero extends Game{
    private String armor;
    private int lifePoints;
    private String weaponDamage;
    private List<Potion> potions;
    private List<Food> lembas;
    abstract void attack();
    abstract void defend();
    public static void useConsumable(Consumable consumable) {
    }
}
