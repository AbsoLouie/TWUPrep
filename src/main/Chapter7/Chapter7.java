package main.Chapter7;

import java.util.ArrayList;

public class Chapter7 {
    public static void main(String [] Args) {
        ArrayList<Monster> monsterParty = new ArrayList<Monster>();
        Monster orc = new Orc();
        Monster troll = new Troll();

        monsterParty.add(orc);
        monsterParty.add(troll);

        for(Monster monster : monsterParty) {
            monster.takeDamage(10);
        }

        for(Monster monster : monsterParty) {
            System.out.println(monster.getName() + " has " + monster.getCurrentHealth() + " HP left.");
        }
    }
}
