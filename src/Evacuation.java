public class Evacuation extends Decision {

    @Override
    public void execute(CEO commander) {
        commander.evacuate();
    }
}
