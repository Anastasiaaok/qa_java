package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {

    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> food = feline.eatMeat();

        Assert.assertEquals(
                List.of("Животные", "Птицы", "Рыба"),
                food
        );
    }

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensDefaultTest() {
        Feline feline = new Feline();
        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensWithParameterTest() {
        Feline feline = new Feline();
        Assert.assertEquals(5, feline.getKittens(5));
    }
}
