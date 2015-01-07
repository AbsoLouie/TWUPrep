package main.Chapter7;

public class Troll implements Monster {
    private int currentHealth = 40;
    private String name = "Troll";

    @Override
    public int getCurrentHealth() {
        return currentHealth;
    }

    @Override
    public void takeDamage(int damage) {
        currentHealth = currentHealth - (damage/2);
    }

    @Override
    public String getName() {
        return name;
    }
}
