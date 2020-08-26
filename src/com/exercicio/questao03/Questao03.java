/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.exercicio.questao03;

/**
 *
 * @author Rafael
 */
public class Questao03 {
    public static void main(String[] args) {
        double totalmedias = 0;
        double[] mediastemp = {12,13,15,18,23,30,27,32,22,16,4,3};
        double mediaanual;
    
        for (double cont : mediastemp){
            totalmedias += cont;
        }
        
        mediaanual = totalmedias / mediastemp.length;
    
        for (double cont : mediastemp){
            if (cont > mediaanual){
                System.out.println(cont);
            }
        }
    }
 
}
