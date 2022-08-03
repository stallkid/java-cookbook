package com.cookbook;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.cookbook.exercicios.VariaveisPrimitivas;

public class VariaveisPrimitivasTest {

    @Test
    public void shouldReturnStringType() {
        var stringValue = VariaveisPrimitivas.printString();
        assertTrue("O Tipo da variavel deve ser String", String.class.isInstance(stringValue));
    }

    @Test
    public void shouldReturnBooleanType() {
        var boolValue = VariaveisPrimitivas.printBoolean();
        assertTrue("O Tipo da variavel deve ser boolean", Boolean.class.isInstance(boolValue));
    }

    @Test
    public void shouldReturnIntType() {
        var intValue = VariaveisPrimitivas.printInt();
        assertTrue("O Tipo da variavel deve ser int", Integer.class.isInstance(intValue));
    }

    @Test
    public void shouldReturnShortType() {
        var shortValue = VariaveisPrimitivas.printShort();
        assertTrue("O Tipo da variavel deve ser short", Short.class.isInstance(shortValue));
    }

    @Test
    public void shouldReturnLongType() {
        var longValue = VariaveisPrimitivas.printLong();
        assertTrue("O Tipo da variavel deve ser long", Long.class.isInstance(longValue));
    }

    @Test
    public void shouldReturnByteType() {
        var byteValue = VariaveisPrimitivas.printByte();
        assertTrue("O Tipo da variavel deve ser byte", Byte.class.isInstance(byteValue));
    }

    @Test
    public void shouldReturnFloatType() {
        var floatValue = VariaveisPrimitivas.printFloat();
        assertTrue("O Tipo da variavel deve ser float", Float.class.isInstance(floatValue));
    }

    @Test
    public void shouldReturnDoubleType() {
        var doubleValue = VariaveisPrimitivas.printDouble();
        assertTrue("O Tipo da variavel deve ser double", Double.class.isInstance(doubleValue));
    }

    @Test
    public void shouldReturnCharType() {
        var charValue = VariaveisPrimitivas.printChar();
        assertTrue("O Tipo da variavel deve ser char", Character.class.isInstance(charValue));
    }

}
