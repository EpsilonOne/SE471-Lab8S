public class RegularEmployee extends Employee {

    @Override
    public void seeDanger(HReporter_IF r, Hazard h) {
        if(r != null)
            fixIt();
        else{
            fixIt();
            overseer.seeDanger(this, new Hazard());
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
