public class FileReport extends Decision {

    @Override
    public void execute(CEO commander) {
        commander.report();
    }
}
