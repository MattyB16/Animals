package TSImatthewAnimal.test;

import com.TSImatthewAnimal.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KoalaTest {


    @Test
    void age_test() {

        Animal k = new Koala();
        k.setAge(16);
        assertEquals(k.getAge(), 16, "Wrong age");

    }

    @Test
    void name_test() {

        Animal testAnimal_k = new Koala();
        testAnimal_k.setName("Pongy");
        assertEquals(testAnimal_k.getName(), "Pongy", "That's not his or her name");



    }
    @Test
    void gender_test() {

        Animal testAnimal_k = new Koala();
        testAnimal_k.setGender("Male");
        assertEquals(testAnimal_k.getGender(), "Male", "Wrong Gender");

    }




}
