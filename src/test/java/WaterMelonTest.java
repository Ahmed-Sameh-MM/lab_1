import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class WaterMelonTest {
    WaterMelon waterMelon = new WaterMelon();

    Map<Integer, String> testCases = new HashMap<Integer, String>();

    @Test
    public void test() {

        testCases.put(2, "NO");
        testCases.put(10, "YES");
        testCases.put(18, "YES");
        testCases.put(5, "NO");
        testCases.put(100, "YES");
        testCases.put(93, "NO");
        testCases.put(71, "NO");
        testCases.put(60, "YES");
        testCases.put(9, "NO");
        testCases.put(21, "NO");

        for(Map.Entry m:testCases.entrySet()) {
            int result = (Integer) m.getKey();
            assertEquals(m.getValue(), waterMelon.divide(result));
        }
    }
}
