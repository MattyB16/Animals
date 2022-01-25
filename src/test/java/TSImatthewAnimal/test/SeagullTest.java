package TSImatthewAnimal.test;

import com.TSImatthewAnimal.Seagull;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeagullTest {

    @Test
    public void testAge() {

        Seagull s = new Seagull();
        s.setAge(16);
        assertEquals(16,s.getAge(),  "Wrong age.");

    }

    @Test
    public void testName() {

        Seagull testAnimal_s = new Seagull();
        testAnimal_s.setName("Guss");
        assertEquals( "Guss", testAnimal_s.getName(), "That's not his or her name.");

    }

    @Test
    public void testGender() {

        Seagull testAnimal_s = new Seagull();
        testAnimal_s.setGender("Female");
        assertEquals("Female",testAnimal_s.getGender(),  "That's not right gender.");

    }

    @Test
    public void testTakeOff() {

        Seagull testAnimal_s = new Seagull();
        testAnimal_s.takeoff();
        assertEquals("Take off method involves jumping with a large flap.",testAnimal_s.takeoff(),"Incorrect Take off Method.");

    }

    @Test
    public void testFlight() {

        Seagull testAnimal_s = new Seagull();
        testAnimal_s.flight();
        assertEquals("Flight method is wings flapping to rise and gliding to fall.",testAnimal_s.flight(),"Incorrect Flight Method.");

    }

    @Test
    public void testLanding() {

        Seagull testAnimal_s = new Seagull();
        testAnimal_s.landing();
        assertEquals("Landing method involves holding wings wide to slow decent and landing on feet.",testAnimal_s.landing(),"Incorrect Landing Method.");

    }

}
