package com.company;

public class Main {


    /**
     * Classe que implementa as operação de soma e divisão usnado a interface Calculadora
     *
     * Objetivo: Entender conceitos da programação funcional com Java
     *
     */
    public static void main(String[] args) {
        Calculadora soma = (valor1, valor2) -> valor1 + valor2;
        System.out.println("O resultado da soma eh " + soma.calcule(10,5));

        Calculadora divida = (valor1, valor2) -> valor1 / valor2;
        System.out.println("O resutaldo da divisao eh " + divida.calcule(10,5));

    }

    /**
     * Interface funcional que calcula 2 valores;
     */
    interface Calculadora {
        int calcule (int valor1, int valor2);
    }
}
