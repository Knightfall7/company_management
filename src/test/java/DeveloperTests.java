import org.example.Employees.Developer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeveloperTests {
    Developer developer;

    @BeforeEach
    public void init(){
        developer = new Developer("Chris Nkuutu", "Java");

    }

    @Test
    public void testGetSound() {
        var developer = new Developer("Chris Nkuutu", "Java");

        var expected = "Woop woop!";
        var actual = developer.getSound();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetProgrammingLanguage() {
        var developer = new Developer("Chris Nkuutu", "Java");

        var expected = "Java";
        var actual = developer.getProgrammingLanguage();

        assertEquals(expected, actual);
    }
    @Test
    public void testProgram(){
        var expected = "Chris Nkuutu writes some Java";
        var actual = developer.program();

        assertEquals(expected, actual);
    }
}
