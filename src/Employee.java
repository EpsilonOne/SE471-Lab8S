public abstract class Employee implements HReporter_IF {

    String name;
    Administrator overseer;

    @Override
    public void seeDanger(HReporter_IF r, Hazard h) {

    }

    public void evacuate(){

    }

    @Override
    public void setDirectOverseer(HReporter_IF r) {
        overseer = (Administrator)r;
    }

    @Override
    public HReporter_IF getDirectOverseer() {
        return overseer;
    }
}
