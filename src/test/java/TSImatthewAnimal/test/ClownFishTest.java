package TSImatthewAnimal.test;

import com.TSImatthewAnimal.ClownFish;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClownFishTest {

    @Test
    void age_test() {

        ClownFish c = new ClownFish();
        c.setAge(16);
        assertEquals(c.getAge(), 16, "Wrong age.");

    }

    @Test
    void name_test() {

        ClownFish testAnimal_c = new ClownFish();
        testAnimal_c.setName("Nemo");
        assertEquals(testAnimal_c.getName(), "Nemo", "That's not his or her name.");

    }
    @Test
    void gender_test() {

        ClownFish testAnimal_c = new ClownFish();
        testAnimal_c.setGender("Both");
        assertEquals(testAnimal_c.getGender(), "Both", "That's not the right gender.");

    }
}
