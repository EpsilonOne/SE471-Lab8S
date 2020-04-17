public class Evacuation extends Decision {

    public Evacuation() {
        super();
    }

    @Override
    public void execute(CEO commander) {
        commander.evacuate();
    }
}
