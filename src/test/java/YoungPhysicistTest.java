import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class YoungPhysicistTest {
    YoungPhysicist young = new YoungPhysicist();

    @Test
    public void test() {
        int values[][] = {{10, 5, 7}, {-3, 5, 3}, {-7, -10, -10}};
        assertEquals("YES", young.isEquilibrium(values));

        values = new int[][] {{1, 3, -2}, {9, 5, 3}, {-2, -1, -7}};
        assertEquals("NO", young.isEquilibrium(values));

        values = new int[][] {{8, 4, 2}, {6, -7, 11}};
        assertEquals("NO", young.isEquilibrium(values));

        values = new int[][] {{0, 0, 0}};
        assertEquals("YES", young.isEquilibrium(values));

        values = new int[][] {{5, 3, -20}, {-11, 5, 30}, {6, -8, -10}};
        assertEquals("YES", young.isEquilibrium(values));

        values = new int[][] {{85, 31, -25}, {90, 15, 23}, {27, -18, 17}, {90, 12, 18}};
        assertEquals("NO", young.isEquilibrium(values));

        values = new int[][] {{18, 93, -12}, {29, 45, 35}, {21, 11, 71}};
        assertEquals("NO", young.isEquilibrium(values));

        values = new int[][] {{91, 0, -9}, {-91, 0, 9}};
        assertEquals("YES", young.isEquilibrium(values));

        values = new int[][] {{80, 39, -2}};
        assertEquals("NO", young.isEquilibrium(values));

        values = new int[][] {{-18, 30, -20}, {-10, 5, 3}, {38, -37, 17}, {-10, 2, 0}};
        assertEquals("YES", young.isEquilibrium(values));
    }
}
