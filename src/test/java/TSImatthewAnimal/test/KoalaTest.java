package TSImatthewAnimal.test;

import com.TSImatthewAnimal.Koala;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KoalaTest {


    @Test
    public void testAge() {

        Koala k = new Koala();
        k.toString();
        k.setAge(16);
        assertEquals(16, k.getAge(), "Wrong age");

    }

    @Test
    public void testName() {

        Koala testAnimal_k = new Koala();
        testAnimal_k.setName("Pongy");
        assertEquals("Pongy",testAnimal_k.getName(),  "That's not his or her name");



    }
    @Test
    public void testGender() {

        Koala testAnimal_k = new Koala();
        testAnimal_k.setGender("Male");
        assertEquals("Male",testAnimal_k.getGender(),  "Wrong Gender");

    }




}
