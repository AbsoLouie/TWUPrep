package main.Chapter1;

import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by louie on 1/6/15.
 */
public class Chapter1Test {
    @Test
    public void testSumOddNumbers() throws Exception {
        assertEquals(Chapter1.sumOddNumbers(2), 1);
        assertEquals(Chapter1.sumOddNumbers(100), 2500);
    }
}
