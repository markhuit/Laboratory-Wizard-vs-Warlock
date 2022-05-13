package Lab8;

public class Wizard extends Character{
    Wizard(String name){
        super(name);
    }

    //Attacking Skills
    public void Meteorain(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Meteorain (Damage - 50)");
        int damagePoints = 50;
        int manaCost = 50;
        damageTarget(enemyCharacter, damagePoints, manaCost);
    };

    public void OmniSlash(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with OmniSlash(Damage -60)");
        int damagePoints = 60;
        int manaCost = 40;
        damageTarget(enemyCharacter, damagePoints, manaCost);

    };

}