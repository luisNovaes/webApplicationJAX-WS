/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplicacao.ws;

import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author luis.silva
 */
@XmlType
public class Resultado {

    private int valor;
    private String texto;

    public Resultado() {

    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getTexto() {
        return this.texto;
    }

    public void setTexto(String texto) {
        this.texto = texto.toUpperCase();
    }

}
