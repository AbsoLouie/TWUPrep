package main.Chapter7;

public class Orc implements Monster {
    private int currentHealth = 20;
    private String name = "Orc";

    @Override
    public int getCurrentHealth() {
        return currentHealth;
    }

    @Override
    public void takeDamage(int damage) {
        currentHealth = currentHealth - damage;
    }

    @Override
    public String getName() {
        return name;
    }
}
