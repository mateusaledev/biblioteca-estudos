/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor02;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author Mateus Silva
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vet[] = {5, 6, 1, 7, 6, 9, 11};
        for(int v:vet) {
            System.out.print(v + " ");
        }
        System.out.println("");
        int p = Arrays.binarySearch(vet, 11);
        System.out.println("Encontre o valor na posição " + p);
        
    }
    
}
