/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.exercicio.questao10;

/**
 *
 * @author Rafael
 */
public class Questao10 {
    public static void main(String[] args) {
        int numero =21;
        int contador = 0;
        int x,a;
		for(x = 1;x <= numero;x++){
			if(numero % x == 0){
				contador++;
			}
		}
	
	if((contador == 2) ){
		System.out.println( "Esta Numero e Primo :");
		System.out.println(numero);
	}else{
		System.out.println( " Este Numero nao e primo : "+numero);
		System.out.println( " Numeros Divisiveis : ");
			for (a = 1;a <= numero;a++){
				if (numero % a == 0 ){
				System.out.println( " | "+a);
		}
	}
}
    }
}
