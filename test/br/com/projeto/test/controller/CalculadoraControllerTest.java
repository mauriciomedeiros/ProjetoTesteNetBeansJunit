/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.projeto.test.controller;

import br.com.projeto.controller.CalculadoraController;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author mauriciom
 */
public class CalculadoraControllerTest extends CalculadoraController {

    @Test
    public void somarTest(){
        assertEquals(super.somar(5, 5), 10);
    }

    @Test
    public void subtrairTest(){
        assertEquals(super.subtrair(5, 3), 2);
    }
}
