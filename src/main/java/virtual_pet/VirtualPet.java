package virtual_pet;

public class VirtualPet {

// instance variables

    private String name;
    private String type;
    private int age;
    private int hungerLevel;
    private int happyLevel;

// constructor

    public VirtualPet(String name, String type, int age, int hungerLevel, int happyLevel) {
        this.name = name;
        this.type = type;
        this.age = 0;
        this.hungerLevel = 5;
        this.happyLevel = 5;

    }

// getters

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getHappyLevel() {
        return happyLevel;
    }


// methods

    public void greeting() {
        System.out.println("Hi, I'm your new Virtual Pet! My name is " + getName() + ", and I'm a " +
                getType() + ". Each day my hunger will increase by 1, and my happiness will decrease by 1." +
                "\nIf my hunger rises to 10 or my happiness drops to 0 I will perish! " +
                "\nIf my happiness reaches 10 you win the game! It won't be easy, I may occasionally act out...");
    }

    public void status() {
        System.out.println ("I am " + getAge() + " days old. \nMy hunger level is " +
                getHungerLevel() + ". \nMy happy level is " +
                getHappyLevel() + ".");
    }

    public void feed() {
        hungerLevel -= 2;
    }

    public void comfort() {
        happyLevel += 2;
    }

    public void bite() {
        System.out.println(getName() + " bit you! (Hunger - 1 and Happy -2)");
        hungerLevel -= 1;
        happyLevel -= 2;
    }

    public void wallow() {
        System.out.println("Nothing means anything! Why even try?! (Hunger + 2 and Happy + 1");
        hungerLevel += 2;
        happyLevel += 1;
    }

    public void bored() {
        System.out.println("Every day is the same thing! (Hunger +1 and Happy -1)");
        hungerLevel += 1;
        happyLevel -= 1;
    }

    public void birthday() {
        System.out.println("Let's have some cake! (Hunger -2 and Happy + 2");
        hungerLevel -= 3;
        happyLevel += 3;
    }

    public void tick() {
        age++;
        hungerLevel += 1;
        happyLevel -= 1;
    }

    public void deathMessage() {
        System.out.println("I am no more. (You lose.)");
    }

    public void winMessage() {
        System.out.println("I'm so happy! What else could a " + getType() + " want?! (You win!)");
    }

}


