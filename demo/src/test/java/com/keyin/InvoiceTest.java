package com.keyin;

import org.junit.Test;
import org.junit.Assert;

public class InvoiceTest {
    @Test
    public void shouldAnswerWithTrue()
    {
        InvoiceItem I1 = new InvoiceItem("1", "desc", 2, 5);
        Assert.assertTrue(I1.getID().equals("1"));
    }
}
