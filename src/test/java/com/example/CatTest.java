package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.List;


public class CatTest {

    Feline feline;
    Cat cat;

    @Before
    public void initObjects(){
        feline = new Feline();
        cat = new Cat(feline);
    }

    @Test
    public void getSoundTest(){
        Assert.assertEquals(cat.getSound(),"Мяу");
    }

    @Test
    public void getFoodTest() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(cat.getFood(), expectedFood);
    }
}
