package TSImatthewAnimal.test;

import com.TSImatthewAnimal.Animal;
import com.TSImatthewAnimal.Flying;
import com.TSImatthewAnimal.Seagull;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeagullTest {


    @Test
    void age_test() {

        Animal s = new Seagull();
        s.setAge(16);
        assertEquals(s.getAge(), 16, "Wrong age");

    }

    @Test
    void name_test() {

        Animal testAnimal_s = new Seagull();
        testAnimal_s.setName("Guss");
        assertEquals(testAnimal_s.getName(), "Guss", "That's not his or her name");

    }

    @Test
    void flight_test() {

        Seagull testAnimal_s = new Seagull();
        testAnimal_s.flight();
        assertEquals(testAnimal_s.flight(),"Flight method is wings flapping to rise and gliding to fall.","Incorrect Flight Method.");

    }

}
