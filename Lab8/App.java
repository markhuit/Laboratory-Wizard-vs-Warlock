package Lab8;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Wizards and Warlocks");
        /**
         * Create a Wizard Class which Inherits the Properties of Character Class.
         * eg. Wizard.java
         *
         *
         * Create a Warlock Class which Inherits the Properties of Character Class.
         * eg. Warlock.java
         *
         * Each of the above mentioned Classes should have the following:
         * 1 - 2 Damage Spells(you are free to name it)
         * - each method/spell should invoke the damageTarget method from Character
         * and has its corresponding mana cost and damage points
         * 2 - 1 Recover spell(you are free to name it) that will increase both HP and Mana Points
         *
         */

        /**
         * Create a Sequence of each Character Created Casting Spells until
         * one of the Characters Created gets defeated.
         *
         * The sequence should contain the following:
         * 1 - Damaging the Opposing Character.
         * 2 - Both Characters will Damage each other.
         * 3 - At least one of the Characters should cast a "recover" spell that adds HP and MP of the caster.
         * 4 - "Recover spell" has no Mana Point Cost
         * 5 - Either the Warlock/Wizard should be defeated at the end of the Sequence.
         * 6 - The winner will have their level increased by 10 (Create a Method In Character.java that increases level)
         * 7 - Display the Details of each Character at each "phase/turn" to see the current status of the Characters
         *      - Create a method to display details for better readability
         */

        /**
         * Example Sequence
         * Wizard Arnel = new Wizard("Arnel");
         * Warlock Saruman = new Warlock("Saruman");
         *
         * Wizard.firestorm(Saruman); // Saruman HP Deducted
         * Warlock.recover() // Saruman HP and MP increases
         */
        Wizard Cloud = new Wizard("Cloud");
        Warlock Sephiroth = new Warlock("Sephiroth");

        System.out.println("\nAn Enemy Approaches!!!");

        System.out.println("\nSephiroth's Turn\n");
        Sephiroth.OctoSlash(Cloud);

        //Displaying the Character stats
        System.out.println("\nCloud's Stats: ");
        Cloud.displayStatus();


        System.out.println("\nCloud's Turn\n");
        Cloud.Meteorain(Sephiroth);

        //Displaying the Opponent stats
        System.out.println("\nSephiroth's Stats: ");
        Sephiroth.displayStatus();

        System.out.println("\nSephiroth's Turn\n");
        Sephiroth.Curaga();

        //Displaying the Opponent Stats
        Sephiroth.displayStatus();

        System.out.println("\nCloud's Turn\n");
        Cloud.OmniSlash(Sephiroth);

        //Displaying the Opponent stats
        Sephiroth.displayStatus();


        System.out.println("\nSephiroth's Turn\n");
        Sephiroth.OctoSlash(Cloud);

        //Displaying the Character stats
        System.out.println("\nRevealingOpponent stats: ");
        Cloud.displayStatus();

        System.out.println("\nCloud's Turn\n");
        Cloud.OmniSlash(Sephiroth);

        Sephiroth.displayStatus();


        //Displaying Characters Status
        System.out.println("\nCharacter Status: ");
        Cloud.displayStatus();




    }
}
