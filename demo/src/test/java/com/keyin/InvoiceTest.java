package com.keyin;

import org.junit.Test;
import org.junit.Assert;

public class InvoiceTest {
    @Test
    public void shouldAnswerWithTrue()
    {
        Invoice I1 = new Invoice("1", "desc", 2, 5);
        Assert.assertTrue(I1.getID().equals("1"));
    }
}
