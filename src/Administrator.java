import java.util.ArrayList;
import java.util.List;

public abstract class Administrator extends Employee {

    List<Employee> members;

    @Override
    public void seeDanger(HReporter_IF r, Hazard h) {

    }
        

    @Override
    public void evacuate() {
        for(Employee member:members){
            member.evacuate();
        }
        System.out.println("The employee " + this.name + " is evacuating.");
    }
}
