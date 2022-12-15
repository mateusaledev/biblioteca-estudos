/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pernasswitch;

import java.util.Scanner;

/**
 *
 * @author Mateus Silva
 */
public class PernasSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("Quantas Pernas? ");
        int perna = tec.nextInt();
        String tipo;
        System.out.print("Isso é um(a): ");
        switch (perna) {
            case 1:
                tipo = "Poste";
                break;
            case 2:
                tipo = "Humanoide";
                break;
            case 3:
                tipo = "Black is Whats";
                break;
            case 4:
                tipo = "Dog";
                break;
            case 5:
                tipo = "Black Dog Whats";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "Alien";
                break;
        }
        System.out.println(tipo);
    }
    
}
