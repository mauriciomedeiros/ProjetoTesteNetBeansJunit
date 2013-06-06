/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.projeto.test.suite.controller;

import br.com.projeto.test.controller.CalculadoraControllerTest;
import br.com.projeto.test.controller.CarroControllerTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author mauriciom
 */
@RunWith(Suite.class)
@Suite.SuiteClasses(value={CarroControllerTest.class,
                           CalculadoraControllerTest.class})
public class ControllerTestSuite {
}
