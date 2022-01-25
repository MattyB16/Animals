package TSImatthewAnimal.test;

import com.TSImatthewAnimal.Animal;
import com.TSImatthewAnimal.Koala;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTest {


    @Test
    void age_test(){

        Animal testAnimal = new Koala();
        testAnimal.setAge(16);
        assertEquals(testAnimal.getAge(), 16, "Wrong age");

    }

}
