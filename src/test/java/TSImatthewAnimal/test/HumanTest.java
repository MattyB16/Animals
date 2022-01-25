package TSImatthewAnimal.test;

import com.TSImatthewAnimal.Human;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HumanTest {

    @Test
    public void testAge() {

        Human h = new Human();
        h.setAge(22);
        assertEquals(22,h.getAge(),  "Wrong age.");

    }

    @Test
    public void testName() {

        Human testAnimal_h = new Human();
        testAnimal_h.setName("Matthew");
        assertEquals("Matthew",testAnimal_h.getName(),  "That's not his or her name.");

    }

    @Test
    public void testGender() {

        Human testAnimal_h = new Human();
        testAnimal_h.setGender("Male");
        assertEquals("Male",testAnimal_h.getGender(),  "That's not right gender.");
    }
}
