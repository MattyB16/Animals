package TSImatthewAnimal.test;

import com.TSImatthewAnimal.*;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTest {


    @Test
    void age_test(){

        Animal k = new Koala();
        Animal h = new Human();
        Animal e = new Eagle();
        Animal s = new Seagull();
        Animal c = new ClownFish();
        Animal ko = new Koi();

        k.setAge(16);
        h.setAge(16);
        e.setAge(16);
        s.setAge(16);
        c.setAge(16);
        ko.setAge(16);

        assertEquals(k.getAge(), 16, "Wrong age");
        assertEquals(h.getAge(), 16, "Wrong age");
        assertEquals(e.getAge(), 16, "Wrong age");
        assertEquals(s.getAge(), 16, "Wrong age");
        assertEquals(c.getAge(), 16, "Wrong age");
        assertEquals(ko.getAge(), 16, "Wrong age");

    }
    @Test
    void name_test(){

        Animal testAnimal_k = new Koala();
        Animal testAnimal_h = new Human();
        Animal testAnimal_e = new Eagle();
        Animal testAnimal_s = new Seagull();
        Animal testAnimal_c = new ClownFish();
        Animal testAnimal_ko = new Koi();

        testAnimal_k.setName("Pongy");
        testAnimal_h.setName("Pongy");
        testAnimal_e.setName("Pongy");
        testAnimal_s.setName("Pongy");
        testAnimal_c.setName("Pongy");
        testAnimal_ko.setName("Pongy");

        assertEquals(testAnimal_k.getName(), "Pongy", "That's not his or her name");
        assertEquals(testAnimal_h.getName(), "Pongy", "That's not his or her name");
        assertEquals(testAnimal_e.getName(), "Pongy", "That's not his or her name");
        assertEquals(testAnimal_s.getName(), "Pongy", "That's not his or her name");
        assertEquals(testAnimal_c.getName(), "Pongy", "That's not his or her name");
        assertEquals(testAnimal_ko.getName(), "Pongy", "That's not his or her name");

    }



}
