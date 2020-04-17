import java.util.ArrayList;

public class ProjectLeader extends DirectAdministrator {
    public ProjectLeader(String name) {
        super();
        this.name = name;
        this.overseer = null;
        this.members = new ArrayList<>();

    }
}
