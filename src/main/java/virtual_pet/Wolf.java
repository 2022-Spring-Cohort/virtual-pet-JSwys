package virtual_pet;

public class Wolf extends Organic implements Walkable{

    private boolean cageClean;

    public Wolf(String name, int age, int health, int happyLevel, int hungerLevel, boolean cageClean) {
        super(name, age, health, happyLevel, hungerLevel);
        this.cageClean = cageClean;
    }

    @Override
    public void clean() {
        cageClean = true;
    }

    @Override
    public void walk() {

    }

}
