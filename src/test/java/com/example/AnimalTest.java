package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class AnimalTest {

    private Animal animal;

    @Before
    public void initObjects() {
        animal = new Animal();
    }

    @Test
    public void getPredatorFoodTest() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Assert.assertTrue(animal.getFood("Хищник").containsAll(expectedFood));
    }

    @Test
    public void getHerbivorousFoodTest() throws Exception {
        List<String> expectedFood = List.of("Трава", "Различные растения");
        Assert.assertTrue(animal.getFood("Травоядное").containsAll(expectedFood));
    }

    @Test(expected = Exception.class)
    public void getFoodExceptionTest() throws Exception {
        animal.getFood("Колибри");
    }

    @Test
    public void getFamilyTest(){
        Assert.assertEquals(animal.getFamily(),("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи"));
    }


}
