/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplicacao.ws;

import java.util.ArrayList;
import java.util.List;
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

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "somarVarios")
    public Resultado[] somarVarios(@WebParam(name = "x") int x,
            @WebParam(name = "y") int y,
            @WebParam(name = "z") int z) {

        Resultado[] r = new Resultado[3];

        r[0] = new Resultado();
        r[0].setTexto("x+y");
        r[0].setValor(x + y);

        r[1] = new Resultado();
        r[1].setTexto("x+z");
        r[1].setValor(x + z);

        r[2] = new Resultado();
        r[2].setTexto("y+z");
        r[2].setValor(y + z);

        return r;
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "somarVariosEx")
    public List<Resultado> somarVariosEx(@WebParam(name = "x") int x,
            @WebParam(name = "y") int y,
            @WebParam(name = "z") int z) {

        List<Resultado> res = new ArrayList<Resultado>();

        Resultado r0 = new Resultado();
        r0.setTexto("x+y");
        r0.setValor(x + y);

        Resultado r1 = new Resultado();
        r1.setTexto("x+z");
        r1.setValor(x + z);

        Resultado r2 = new Resultado();
        r2.setTexto("x+z");
        r2.setValor(x + z);

        return res;
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "somarObjeto")
    public int somarObjeto(@WebParam(name = "obj") Resultado r,
            @WebParam(name = "x") int x) {
        return r.getValor() + x;
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "somarObjetos")
    public int somarObjetos(@WebParam(name = "obj") List<Resultado> lista) {

        int retorno = 0;
        for (Resultado r : lista) {
            retorno += r.getValor();
        }
        return retorno;
    }
}
