package org.launchcode.techjobs.oo;
import org.junit.BeforeClass;
import org.junit.Test;
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
}
