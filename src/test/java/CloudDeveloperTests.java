import org.example.CloudDeveloper;
import org.example.Website;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CloudDeveloperTests {

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
