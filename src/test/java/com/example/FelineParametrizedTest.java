
package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FelineParametrizedTest {
    private int kittensData;
    private int expectedKittens;

    public FelineParametrizedTest(int kittensData, int expectedKittens) {
        this.kittensData = kittensData;
        this.expectedKittens = expectedKittens;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensTestData() {
        return new Object[][]{
                {1,1,},
                {2,2,},
                {3,3,},
        };
    }


    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
        Assert.assertEquals(expectedKittens, feline.getKittens(kittensData));
    }
}