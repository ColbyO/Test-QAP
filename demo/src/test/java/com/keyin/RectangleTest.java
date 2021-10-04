package com.keyin;

import org.junit.Test;
import org.junit.Assert;

public class RectangleTest {
    @Test
    public void shouldAnswerWithTrue()
    {
        Rectangle R1 = new Rectangle(5, 10);
        boolean returnValue = R1.checkTest();
        Assert.assertTrue(returnValue);
    }
}
