public class DirectAdministrator extends Administrator {

    public Employee overseer;

    public void getFeedback(){

    }

    public void seeDanger(HReporter_IF r, Hazard h){
        System.out.println(name + " Got it!");
        for(Employee member:members){
            if(member != r)
                member.seeDanger(this, h);
        }
        if(overseer != null)
            overseer.seeDanger(this, h);
    }
}
