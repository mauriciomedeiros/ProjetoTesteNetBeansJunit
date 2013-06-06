/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.projeto.controller;

import br.com.projeto.bean.Carro;

/**
 *
 * @author mauriciom
 */
public class CarroController {

    public Boolean ligar(Carro car){
        if(car.getLigado()){
            System.out.println("Ops! Esse carro já está ligado!");
        }
        else{
            car.setLigado(Boolean.TRUE);
            System.out.println("Carro ligado!");
        }
        return car.getLigado();
    }

    public Boolean andar(Carro car){
        if(car.getLigado()){
            car.setAndando(Boolean.TRUE);
            System.out.println("Andando...");
        }else{
            car.setParado(Boolean.FALSE);
            System.out.println("Ops! Você precisa ligar o carro para poder começar a andar!");
        }
        return car.getAndando();
    }

    public Boolean parar(Carro car){
        if(car.getLigado()){
            if(car.getAndando()){
                car.setParado(Boolean.TRUE);
                System.out.println("...Parado!");
            }else{
                car.setAndando(Boolean.FALSE);
                System.out.println("Ops! Carro está parado!");
            }
            
        }else{
            System.out.println("Ops! Carro está desligado!");
        }
        return car.getParado();
    }
}
