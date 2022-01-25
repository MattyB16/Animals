package TSImatthewAnimal.test;

import com.TSImatthewAnimal.Animal;
import com.TSImatthewAnimal.Eagle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EagleTest {

    @Test
    void age_test() {

        Animal e = new Eagle();
        e.setAge(16);
        assertEquals(e.getAge(), 16, "Wrong age");

    }

    @Test
    void name_test() {

        Animal testAnimal_e = new Eagle();
        testAnimal_e.setName("Bald");
        assertEquals(testAnimal_e.getName(), "Bald", "That's not his or her name");
        

    }
}
