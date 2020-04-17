import java.util.ArrayList;

public class Supervisor extends DirectAdministrator {
    public Supervisor() {
    }

    public Supervisor(String name) {
        super();
        this.name = name;
        this.overseer = null;
        this.members = new ArrayList<>();

    }
}
