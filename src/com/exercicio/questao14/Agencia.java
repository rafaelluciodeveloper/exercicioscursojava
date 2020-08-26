/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.exercicio.questao14;

/**
 *
 * @author Rafael
 */
public class Agencia {
    private Banco banco;
    private String numero;
    
 public Agencia(){
     
 }   

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
 
 
}
