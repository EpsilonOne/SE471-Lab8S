import javax.print.DocFlavor;
import java.util.GregorianCalendar;

public class main {
    public static void main(String[] args) {
        HReporter_IF company;

        //CEO & Managers
        CEO steve = new CEO("Steve");
        Manager bob = new Manager("Bob");
        bob.setDirectOverseer(steve);
        Manager rachel = new Manager("Rachel");
        rachel.setDirectOverseer(steve);

        //Supervisors & Project Leaders
        Supervisor jack = new Supervisor("Jack");
        jack.setDirectOverseer(bob);
        Supervisor jeff = new Supervisor("Jeff");
        jeff.setDirectOverseer(bob);
        ProjectLeader chuck = new ProjectLeader("Chuck");
        chuck.setDirectOverseer(rachel);
        ProjectLeader denise = new ProjectLeader("Denise");
        denise.setDirectOverseer(rachel);

        //Jack's Regular Employees
        RegularEmployee nick = new RegularEmployee("Nick");
        nick.setDirectOverseer(jack);
        RegularEmployee john = new RegularEmployee("John");
        john.setDirectOverseer(jack);
        RegularEmployee mary = new RegularEmployee("Mary");
        mary.setDirectOverseer(jack);
        RegularEmployee jane = new RegularEmployee("Jane");
        jane.setDirectOverseer(jack);
        RegularEmployee tom = new RegularEmployee("Tom");
        tom.setDirectOverseer(jack);

        //Jeff's Regular Employees
        RegularEmployee rob = new RegularEmployee("Rob");
        rob.setDirectOverseer(jeff);
        RegularEmployee ed = new RegularEmployee("Ed");
        ed.setDirectOverseer(jeff);
        RegularEmployee rick = new RegularEmployee("Rick");
        rick.setDirectOverseer(jeff);
        RegularEmployee michael = new RegularEmployee("Michael");
        michael.setDirectOverseer(jeff);

        //Chuck's Regular Employees
        RegularEmployee joe = new RegularEmployee("Joe");
        joe.setDirectOverseer(chuck);
        RegularEmployee frank = new RegularEmployee("Frank");
        frank.setDirectOverseer(chuck);
        RegularEmployee sam = new RegularEmployee("Sam");
        sam.setDirectOverseer(chuck);
        RegularEmployee greg = new RegularEmployee("Greg");
        greg.setDirectOverseer(chuck);

        //Denise's Regular Employees
        RegularEmployee amy = new RegularEmployee("Amy");
        amy.setDirectOverseer(denise);
        RegularEmployee will = new RegularEmployee("Will");
        will.setDirectOverseer(denise);
        RegularEmployee nancy = new RegularEmployee("Nancy");
        nancy.setDirectOverseer(denise);
        RegularEmployee adam = new RegularEmployee("Adam");
        adam.setDirectOverseer(denise);


        john.seeDanger(null, new Hazard("Gas Leak", "Big Tank", 2));

    }

}
