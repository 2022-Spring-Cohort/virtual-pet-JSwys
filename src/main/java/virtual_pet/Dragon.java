package virtual_pet;

public class Dragon extends Organic{

    private boolean cageClean;

    public Dragon(String name, int age, int health, int happyLevel, int hungerLevel, boolean cageClean) {
        super(name, age, health, happyLevel, hungerLevel);
        this.cageClean = cageClean;
    }


    @Override
    public void clean() {
        cageClean = true;
    }
}
