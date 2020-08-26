/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.exercicio.questao11;

import java.util.Arrays;

/**
 *
 * @author Rafael
 */
public class Questao11 {
    public static void main(String[] args) {
        double maiormedia;
        double menormedia;
        int totalmediasarmazenadas;
        double mediaturma;
        int qtdalunosmedia = 0;
        double total = 0;
        double[] medias = {7.21,8,9,5.5,10,3};
        
        Arrays.sort(medias);
        
        menormedia = medias[0];
        maiormedia = medias[medias.length - 1];
        totalmediasarmazenadas = medias.length;
        
        System.out.println("Menor Media:"+menormedia);
        System.out.println("Maior Media:"+maiormedia);
        System.out.println("Total Medias Armazenadas:"+totalmediasarmazenadas);
        
        for (double cont : medias){
            total += cont;
        }
        mediaturma = total / totalmediasarmazenadas;
        System.out.println("Media Turma:"+mediaturma);
         
          for (double cont : medias){
            if (cont > mediaturma){
                qtdalunosmedia++;
            }
          }
           System.out.println("Quantidade Alunos Acima da Media da Turma:"+qtdalunosmedia); 
        
    }
}
