package DSA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Crawllogfolder {

    @Test
    public void test1() {
        String[] logs = {"d1/","d2/","../","d21/","./"};
        int expected = 2;
        assertEquals(expected, minOperations(logs));
    }

    @Test
    public void test2() {
        String[] logs = {"d1/","d2/","./","d3/","../","d31/"};
        int expected = 3;
        assertEquals(expected, minOperations(logs));
    }

    @Test
    public void test3() {
        String[] logs = {"d1/","../","../","../"};
        int expected = 0;
        assertEquals(expected, minOperations(logs));
    }

    public int minOperations(String[] logs) {
        int depth = 0;

        for (String log : logs) {
            if (log.equals("../")) {
                if (depth > 0) {
                    depth--;
                }
            } else if (!log.equals("./")) {
                depth++;
            }
        }

        return depth;
    }
}
