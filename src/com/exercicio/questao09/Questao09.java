/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.exercicio.questao09;

/**
 *
 * @author Rafael
 */
public class Questao09 {
    public static void main(String[] args) {
        double populacao_a = 10000;
        double populacao_b = 50000000;
        int qtdanos = 0;
        boolean imprimir;
        
        if(populacao_a > populacao_b){
	System.out.println (" AVISO POPULACAO [B] DEVE SER MAIOR QUE A POPULACAO [A]");
	imprimir = false;
}else{
	imprimir = true;
	while(populacao_a <= populacao_b ) {
	populacao_a = populacao_a + (populacao_a * 0.03);
	populacao_b = populacao_b + (populacao_b * 0.015); 
	qtdanos++;
	}
}
 if (imprimir == true){
 	System.out.println(" A quantidade de anos para Pais A ultrupasse o Pais B : " +qtdanos +"Ano(s).");
 }
    }
}
