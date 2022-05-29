package com.isep.rpg;

public class Potion implements Consumable{
    protected static String nom;
    protected static int lifePoints;

    protected static Potion PotionDuDragon = new Potion();
    protected static Potion PotionDeFeu = new Potion();
    protected static Potion PotionDeVie = new Potion();

    public Potion() {
        PotionDuDragon.nom="Potion Du Dragon";
        PotionDuDragon.lifePoints=30;

        PotionDeFeu.nom="Potion De Feu";
        PotionDeFeu.lifePoints=25;

        PotionDeVie.nom="Potion De Vie";
        PotionDeVie.lifePoints=35;
    }
}
