/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author ClienteAOC
 */
public class PessoaFisica {
    private String cpf;
    
    public String isValido(){
        return this.cpf + " Eh valido";
    }
}
