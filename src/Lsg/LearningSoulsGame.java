package Lsg;

import Lsg.characters.Hero;
import Lsg.characters.Monster;

public class LearningSoulsGame {

    public static void main(String[] args) {

        Hero quentin = new Hero();
        Monster monster = new Monster("Studentatort");
        Monster monster2 = new Monster();
        Monster monster3 = new Monster();

        quentin.printStats();
        monster.printStats();
        monster2.printStats();
        monster3.printStats();

    }

}
