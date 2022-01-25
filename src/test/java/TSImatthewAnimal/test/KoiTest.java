package TSImatthewAnimal.test;

import com.TSImatthewAnimal.Koi;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KoiTest {

    @Test
    public void testAge() {

        Koi ko = new Koi();
        ko.setAge(16);
        assertEquals(16,ko.getAge(),  "Wrong age.");

    }

    @Test
    public void testName() {

        Koi testAnimal_ko = new Koi();
        testAnimal_ko.setName("Kraig");
        assertEquals("Kraig",testAnimal_ko.getName(),  "That's not his or her name.");

    }

    @Test
    public void testGender() {

        Koi testAnimal_ko = new Koi();
        testAnimal_ko.setGender("Female");
        assertEquals("Female",testAnimal_ko.getGender(),  "That's not right gender.");

    }
}
