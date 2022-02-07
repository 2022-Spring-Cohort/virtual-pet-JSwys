package virtual_pet;

public abstract class Organic extends Pet {

    protected int happyLevel;
    protected int hungerLevel;
    protected boolean cageClean;

    public Organic(String name, int age, int health, int happyLevel, int hungerLevel, boolean cageClean) {
        super(name, age, health);
        this.happyLevel = happyLevel;
        this.hungerLevel = hungerLevel;
        this.cageClean = cageClean;
    }

    public void status() {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Health = " + health);
        System.out.println("Happiness = " + happyLevel + "/10");
        System.out.println("Hunger = " + hungerLevel + "/10");
        if (cageClean) {
            System.out.println("Cage is clean");
        } else {
            System.out.println("Cage is filthy");
        }
        System.out.println("---");
    }

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
        if (happyLevel < 5 && happyLevel >= 0) {
            cageCheck = (int) (Math.random() * 10 + 1);
            if (cageCheck > 7) {
                cageClean = false;
            }
        }
        if (happyLevel <= 0) {
            happyLevel = 0;
            cageClean = false;
        }
    }


    public void feed() {
        hungerLevel -= 5;
        if (hungerLevel < 0) {
            hungerLevel = 0;
        }
    }

    public void play() {
        happyLevel += 5;
        if (happyLevel > 10) {
            happyLevel = 10;
        }
    }

    public void clean() {
        if (!cageClean) {
            cageClean = true;
        }
    }

}
