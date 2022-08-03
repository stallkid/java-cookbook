package com.cookbook;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.cookbook.exercicios.Condicionais;

public class CondicionaisTest {

    @Test
    public void shouldReturnOneGreater() {
        var x = 5;
        var y = 9;
        int expected = 0;
        var test = Condicionais.compararDoisNumeros(x, y);
        if (x > y) {
            expected = x;
        } else if (y > x) {
            expected = y;
        }
        assertEquals("Um número deve ser menor que o outro", expected, test);
    }

    @Test
    public void shouldReturnPairNumber() {
        var x = 8;
        var expected = false;
        var test = Condicionais.verificarPar(x);
        if (x % 2 == 0) {
            expected = true;
        }
        assertEquals("Um número deve ser menor que o outro", expected, test);
    }

    @Test
    public void shouldNotReturnPairNumber() {
        var x = 5;
        var expected = false;
        var test = Condicionais.verificarPar(x);
        if (x % 2 == 0) {
            expected = true;
        }
        assertEquals("Não deve retornar 'true' se o número não for par", expected, test);
    }

    @Test
    public void shouldReturnOddNumber() {
        var x = 5;
        var expected = false;
        var test = Condicionais.verificarImpar(x);
        if (x % 2 != 0) {
            expected = true;
        }
        assertEquals("Deve retornar 'true' se o número for impar", expected, test);
    }

    @Test
    public void shouldNotReturnOddNumber() {
        var x = 8;
        var expected = false;
        var test = Condicionais.verificarImpar(x);
        if (x % 2 != 0) {
            expected = true;
        }
        assertEquals("Deve retornar 'true' se o número for impar", expected, test);
    }


    //verificarParEMaior

    @Test
    public void shouldReturnGreaterPairNumber() {
        var x = 4;
        var y = 8;
        var expected = 0;
        var test = Condicionais.verificarParEMaior(x, y);
        if (x > y && x % 2 == 0) {
            expected = x;
        } else if (y > x && x % 2 == 0) {
            expected = y;
        }
        assertEquals("Deve retornar o maior número par", expected, test);
    }

    @Test
    public void shouldReturnLesserPairNumber() {
        var x = 4;
        var y = 8;
        var expected = 0;
        var test = Condicionais.verificarParEMaior(x, y);
        if (x < y && x % 2 == 0) {
            expected = x;
        } else if (y < x && x % 2 == 0) {
            expected = y;
        }
        assertEquals("Deve retornar o menor número par", expected, test);
    }

    @Test
    public void shouldReturnPrimeNumber() {
        int i,m=0,flag=0;      
        var x = 3; 
        var expected = false;
        var test = Condicionais.verificarSeNumeroPrimo(x);
        m = x / 2;      
        if (x == 0 || x == 1){  
            expected = false;  
        } else {  
         for(i = 2;i <= m;i++){      
          if (x % i == 0) {      
            expected = false;
           flag=1;      
           break;      
          }      
         }      
         if (flag == 0)  {
            expected = true;
        }  
        }
        assertEquals("Deve retornar o menor número par", expected, test);
    }

    @Test
    public void shouldNotReturnPrimeNumber() {
        int i,m=0,flag=0;      
        var x = 6; 
        var expected = false;
        var test = Condicionais.verificarSeNumeroPrimo(x);
        m = x / 2;      
        if (x == 0 || x == 1){  
            expected = false;  
        } else {  
         for(i = 2;i <= m;i++){      
          if (x % i == 0) {      
            expected = false;
           flag=1;      
           break;      
          }      
         }      
         if (flag == 0)  {
            expected = true;
        }  
        }
        assertEquals("Deve retornar o menor número par", expected, test);
    }



}
