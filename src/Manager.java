import java.util.ArrayList;
import java.util.List;

public class Manager extends Administrator {
    public Manager(String name){
        this.name = name;
        this.overseer = null;
        this.members = new ArrayList<Employee>();
    }

    public List<Decision> suggestDecision(Hazard h){
        List<Decision> ds = new ArrayList<Decision>();

        for(Employee member:members){

        }
        return ds;
    }

    @Override
    public void seeDanger(HReporter_IF r, Hazard h) {
        Boolean reportToCEO = true;
        for(Employee member:members){
            DirectAdministrator d = (DirectAdministrator)member;
            if(d.getFeedback() == false)
                reportToCEO = false;
        }
        if(reportToCEO && overseer != null)
            overseer.seeDanger(this,h);
    }
}
