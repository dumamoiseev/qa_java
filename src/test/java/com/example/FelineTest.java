
package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FelineTest {

    Feline feline;

    @Before
    public void initObjects(){
        feline = new Feline();
    }

    @Test
    public void familyTest(){
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensTest(){
        Assert.assertEquals(1, feline.getKittens());
    }
}