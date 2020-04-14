import java.util.List;

public class CEO extends Administrator {

    public void implementDecision(List<Decision> ds){
        ds = sortByPriority(ds);
        Decision d = ds.get(0);
        d.execute(this);

        d = ds.get(1);
        d.execute(this);
    }

    private List<Decision> sortByPriority(List<Decision> ds){

    }

    public void report(){

    }
}
