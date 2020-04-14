import java.util.List;

public class Manager extends Administrator {
    public List<Decision> ds;
    public List<Decision> suggestDecision(Hazard h){
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
