package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.points.Point;

@Test
public class PointTests {
    public void testPointsDistance() {
        Point point = new Point(3, 5);
        Point zeroPoint = new Point(0, 0);
        Assert.assertEquals(point.x, 3.0);
        Assert.assertNotEquals(point.y, 8);
        Assert.assertTrue(point.x == 3 );
        Assert.assertEquals(zeroPoint.distance(3, 4), 5.0);
    }

}
