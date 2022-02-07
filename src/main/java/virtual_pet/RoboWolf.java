package virtual_pet;

public class RoboWolf extends Robotic implements Walkable{

    private boolean walked = false;

    public RoboWolf(String name, int age, int health, int charge, int errors, boolean operational, boolean walked) {
        super(name, age, health, charge, errors, operational);
    }

    public boolean isWalked() {
        return walked;
    }

    @Override
    public void walk() {
        walked = true;
        charge--;
        errors++;
    }



}
