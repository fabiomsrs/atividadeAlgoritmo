/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Domain.Quest;
import javax.swing.JOptionPane;


public class ExerciseCaelum {

     public static void main(String []args){
        int auxQ;
        do{
        String questao = JOptionPane.showInputDialog("Digite o numero da questao (1 a 5) digite 0 pra sair");
        auxQ = Integer.parseInt(questao);
        switch (auxQ){
            case 1:
                Quest.quest1();
                break;
            case 2:
                Quest.quest2();
                break;
            case 3:
                Quest.quest3();
                break;                
            case 4:
                Quest.quest4();
                break;      
            case 5:
                Quest.quest5();
                break;                      
            case 6:
                Quest.quest6();
                break;      
            case 7:
                Quest.quest7();
                break;                
            case 8:
                Quest.quest8();
                break;                
            case 9:
                Quest.quest9();
                break;                
            case 10:
                Quest.quest10();
                break;                
            case 11:
                Quest.quest11();
                break;                                
            default:
                if (auxQ == 0){
                    JOptionPane.showMessageDialog(null, "BYE");
                    break;
                }               
                JOptionPane.showMessageDialog(null, "Numero invalido BYE");
                break;                      
                   
        }
        }while(auxQ > 0 && auxQ <= 11);
            
    }
}
