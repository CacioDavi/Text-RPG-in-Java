import Species.Specie;
import Status.Status;

public class Player {
    private Specie specie;

    private String name;

    private Status status;

    void attack () {
        System.out.println("Toma essa! há!");
    }

    void takeDamage(Float amount) {
        status.setHealth(status.getHealth() - amount);
    }
}
