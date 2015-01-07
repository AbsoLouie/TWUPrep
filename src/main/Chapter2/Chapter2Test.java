package main.Chapter2;

import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Chapter2Test {
    @Test
    public void testIncrementAndTotal() throws Exception {
        Chapter2 chapter = new Chapter2();
        for (int i=1; i<=5; i++) {
            chapter.increment();
        }
        assertEquals(5, chapter.total());
    }
}
