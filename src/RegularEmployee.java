public class RegularEmployee extends Employee {

    public RegularEmployee(String e) {
        super();
        this.overseer = null;
        this.name = e;
    }

    @Override
    public void seeDanger(HReporter_IF r, Hazard h) {
        if(r != null)
            fixIt();
        else{
            System.out.println(name + " has found a " + h.getType() + " reporting to supervisor: "+overseer.name);
            fixIt();
            overseer.seeDanger(this, h);
        }
    }

    @Override
    public void evacuate() {
        System.out.println("The employee " + this.name + " is evacuating.");
    }

    public void fixIt(){
        System.out.println("The employee " + this.name + " is fixing it.");
    }
}
