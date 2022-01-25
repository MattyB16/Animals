package TSImatthewAnimal.test;

import com.TSImatthewAnimal.Animal;
import com.TSImatthewAnimal.Koi;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KoiTest {

    @Test
    void age_test() {

        Animal ko = new Koi();
        ko.setAge(16);
        assertEquals(ko.getAge(), 16, "Wrong age");

    }

    @Test
    void name_test() {

        Animal testAnimal_ko = new Koi();
        testAnimal_ko.setName("Kraig");
        assertEquals(testAnimal_ko.getName(), "Kraig", "That's not his or her name");



    }
}
