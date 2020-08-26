/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.exercicio.questao05;



public class Questao05 {
    
    public static void main(String[] args) {
    
    String resposta01 = "sim";
    String resposta02 = "não";
    String resposta03 = "sim";
    String resposta04 = "não";
    String resposta05 = "sim";
    int pontos = 0;
        
    if(resposta01.equalsIgnoreCase("sim")){
         pontos++;
        }
    if(resposta02.equalsIgnoreCase("sim")){
         pontos++;
        }
    if(resposta03.equalsIgnoreCase("sim")){
         pontos++;
        }
    if(resposta04.equalsIgnoreCase("sim")){
         pontos++;
        }
    if(resposta05.equalsIgnoreCase("sim")){
         pontos++;
        }
    
    if (pontos < 2 ){
		System.out.println("Veredito : Inocente");
	}else if (pontos == 2){
		System.out.println("Veredito : Suspeita");	
	}else if ((pontos >= 3) && (pontos <=4)){
		System.out.println("Veredito : Cumplice");
	}else{
		System.out.println("Veredito : Assasino");
	}
    
    }
}
