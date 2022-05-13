package Lab8;

public class Character {
    public String characterName = "Gandalf";
    public int level = 10;
    public int healthPoints = 100;
    public int manaPoints = 200;

    /**
     * Create two Constructors
     * 1 - Non Parameterized Constructor
     * 2 - Parameterized Constructor Initializing healthPoints, level, CharacterName and mana
     */
    Character(String name){
        characterName = name;
    }

    Character(String name, int level, int HP, int manaP){
        this.characterName = name;
        this.level = level;
        this.healthPoints = HP;
        this.manaPoints = manaP;

    }

    /**
     * Create a Method that displays the Name of the Character
     * eg. "Character Initialized : Gandalf"
     */
    public void displayCharName(){
        System.out.println("Character Initialized : " + this.characterName);
    }

    public void addHealth_Mana(){
        this.healthPoints += 20;
        this.manaPoints += 20;
    }


    public void displayStatus(){

        System.out.println("\nCharacter Name: " + this.characterName);
        System.out.println("Level: " + this.level);
        System.out.println("Health Points: " + this.healthPoints);
        System.out.println("Mana Points: " + this.manaPoints);

        System.out.println("\n--------------------");

    }

    /**
     * Create a method to Damage Target Character
     */
    public void damageTarget(Character CharacterHP,int damagePoints, int manaPoints){
        /**
         * Deduct health points from enemy character
         */
        CharacterHP.healthPoints -= damagePoints;
        System.out.println("Remaining HP: " + CharacterHP.healthPoints);
        this.manaPoints -= manaPoints;

        /**
         * Prompt Character is defeated if HP falls below 0
         * eg. Character Shaman defeated.
         */

        if (CharacterHP.healthPoints <= 0){
            System.out.println("\n----------------------");
            System.out.println("Enemy has been defeated!");
            System.out.println("Battle has ENDED.\n");
            System.out.println(this.characterName + " level up!");
            this.level += 10;


        }
    }

}