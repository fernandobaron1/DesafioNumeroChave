
package desafionumerochave;

import java.util.Random;
import java.util.Scanner;


public class DesafioNumeroChave {

  
    public static void main(String[] args) {
        
        //Correção//
        Random aleatorio = new Random();
        
        int numChave = aleatorio.nextInt(101);
        System.out.println ("O número chave é:"+numChave);
        
        System.out.println ("Informe o número");
        Scanner leia = new Scanner(System.in);
        int numDigitado = leia.nextInt();
        
        int resultado = numChave - numDigitado;
        
        if (resultado < 0){
            resultado = resultado * -1;
        System.out.println ("O resultado é:"+resultado);
    }
    } 
}
