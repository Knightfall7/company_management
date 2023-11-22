import org.example.Employees.CloudDeveloper;
import org.example.Website;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CloudDeveloperTests {
    CloudDeveloper cloudDeveloper;

    @BeforeEach
    public void init(){
        cloudDeveloper = new CloudDeveloper("Chris Nkuutu", "Java");

    }

    @Test
    public void testFixWebsite(){
        var cloudDeveloper = new CloudDeveloper("Chris", "Java");

        var website = new Website(false); //Working = false
        cloudDeveloper.FixWebsite(website);

        var expected = true;
        var actual = website.isWorking();

        assertEquals(expected, actual);

    }
}
