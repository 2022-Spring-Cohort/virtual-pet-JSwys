package virtual_pet;

public abstract class Robotic extends Pet {

    protected int charge;
    protected int errors;
    protected boolean operational;

    public Robotic(String name, int age, int health, int charge, int errors, boolean operational) {
        super(name, age, health);
        this.charge = charge;
        this.errors = errors;
        this.operational = operational;
    }

    public void status() {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Health = " + health);
        System.out.println("Charge = " + charge + "/10");
        System.out.println("Errors = " + errors + "/10");
        if (operational) {
            System.out.println("Operational");
        } else {
            System.out.println("Broken");
        }
        System.out.println("---");
    }

    public void tick() {
        age++;
        errors++;
        charge--;
        int healthCheck;
        int brokenCheck;
        if (errors > 5 && errors < 10) {
            brokenCheck = (int) (Math.random() * 10 + 1);
            if (brokenCheck > 7) {
                operational = false;
            }
        }
        if (errors >= 10) {
            errors = 10;
            operational = false;
        }
        if (charge < 5 && charge > 0) {
            healthCheck = (int) (Math.random() * 10 + 1);
            if (healthCheck > 6) {
                health--;
                if (health < 0) {
                    health = 0;
                }
            }
        }
        if (charge <= 0) {
            charge = 0;
            health--;
            if (health < 0) {
                health = 0;
            }
        }
    }

    public void troubleshoot() {
        errors -= 5;
        if (errors < 0) {
            errors = 0;
        }
    }

    public void recharge() {
        charge += 5;
        if (charge > 10) {
            charge = 10;
        }
    }

    public void fix() {
        operational = true;
    }
}
