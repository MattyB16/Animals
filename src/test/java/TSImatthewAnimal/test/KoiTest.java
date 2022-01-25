package TSImatthewAnimal.test;

import com.TSImatthewAnimal.Koi;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KoiTest {

    @Test
    void age_test() {

        Koi ko = new Koi();
        ko.setAge(16);
        assertEquals(ko.getAge(), 16, "Wrong age.");

    }

    @Test
    void name_test() {

        Koi testAnimal_ko = new Koi();
        testAnimal_ko.setName("Kraig");
        assertEquals(testAnimal_ko.getName(), "Kraig", "That's not his or her name.");

    }

    @Test
    void gender_test() {

        Koi testAnimal_ko = new Koi();
        testAnimal_ko.setGender("Female");
        assertEquals(testAnimal_ko.getGender(), "Female", "That's not right gender.");

    }
}
