
import org.example.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

    public class PersonTest {
        Person p;

        @BeforeEach
        public void setup() {
            p = new Person("Louai","HAMMA",22);
        }


        @Test
        public void getFullNameTest(){

            String FullNameResult = p.getFullName();

            Assertions.assertEquals("Louai HAMMA", FullNameResult);
        }

        @Test
        public void isAdultShouldReturnTrueIfAgeISGreaterThanOrEqualTo18(){
            boolean AgeResult = p.isAdult();
            Assertions.assertEquals(true, AgeResult);
        }

        @Test
        public void isAdultShouldReturnFalseIfAgeISLessThanOrEqualTo18(){
            boolean AgeResult = p.isAdult();
            Assertions.assertEquals(false, AgeResult);
        }
    }


