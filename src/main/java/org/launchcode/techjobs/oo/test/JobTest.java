package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)

public class JobTest {

    private Job testJob1;
    private Job testJob2;
    private Job testJob3;
    private Job testJob4;

    @Before
    public void createJobObject() {
       testJob1 = new Job();
       testJob2 = new Job();
       testJob3 = new Job("Product tester", new Employer("ACME"), new Location ("Desert"),
               new PositionType("Quality control"), new CoreCompetency("Persistence"));
       testJob4 = new Job("Product tester", new Employer("ACME"), new Location ("Desert"),
               new PositionType("Quality control"), new CoreCompetency("Persistence"));

    }

    @Test
    public void testSettingJobId() {
        assertEquals(1, testJob2.getId() - testJob1.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
       assertEquals("Product tester", testJob3.getName());
       assertEquals("ACME", testJob3.getEmployer().toString());
       assertEquals("Desert", testJob3.getLocation().toString());
       assertEquals("Quality control", testJob3.getPositionType().toString());
       assertEquals("Persistence", testJob3.getCoreCompetency().toString());
    }


    @Test
    public void testJobsForEquality() {
        assertFalse(testJob3.equals(testJob4));
    }

    @Test
    public void testJobHasBlankLines() {
        char char1 = testJob3.toString().charAt(0);
        char char2 = testJob3.toString().charAt(testJob3.toString().length()-1);
        assertEquals(char1, char2);
    }


//    objectName instanceof ClassName
//    @Test
//    public void testInitialGasTank() {
//        Car test_car = new Car("Toyota", "Prius", 10, 50);
//        assertEquals(10, test_car.getGasTankLevel(), .001);
//    }
}

