package virtual_pet;

public abstract class Organic extends Pet {

    protected int happyLevel;
    protected int hungerLevel;

    public Organic(String name, int age, int health, int happyLevel, int hungerLevel) {
        super(name, age, health);
        this.happyLevel = happyLevel;
        this.hungerLevel = hungerLevel;
    }

    public void status() {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Health = " + health);
        System.out.println("Happiness = " + happyLevel + "/10");
        System.out.println("Hunger = " + hungerLevel + "/10");
        System.out.println("---");
    }

    public void tick() {
        age++;
        hungerLevel++;
        happyLevel--;
        int healthCheck;
        if (hungerLevel > 5 && hungerLevel < 10) {
            healthCheck = (int) (Math.random() * 10 + 1);
            if (healthCheck > 6) {
                health--;
            }
        }
        if (hungerLevel >= 10) {
            hungerLevel = 10;
            health --;
        }
        if (happyLevel < 5 && happyLevel >= 0) {
            healthCheck = (int) (Math.random() * 10 + 1);
            if (healthCheck > 6) {
                health--;
            }
        }
        if (happyLevel < 0) {
            happyLevel = 0;
            health --;
        }
    }


    public void feed() {
        hungerLevel -= 3;
        if (hungerLevel < 0) {
            hungerLevel = 0;
        }
    }

    public void play() {
        happyLevel += 3;
        if (happyLevel > 10) {
            happyLevel = 10;
        }
    }

    public abstract void clean();

}
