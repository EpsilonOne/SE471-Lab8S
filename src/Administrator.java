import java.util.ArrayList;
import java.util.List;

public class Administrator extends Employee {

    private List<Employee> members;

    public Administrator(String name){
        this.name = name;
        this.overseer = null;
        this.members = new ArrayList<Employee>();
    }

    @Override
    public void seeDanger(HReporter_IF r, Hazard h) {

    }

    @Override
    public void evacuate() {
        for(Employee member:members){
            member.evacuate();
        }
        //this.evacuate();
    }
}
