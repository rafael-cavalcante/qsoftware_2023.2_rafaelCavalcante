package com.example.qualidade;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraSimplesTest {
    
    @Test
    public void tresMaisCinco(){
        CalculadoraSimples c = new CalculadoraSimples();
        double result = c.somar(3, 5);
        assertEquals(8, result, 0);
    }
}
