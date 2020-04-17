import java.util.ArrayList;
import java.util.List;

public class CEO extends Administrator {

    public CEO(String name) {
        super();
        this.name = name;
        this.overseer = null;
        this.members = new ArrayList<>();
    }

    public void seeDanger(HReporter_IF r, Hazard h){
        List<Decision> decisions = new ArrayList<Decision>();
        for(Employee e: members){
            Manager m = (Manager)e;
            decisions.add((Decision) m.suggestDecision(h));
        }
        implementDecision(decisions);
    }

    public void implementDecision(List<Decision> ds){
        ds = sortByPriority(ds);
        Decision d = ds.get(0);
        System.out.println(ds.get(0));
        d.execute(this);

        d = ds.get(1);
        d.execute(this);

    }

    private List<Decision> sortByPriority(List<Decision> ds){
        return ds;
    }

    public void report(){
        System.out.println("The city’s environmental department is notified");
    }

    public void evacuate(){
        for (Employee m: members) {
            for (Employee sl: members) {
                for (Employee re: members) {
                    re.evacuate();
                }
                sl.evacuate();
            }
            m.evacuate();
        }
        this.evacuate();
    }
}
