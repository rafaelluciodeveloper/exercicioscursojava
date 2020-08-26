/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exercicio.questao01;

/**
 *
 * @author Rafael
 */
public class Questao01 {

    public static int inveterNumero(int numero) {

        int i = 0;

        while (numero > 0) {
            i *= 10;
            i += (numero % 10);
            numero /= 10;
            System.out.println("i : " + i);
            System.out.println("numero : " + numero);
            System.out.println("-------------------------------");
        }

        return i;
    }

    public static void main(String[] args) {
        System.out.println("Numero Invertido:" + inveterNumero(156));
    }
}
