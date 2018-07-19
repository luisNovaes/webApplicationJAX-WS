/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplicacao.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author luis.silva
 */
@WebService
public class CalculoBasico {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "somar")
    public int somar(@WebParam(name = "x") int x, @WebParam(name = "y") int y) {
        //TODO write your implementation code here:
        return x + y;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "somarEx")
    public Resultado somarEx(
            @WebParam(name = "x") int x,
            @WebParam(name = "y") int y) {
        Resultado r = new Resultado();
        r.setTexto("reusltado da soma");
        r.setValor(x + y);
        return r;
    }

}
