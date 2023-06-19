package DSA;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ringsandRods {
    @Test
    public void test1() {
        String rings = "B0B6G0R6R0R6G9";
        int expected = 1;
        assertEquals(expected, countRodsWithAllColors(rings));
    }

    @Test
    public void test2() {
        String rings = "B0R0G0R9R0B0G0";
        int expected = 1;
        assertEquals(expected, countRodsWithAllColors(rings));
    }

    @Test
    public void test3() {
        String rings = "G4";
        int expected = 0;
        assertEquals(expected, countRodsWithAllColors(rings));
    }

    public int countRodsWithAllColors(String rings) {
        int[] rods = new int[10];
        int count = 0;

        for (int i = 0; i < rings.length(); i += 2) {
            char color = rings.charAt(i);
            int rod = rings.charAt(i + 1) - '0';

            rods[rod] |= (1 << (color - 'A'));
        }

        for (int rod : rods) {
            if (rod == 7) {
                count++;
            }
        }

        return count;
    }
}
