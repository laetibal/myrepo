package com.isep.rpg;

public class Food implements Consumable {
    protected static String nom;
    protected static int lifePoints;

    protected static Food LembasdOr = new Food();
    protected static Food LembasDeCuivre = new Food();
    protected static Food LembasDeSable = new Food();

    public Food() {
        LembasdOr.nom="Lembas d'Or";
        LembasdOr.lifePoints=30;

        LembasDeCuivre.nom="Lembas de Cuivre";
        LembasDeCuivre.lifePoints=25;

        LembasDeSable.nom="Lembas de Sable";
        LembasDeSable.lifePoints=35;
    }
}
