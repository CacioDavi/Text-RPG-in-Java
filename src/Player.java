import Species.Specie;
import Status.Status;
import Types.Place;

public class Player {
    private String name;
    private Specie specie;

    private Status status;

    void attack () {
        System.out.println("Toma essa!");
    }

    void takeDamage(Float amount) {
        status.setHealth(status.getHealth() - amount);
    }

    void WalkTo(Place place) {
        
    }
}
