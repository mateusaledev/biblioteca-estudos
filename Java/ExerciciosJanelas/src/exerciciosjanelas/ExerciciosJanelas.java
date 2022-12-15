/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosjanelas;

import javax.swing.JOptionPane;
/**
 *
 * @author Mateus Silva
 */
public class ExerciciosJanelas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, s = 0;
        int p = 0, i = 0;
        int ac = 0, m;
        
       
        
        // Valor Total E MÉDIA
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html> Informe um Número: <br>(Valor 0 interrompe)</html>"));
            s += n;
            m = s/2;
            
            
        } while (n != 0);
        

        //PAR E IMPAR
        if (n%2==0) {
                p = n;
            } else {
                i = n;
            }
        
        
        JOptionPane.showMessageDialog(null, "<html>  Resultado  <br><hr>" + 
                "<br>  Total de Valores " + s +
                "<br> Total de pares " + p +
                "<br> Total de Impares " + i +
                "<br> Média dos valores " + m +
                
                "</html>");
    }
    
}
