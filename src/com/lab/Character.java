package com.lab;

public class Character {
    public String characterName = "Gandalf";
    public int level = 0;
    public int healthPoints = 100;
    public int manaPoints = 200;

    Character(){
        System.out.println("Non Parameterized Constructor");
    }


    Character(String name, int newLevel, int newHealth, int newMana){
        characterName = name;
        level = newLevel;
        manaPoints = newMana;
        healthPoints = newHealth;
    }

    public void displayName(){
        System.out.println("Character Initialized "+ characterName);
    }

    public void damageTarget(Character enemyCharacter,int damagePoints){

        enemyCharacter.healthPoints -= damagePoints;

        System.out.println(enemyCharacter.characterName +" HP Left = " + enemyCharacter.healthPoints);


        if (enemyCharacter.healthPoints <= 0) {
            System.out.println("Character "+ enemyCharacter.characterName +" Defeated");

        }
    }
    public void statsShower(){
        System.out.println(characterName +" Current Status \nHP "+ healthPoints +"\nMana "+ manaPoints);

    }
    public void levelUP(){
        int levelUp = 10;
        level += levelUp;

        System.out.println(characterName +" Leveled up to Level "+ level);
    }

}

