package com.cookbook.exercicios;

import java.util.logging.Logger;

public class VariaveisPrimitivas {
    Logger logger = Logger.getLogger("Teste");
    //*********************************//
    //***** Criação das variáveis *****//
    //*********************************//

    // Criar variável boolean e retornar ela
    public static boolean printBoolean() {
        //logger.info();
        return false;
    }

    // Criar variável String e retornar ela
    public static String printString() {
        //logger.info();
        return "test";
    }

    // Criar variável int e retornar ela
    public static int printInt() {
        //logger.info();
        return 0;
    }

    // Criar variável Short e retornar ela
    public static Short printShort() {
        //logger.info();
        return 0;
    }

    // Criar variável long e retornar ela
    public static long printLong() {
        //logger.info();
        return 0L;
    }

    // Criar variável byte e retornar ela
    public static byte printByte() {
        //logger.info();
        return 0;
    }

    // Criar variável float e retornar ela
    public static float printFloat() {
        //logger.info();
        return (float) 0.0;
    }

    // Criar variável double e retornar ela
    public static double printDouble() {
        //logger.info();
        return 0.0;
    }

    // Criar variável char e retornar ela
    public static char printChar() {
        //logger.info();
        return 'a';
    }

    //************************************//
    //***** Utilização das variáveis *****//
    //************************************//

    // Printar as variáveis do tipo inteiro com as precisões diferentes
    public static void numerosInteiros() {
        //logger.info();
        //logger.info();
        //logger.info();
        //logger.info();
    }

    // Printar as variáveis do tipo real com as precisões diferentes
    public static void numerosReais() {
        //logger.info();
        //logger.info();
    }

    // Printar as variáveis do tipo booleano com as precisões diferentes
    public static void tipoBooleano() {
        //logger.info();
    }

    // Printar as variáveis do tipo caractere com as precisões diferentes
    public static void tipoChar() {
        //logger.info();
    }

    // Método main que executa as ações da classe
    public static void main(String[] args) {
        printBoolean();
        printString();
        printInt();
        printShort();
        printLong();
        printByte();
        printFloat();
        printDouble();
        printChar();
        numerosInteiros();
        numerosReais();
        tipoBooleano();
        tipoChar();
    }
}
