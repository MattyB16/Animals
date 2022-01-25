package TSImatthewAnimal.test;

import com.TSImatthewAnimal.Seagull;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeagullTest {

    @Test
    void age_test() {

        Seagull s = new Seagull();
        s.setAge(16);
        assertEquals(s.getAge(), 16, "Wrong age.");

    }

    @Test
    void name_test() {

        Seagull testAnimal_s = new Seagull();
        testAnimal_s.setName("Guss");
        assertEquals(testAnimal_s.getName(), "Guss", "That's not his or her name.");

    }

    @Test
    void gender_test() {

        Seagull testAnimal_s = new Seagull();
        testAnimal_s.setGender("Female");
        assertEquals(testAnimal_s.getGender(), "Female", "That's not right gender.");

    }

    @Test
    void take_off_test() {

        Seagull testAnimal_s = new Seagull();
        testAnimal_s.takeoff();
        assertEquals(testAnimal_s.takeoff(),"Take off method involves jumping with a large flap.","Incorrect Take off Method.");

    }

    @Test
    void flight_test() {

        Seagull testAnimal_s = new Seagull();
        testAnimal_s.flight();
        assertEquals(testAnimal_s.flight(),"Flight method is wings flapping to rise and gliding to fall.","Incorrect Flight Method.");

    }

    @Test
    void landing_test() {

        Seagull testAnimal_s = new Seagull();
        testAnimal_s.landing();
        assertEquals(testAnimal_s.landing(),"Landing method involves holding wings wide to slow decent and landing on feet.","Incorrect Landing Method.");

    }

}
