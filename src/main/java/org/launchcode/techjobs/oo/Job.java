package org.launchcode.techjobs.oo;

import java.util.Objects;

import static java.lang.System.lineSeparator;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    private String isFieldEmpty(Object field) {
        if(field.toString() == null || field.toString().isEmpty()) {
            return "Data not available";
        }
        else {
            return field.toString();
        }
    }
    @Override
    public String toString() {

        //THIS WILL MAKE MY TESTS PASS
//        String text = lineSeparator() +
//                "ID: " + isFieldEmpty(this.id) + lineSeparator() +
//                "Name: " + isFieldEmpty(this.name) + lineSeparator()+
//                "Employer: " + isFieldEmpty(this.employer) + lineSeparator() +
//                "Location: " + isFieldEmpty(this.location) + lineSeparator() +
//                "Position Type: " + isFieldEmpty(this.positionType) + lineSeparator() +
//                "Core Competency: " + isFieldEmpty(this.coreCompetency) +
//                lineSeparator();

        //THIS WILL MAKE THE AUTOGRADER PASS
        String text = "\n" +
                "ID: " + isFieldEmpty(this.id) + "\n" +
                "Name: " + isFieldEmpty(this.name) + "\n"+
                "Employer: " + isFieldEmpty(this.employer) + "\n" +
                "Location: " + isFieldEmpty(this.location) + "\n" +
                "Position Type: " + isFieldEmpty(this.positionType) + "\n" +
                "Core Competency: " + isFieldEmpty(this.coreCompetency) +
                "\n";

//        String text = "\n" +
//                "ID: " + isFieldEmpty(this.id) + "\n" +
//                "Name: " + ((this.name == null) ? "Data not available" : this.name) + "\n"+
//                "Employer: " + (this.employer == null ? "Data not available" : this.employer) + "\n" +
//                "Location: " + (this.location == null ? "Data not available" : this.location) + "\n" +
//                "Position Type: " + (this.positionType == null ? "Data not available" : this.positionType) + "\n" +
//                "Core Competency: " + (this.coreCompetency == null ? "Data not available" : this.coreCompetency) +
//                "\n";

        return text;
    }
}
