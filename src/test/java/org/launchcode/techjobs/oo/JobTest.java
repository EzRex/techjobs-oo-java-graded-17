package org.launchcode.techjobs.oo;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static java.lang.System.lineSeparator;
import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

    //Test working first constructor
    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();

        assertNotEquals(job1.equals(job2), true);
    }

    //Test second constructor
    @Test
    public void testJobConstructorSetsAllFields() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        //assertEquals(job.getId(), 1);
        assertEquals(job.getName(), "Product tester");

        assertEquals(job.getEmployer().getValue(),"ACME");
        assertTrue(job.getEmployer() instanceof Employer );
        //assertEquals(job.getEmployer().getId(), 1);

        assertTrue(job.getLocation() instanceof Location);
        assertEquals(job.getLocation().getValue(), "Desert");
        //assertEquals(job.getLocation().getId(), 1);

        assertTrue(job.getPositionType() instanceof PositionType);
        assertEquals(job.getPositionType().getValue(), "Quality control");
        //assertEquals(job.getPositionType().getId(), 1);

        assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(job.getCoreCompetency().getValue(), "Persistence");
        //assertEquals(job.getCoreCompetency().getId(), 1);
    }

    //Tests the equals method
    @Test
    public void testJobsForEquality() {
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertNotEquals(job3.equals(job4), true);
    }

    //Tests if empty line before and after string
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        char[] jobText = job5.toString().toCharArray();
        char[] text = System.lineSeparator().toCharArray();
        //Did the following because lineseperator is a /r/n or /n depending on system. I converted the string to find the first character and last
        //So it could either be a /n - first; or a /n last for one system, or /r - first; /n - last for another system. It will read the first and last
        //char of a string.

        assertEquals(jobText[0], text[0]);
        assertEquals(jobText[jobText.length-1], text[text.length-1]);


    }

    //Tests for correct labels and data
    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job6 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        String test = System.lineSeparator() +
//                "ID: " + job6.getId() + lineSeparator() +
//                "Name: " + job6.getName() + lineSeparator() +
//                "Employer: " + job6.getEmployer() + lineSeparator() +
//                "Location: " + job6.getLocation() + lineSeparator() +
//                "Position Type: " + job6.getPositionType() + lineSeparator() +
//                "Core Competency: " + job6.getCoreCompetency() +
//                System.lineSeparator();

        String test = "\n" +
                "ID: " + job6.getId() + "\n"+
                "Name: " + job6.getName() + "\n" +
                "Employer: " + job6.getEmployer() + "\n" +
                "Location: " + job6.getLocation() + "\n" +
                "Position Type: " + job6.getPositionType() + "\n"+
                "Core Competency: " + job6.getCoreCompetency() +
                "\n";


        assertEquals(job6.toString(), test);
    }


    //Tests empty fields
    @Test
    public void testToStringHandlesEmptyField() {
        Job job6 = new Job("Product tester", new Employer(), new Location(), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String error = "Data not available";

//        String test = System.lineSeparator() +
//                "ID: " + job6.getId() + lineSeparator() +
//                "Name: " + job6.getName() + lineSeparator() +
//                "Employer: " + error + lineSeparator() +
//                "Location: " + error + lineSeparator() +
//                "Position Type: " + job6.getPositionType() + lineSeparator()+
//                "Core Competency: " + job6.getCoreCompetency() +
//                System.lineSeparator();


        String test = "\n" +
                "ID: " + job6.getId() + "\n"+
                "Name: " + job6.getName() + "\n" +
                "Employer: " + error + "\n" +
                "Location: " + error + "\n" +
                "Position Type: " + job6.getPositionType() + "\n"+
                "Core Competency: " + job6.getCoreCompetency() +
                "\n";

        assertEquals(job6.toString(), test);
    }
}
