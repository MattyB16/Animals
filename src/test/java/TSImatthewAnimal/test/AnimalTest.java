package TSImatthewAnimal.test;

import com.TSImatthewAnimal.Animal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTest {


    @Test

    void age_test(){

        Animal testAnimal = new Animal();
        assertEquals(testAnimal.setAge(16), 16, "Wrong age");

    }

}
