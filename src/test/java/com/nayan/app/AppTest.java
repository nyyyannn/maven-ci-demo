package com.nayan.app;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void testingAddition() {
        int a = 5;
        int b = 10;
        int sum = a + b;
        assertEquals(15, sum);
    }
}
