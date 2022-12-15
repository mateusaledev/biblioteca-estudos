
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Mateus Silva
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.println("Digite a nota do homi: ");
        float nota = teclado.nextFloat(); 
        System.out.printf("A nota de %s é %.5f \n ", nome, nota);
        
    }
    
}
