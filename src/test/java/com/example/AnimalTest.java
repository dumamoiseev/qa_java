package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


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

    @Test
    public void getFoodTextExceptionTest() throws Exception {
        Throwable thrown = assertThrows(Exception.class,  () -> {
            animal.getFood("Колибри");
        });
        assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", thrown.getMessage());

    }

    @Test
    public void getFamilyTest(){
        assertEquals(animal.getFamily(),("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи"));
    }


}
