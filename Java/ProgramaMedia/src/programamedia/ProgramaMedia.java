/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author Mateus Silva
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.print("Primeira Nota: ");
        float n1 = teclado.nextFloat();
        System.out.print("Segunda Nota: ");
        float n2 = teclado.nextFloat();
        float m = (n1+n2)/2;
        System.out.println("Sua média é: " + m);
            if (m>=7) {
                System.out.println("Parebéns você passou");
        } else {
                System.out.println("Você foi REPROVADO!!");
            }   
    }
}
