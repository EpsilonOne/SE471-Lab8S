import java.util.ArrayList;

public abstract class DirectAdministrator extends Administrator {


    public Boolean getFeedback(){
        System.out.println("Feedback by " + this.name + ".");
        //Do I need to report?? For now, yes...
        return true;
    }

    @Override
    public void seeDanger(HReporter_IF r, Hazard h) {
        System.out.println(name + " Got it!");
        for(Employee member:members){
            if(member != r)
                member.seeDanger(this, h);
        }
        if(overseer != null)
            overseer.seeDanger(this, h);
    }
}
