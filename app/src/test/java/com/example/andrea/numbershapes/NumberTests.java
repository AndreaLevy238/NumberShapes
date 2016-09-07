package com.example.andrea.numbershapes;

/**
 * Created by Andrea on 07/03/2016.
 */
import junit.framework.Assert;

import org.junit.Test;

import static org.junit.Assert.*;
public class NumberTests {
    @Test
    public void triangularTrueTest() {
        Number myNumber = new Number(3);
        Assert.assertTrue(myNumber.isTriangular());
    }

    @Test
    public void triangularFalseTest()
    {
        Number myNumber = new Number(4);
        assertFalse(myNumber.isTriangular());
    }

    @Test
    public void squareTrueTest()
    {
        Number myNumber = new Number(4);
        assertTrue(myNumber.isSquare());
    }

    @Test
    public void squareFalseTest()
    {
        Number number = new Number(3);
        assertFalse(number.isSquare());
    }
}
