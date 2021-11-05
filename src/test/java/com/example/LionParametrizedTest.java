package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionParametrizedTest {

    private String sex;
    boolean expectedHasMane;
    Feline feline;
    Lion lion;

    @Before
    public void initObjects() throws Exception {
        feline = new Feline();
        lion = new Lion(sex, feline);
    }

    public LionParametrizedTest(String sex, boolean expectedHasMane){
        this.sex = sex;
        this.expectedHasMane = expectedHasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getDataForHasMane(){
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void LionSexTest() {
        Assert.assertEquals(lion.hasMane, expectedHasMane);
    }
} 