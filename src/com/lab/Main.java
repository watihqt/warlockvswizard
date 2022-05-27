package com.lab;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Wizards and Warlocks\n");

        Wizard One = new Wizard("Jumar",10, 100,200);
        Warlock Two = new Warlock("Kwarog",10,100,200);

        One.displayName();
        Two.displayName();

        One.kiss(Two);
        One.statsShower();
       Two.statsShower();

        Two.spellRegen();
        One.statsShower();
        Two.statsShower();

        One.kulam(Two);
        One.statsShower();
        Two.statsShower();

        Two.cancer(One);
        One.statsShower();
        Two.statsShower();

        One.kiss(Two);
        One.levelUP();


    }
}