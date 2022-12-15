/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor03;

import java.util.Arrays;

/**
 *
 * @author Mateus Silva
 */
public class Vetor03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int v[] = new int[2000000];
        Arrays.fill(v, 2);
        for(int vet:v){
            System.out.println(vet + " te amo ");  
        }
        
    }
    
}
