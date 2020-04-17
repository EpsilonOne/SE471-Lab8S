public abstract class Decision {

    Manager suggestedBy;
    int priority;
    Hazard hazard;


    public Decision(Manager suggestedBy, int priority, Hazard hazard) {
        this.suggestedBy = suggestedBy;
        this.priority = priority;
        this.hazard = hazard;
    }

    public Decision() {

    }

    public void execute(CEO commander){


    }
}
