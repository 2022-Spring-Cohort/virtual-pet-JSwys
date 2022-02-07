package virtual_pet;

public class Wolf extends Organic implements Walkable{

    private boolean walked = false;


    public Wolf(String name, int age, int health, int happyLevel, int hungerLevel, boolean cageClean, boolean walked) {
        super(name, age, health, happyLevel, hungerLevel, cageClean);
        this.walked = walked;
    }

    public boolean isWalked() {
        return walked;
    }

    @Override
    public void walk() {
        walked = true;
    }

    @Override
    public void tick() {
        age++;
        hungerLevel++;
        happyLevel--;
        int healthCheck;
        int cageCheck;
        if (hungerLevel > 5 && hungerLevel < 10) {
            healthCheck = (int) (Math.random() * 10 + 1);
            if (healthCheck > 6) {
                health--;
                if (health < 0) {
                    health = 0;
                }
            }
        }
        if (hungerLevel >= 10) {
            hungerLevel = 10;
            health --;
            if (health < 0) {
                health = 0;
            }
        }
        if (happyLevel < 5 && happyLevel >= 0 && !walked) {
            cageCheck = (int) (Math.random() * 10 + 1);
            if (cageCheck > 7) {
                cageClean = false;
            }
        }
        if (happyLevel < 5 && happyLevel >= 0 && walked) {
            cageCheck = (int) (Math.random() * 10 + 1);
            if (cageCheck == 10) {
                cageClean = false;
            }
        }
        if (happyLevel <= 0) {
            happyLevel = 0;
            cageClean = false;

        }
    }
}
