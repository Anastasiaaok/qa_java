package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class FelineTest {

    private Feline feline;

    @Before
    public void setUp() {
        feline = new Feline();
    }

    @Test
    public void eatMeatTest() throws Exception {
        List<String> food = feline.eatMeat();

        Assert.assertEquals(
                List.of("Животные", "Птицы", "Рыба"),
                food
        );
    }

    @Test
    public void getFamilyTest() {
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensDefaultTest() {
        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensWithParameterTest() {
        Assert.assertEquals(5, feline.getKittens(5));
    }
}