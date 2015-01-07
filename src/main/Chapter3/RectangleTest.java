package main.Chapter3;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RectangleTest {
    @Test
    public void testArea() {
        Rectangle rect = new Rectangle(4,5);
        assertEquals(20, rect.area());
    }

    @Test
    public void testArrayAverageArea() {
        Rectangle[] array;
        array = new Rectangle[5];
        array[0] = new Rectangle(1,1);
        array[1] = new Rectangle(2,2);
        array[2] = new Rectangle(3,3);
        array[3] = new Rectangle(4,4);
        array[4] = new Rectangle(5,5);

        int totalArea = 0;
        for(Rectangle rectangle: array) {
            totalArea = totalArea + rectangle.area();
        }
        int averageArea = totalArea/5;
        assertEquals(11, averageArea);
    }
}
