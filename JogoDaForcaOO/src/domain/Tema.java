/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 *
 * @author ClienteAOC
 */
public class Tema {
    String conteudo;
    
    
    public Tema(){
        
    }
    public Tema(String conteudo){
        this.conteudo = conteudo;
    }
    
    public String getTema(){
        return this.conteudo;
    }
        
    
    
}
