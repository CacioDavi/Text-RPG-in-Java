package Status;

public class Status {
    private Float Health;
    private Float Strength;
    private Float Velocity;

    Status(Float Health, Float Strength, Float Velocity) {
        this.Health = Health;
        this.Strength = Strength;
        this.Velocity = Velocity;
    }

    public Float getHealth() {
        return Health;
    }

    public Float getStrength() {
        return Strength;
    }

    public Float getVelocity() {
        return Velocity;
    }

    public void setHealth(Float health) {
        Health = health;
    }

    public void setStrength(Float strength) {
        Strength = strength;
    }

    public void setVelocity(Float velocity) {
        Velocity = velocity;
    }
}
