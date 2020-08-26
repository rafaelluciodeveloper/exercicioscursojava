
package com.exercicio.questao02;


public class Questao02 {
    public static void main(String[] args) {
        double litrosvendidos = 50;
        char tipocombustivel = 'A';
        double valorvenda;
        double valordesconto;
        double valorfinal;
       switch (tipocombustivel){
           case 'A' :
               if (litrosvendidos <= 20){
                   valorvenda = litrosvendidos * 1.90;
                   valordesconto = 0.03 * 1.90;
                   valorfinal = valorvenda - (valordesconto * litrosvendidos);
                   System.out.println("Valor A Ser Pago : R$" + valorfinal);
               }else{
                   valorvenda = litrosvendidos * 1.90;
                   valordesconto = 0.05 * 1.90;
                   valorfinal = valorvenda -  (valordesconto * litrosvendidos);
                   System.out.println("Valor A Ser Pago : R$" + valorfinal);
               }
               break;
           case 'G':
                if (litrosvendidos <= 20){
                   valorvenda = litrosvendidos * 2.50;
                   valordesconto = 0.04 * 2.50;
                   valorfinal =  valorvenda - (valordesconto * litrosvendidos);
                   System.out.println("Valor A Ser Pago : R$" + valorfinal);
               }else{
                   valorvenda = litrosvendidos * 2.50;
                   valordesconto = 0.06 * 2.50;
                   valorfinal = valorvenda - (valordesconto * litrosvendidos);
                   System.out.println("Valor A Ser Pago : R$" + valorfinal);
               }
               break;
           default:
               System.out.println("Tipo De Combustivel Invalido");
       }
    }
   
}
