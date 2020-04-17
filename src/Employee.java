public abstract class Employee implements HReporter_IF {

    protected String name;
    protected Administrator overseer;

    @Override
    public void seeDanger(HReporter_IF r, Hazard h) {

    }

    public void evacuate(){
        System.out.println("The Employee "+this.name+" is evacuating");

    }

    @Override
    public void setDirectOverseer(HReporter_IF r) {
        overseer = (Administrator)r;
        overseer.members.add(this);
    }

    @Override
    public HReporter_IF getDirectOverseer() {
        return overseer;
    }
}
