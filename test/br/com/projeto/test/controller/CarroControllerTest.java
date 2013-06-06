/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.projeto.test.controller;

import static org.junit.Assert.*;
import br.com.projeto.bean.Carro;
import br.com.projeto.controller.CarroController;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author mauriciom
 */
public class CarroControllerTest extends CarroController{
    private Carro car;

    @Before
    public void setUp(){
        car = new Carro();
    }
    
    @After
    public void tearDown(){
        car.setLigado(Boolean.FALSE);
        car.setAndando(Boolean.FALSE);
        car.setParado(Boolean.FALSE);
    }

    @Test
    public void carroJaLigadoTest(){
        car.setLigado(Boolean.TRUE);
        assertTrue(super.ligar(car));
    }

    @Test
    public void ligarCarroTest(){
        assertEquals(super.ligar(car), Boolean.TRUE);
    }

    @Test
    public void andarComCarroDesligadoTest(){
        assertFalse(super.andar(car));
    }

    @Test
    public void andarCarroTest(){
        car.setLigado(Boolean.TRUE);
        assertEquals(super.andar(car), Boolean.TRUE);
    }

    @Test
    public void pararCarroDesligadoTest(){
        assertFalse(super.parar(car));
    }

    @Test
    public void pararCarroJaParadoTest(){
        car.setLigado(Boolean.TRUE);
        assertFalse(super.parar(car));
    }

    @Test
    public void pararCarroTest() {
        car.setLigado(Boolean.TRUE);
        car.setAndando(Boolean.TRUE);
        assertEquals(super.parar(car), Boolean.TRUE);
    }
}
