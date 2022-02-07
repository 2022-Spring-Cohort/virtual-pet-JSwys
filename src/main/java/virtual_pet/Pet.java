package virtual_pet;

public abstract class Pet {

    protected String name;
    protected int age;
    protected int health;

    public Pet(String name, int age, int health) {
        this.name = name;
        this.age = age;
        this.health = health;
    }

    public abstract void tick();

    public abstract void status();

}