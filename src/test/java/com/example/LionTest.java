package com.example;


import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    Feline felineTest;

    @Before
    public void initObjects(){
        felineTest = new Feline();
    }

    @Test(expected = Exception.class)
    public void LionExceptionSexTest() throws Exception {
        Lion lion = new Lion("Среднее", felineTest);
    }


    @Mock
    Feline feline;

    @Test
    public void getKittensPositiveTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        Assert.assertEquals(1,lion.getKittens());
    }

    @Test
    public void doesHaveManeMaleTest() throws Exception {
        Lion lion = new Lion("Самец", felineTest);
        boolean actualHasMane = lion.doesHaveMane();
        Assert.assertEquals(true, actualHasMane);
    }

    @Test
    public void doesHaveManeFemaleTest() throws Exception {
        Lion lion = new Lion("Самка", felineTest);
        boolean actualHasMane = lion.doesHaveMane();
        Assert.assertEquals(false, actualHasMane);
    }

    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion("Самец", felineTest);
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(lion.getFood(),expected);
    }
}