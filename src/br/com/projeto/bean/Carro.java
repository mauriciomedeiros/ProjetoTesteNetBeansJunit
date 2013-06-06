/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.projeto.bean;

/**
 *
 * @author mauriciom
 */
public class Carro {
    private Boolean ligado;
    private Boolean andando;
    private Boolean parado;

    public Carro() {
        this.ligado = Boolean.FALSE;
        this.andando = Boolean.FALSE;
        this.parado = Boolean.FALSE;
    }

    public Boolean getLigado() {
        return ligado;
    }

    public void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }
    
    public Boolean getAndando() {
        return andando;
    }

    public void setAndando(Boolean andando) {
        this.andando = andando;
    }

    public Boolean getParado() {
        return parado;
    }

    public void setParado(Boolean parado) {
        this.parado = parado;
    }

}
