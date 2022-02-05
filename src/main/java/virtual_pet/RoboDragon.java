package virtual_pet;

public class RoboDragon extends Robotic{

    private boolean operational;

    public RoboDragon(String name, int age, int health, int charge, int errors, boolean operational) {
        super(name, age, health, charge, errors);
        this.operational = operational;
    }

    @Override
    public void fix() {

    }
}
