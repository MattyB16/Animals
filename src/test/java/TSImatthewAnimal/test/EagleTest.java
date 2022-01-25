package TSImatthewAnimal.test;

import com.TSImatthewAnimal.Eagle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EagleTest {

    @Test
    public void testAge() {

        Eagle e = new Eagle();
        e.setAge(16);
        assertEquals(16,e.getAge(),  "Wrong age");

    }

    @Test
    public void testName() {

        Eagle testAnimal_e = new Eagle();
        testAnimal_e.setName("Bald");
        assertEquals("Bald",testAnimal_e.getName(),  "That's not his or her name");
    }

    @Test
    public void testGender() {

        Eagle testAnimal_e = new Eagle();
        testAnimal_e.setGender("Female");
        assertEquals("Female",testAnimal_e.getGender(),  "That's not the right Gender.");
    }

}
