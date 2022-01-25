package TSImatthewAnimal.test;

import com.TSImatthewAnimal.Human;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HumanTest {

    @Test
    void age_test() {

        Human h = new Human();
        h.setAge(22);
        assertEquals(h.getAge(), 22, "Wrong age.");

    }

    @Test
    void name_test() {

        Human testAnimal_h = new Human();
        testAnimal_h.setName("Matthew");
        assertEquals(testAnimal_h.getName(), "Matthew", "That's not his or her name.");

    }

    @Test
    void gender_test() {

        Human testAnimal_h = new Human();
        testAnimal_h.setGender("Male");
        assertEquals(testAnimal_h.getGender(), "Male", "That's not right gender.");
    }
}
