package com.example;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class LionTest {

    @Test
    public void getKittensTest() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Mockito.when(feline.getKittens()).thenReturn(3);

        Lion lion = new Lion("Самец", feline);

        assertEquals(3, lion.getKittens());
    }

    @Test
    public void getFoodTest() throws Exception {
        Feline feline = Mockito.mock(Feline.class);

        Mockito.when(feline.getFood("Хищник"))
                .thenReturn(List.of("Животные", "Птицы", "Рыба"));

        Lion lion = new Lion("Самка", feline);

        assertEquals(
                List.of("Животные", "Птицы", "Рыба"),
                lion.getFood()
        );
    }

    @Test(expected = Exception.class)
    public void constructorExceptionTest() throws Exception {
        Feline feline = Mockito.mock(Feline.class);

        new Lion("Неизвестно", feline);
    }
}