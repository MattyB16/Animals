package TSImatthewAnimal.test;

import com.TSImatthewAnimal.ClownFish;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClownFishTest {

    @Test
    public void testAge() {

        ClownFish c = new ClownFish();
        c.setAge(16);
        assertEquals( 16,c.getAge(), "Wrong age.");

    }

    @Test
    public void testName() {

        ClownFish testAnimal_c = new ClownFish();
        testAnimal_c.setName("Nemo");
        assertEquals("Nemo",testAnimal_c.getName(),  "That's not his or her name.");

    }
    @Test
    public void testGender() {

        ClownFish testAnimal_c = new ClownFish();
        testAnimal_c.setGender("Both");
        assertEquals("Both",testAnimal_c.getGender(),  "That's not the right gender.");

    }
}
