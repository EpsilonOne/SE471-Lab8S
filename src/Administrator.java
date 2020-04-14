import java.util.List;

public class Administrator extends Employee {

    private List<Employee> members;

    @Override
    public void seeDanger(HReporter_IF r, Hazard h) {

    }

    @Override
    public void evacuate() {
        for(Employee member:members){
            member.evacuate();
        }
        this.evacuate();
    }
}
