package com.lab;

public class Wizard extends Character{
    Wizard(String name, int newLevel, int newHealth, int newMana){
        super(name,newLevel,newHealth,newMana);

    }

    public void kiss(Character enemyCharacter){

        int damagePoints = 99;
        int manaCost = 25;
        manaPoints -= manaCost;

        System.out.println(super.characterName + " Attacks " + enemyCharacter.characterName + " with  kiss (Damages "+ damagePoints +")");
        damageTarget(enemyCharacter, damagePoints);
    }
    public void kulam(Character enemyCharacter){
        int damagePoints = 80;
        int manaCost = 60;
        manaPoints -= manaCost;

        System.out.println(super.characterName + " Attacks " + enemyCharacter.characterName + " with kulam (Damages "+ damagePoints +")");
        damageTarget(enemyCharacter, damagePoints);
    }

    public void regenTeknik(){
        int heal = 30;
        int manaRegen = 60;

        healthPoints += heal;
        manaPoints += manaRegen;

        System.out.println(super.characterName +" use Spell Regen (Health +"+ heal +")" + " (Mana +"+ manaRegen +")");
    }

}
