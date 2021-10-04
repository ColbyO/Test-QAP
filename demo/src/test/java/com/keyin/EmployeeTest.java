package com.keyin;

import org.junit.Assert;
import org.junit.Test;

public class EmployeeTest {
    @Test
    public void shouldAnswerWithTrue()
    {
        Employee E1 = new Employee(1, "John", "Doe", 5000);
        Assert.assertTrue(E1.getFirstName().equals("John"));
    }   
}
