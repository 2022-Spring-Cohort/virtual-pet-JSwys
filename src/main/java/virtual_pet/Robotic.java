package virtual_pet;

public abstract class Robotic extends Pet {

    protected int charge;
    protected int errors;

    public Robotic(String name, int age, int health, int charge, int errors) {
        super(name, age, health);
        this.charge = charge;
        this.errors = errors;
    }

    public void status() {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Health = " + health);
        System.out.println("Charge = " + charge + "/10");
        System.out.println("Errors = " + errors + "/10");
        System.out.println("---");
    }

    public void tick() {
        age++;
        errors++;
        charge--;
        int healthCheck;
        if (errors > 5 && errors < 10) {
            healthCheck = (int) (Math.random() * 10 + 1);
            if (healthCheck > 6) {
                health--;
            }
        }
        if (errors >= 10) {
            errors = 10;
            health--;
        }
        if (charge < 5 && charge >= 0) {
            healthCheck = (int) (Math.random() * 10 + 1);
            if (healthCheck > 6) {
                health--;
            }
        }
        if (charge < 0) {
            charge = 0;
            health--;
        }
    }

    public void troubleshoot() {
        errors -= 3;
        if (errors < 0) {
            errors = 0;
        }
    }

    public void recharge() {
        charge += 3;
        if (charge > 10) {
            charge = 10;
        }
    }

    public void fix() {

    }
}
