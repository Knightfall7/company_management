import org.example.Employee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTests {
    @Test
    public void testConstructorSetName() {
        var employee = new Employee("Chris");

        var expected = "Chris";
        var actaul = employee.getName();

        assertEquals(expected, actaul);

    }

    @Test
    public void testGetSound() {
        var employee = new Employee("Chris Nkuutu");

        var expected = "Aaow!";
        var actual = employee.getSound();

        assertEquals(expected, actual);

    }

    @Test
    public void testEatFood() {
        var employee = new Employee("chris Nkuutu");

        var expected = "Nom Nom Nom";
        var actual = employee.eatFood();

        assertEquals(expected, actual);

    }
    @Test
    public void testSendFeedback(){
        var employee = new Employee("Chris Nkuutu");

        var expected = "Feedback sent";
        var actual = employee.sendFeedback();

        assertEquals(expected, actual);


    }

    }
