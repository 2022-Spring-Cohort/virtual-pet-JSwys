package virtual_pet;

public class RoboWolf extends Robotic implements Walkable{

    private boolean operational;

    public RoboWolf(String name, int age, int health, int charge, int errors, boolean operational) {
        super(name, age, health, charge, errors);
        this.operational = operational;
    }

    @Override
    public void fix() {
        operational = true;
    }

    @Override
    public void walk() {

    }

}
