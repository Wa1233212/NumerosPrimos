/**
 * Clase para generar todos los números primos de 1 hasta
 * un número máximo especificado por el usuario. Como 
 * algoritmo se utiliza la criba de Eratóstenes.
 * 
 * Eratóstenes de Cirene (276 a.C., Cirene, Libia – 194
 * a.C., Alejandría, Egipto) fue el primer hombre que 
 * calculó la circunferencia de la Tierra. También
 * se le conoce por su trabajo con calendarios que ya 
 * incluían años bisiestos y por dirigir la mítica 
 * biblioteca de Alejandría.
 * 
 * El algoritmo es bastante simple: Dado un vector de
 * enteros empezando en 2, se tachan todos los múltiplos
 * de 2. A continuación, se encuentra el siguiente
 * entero no tachado y se tachan todos sus múltiplos. El 
 * proceso se repite hasta que se pasa de la raíz cuadrada
 * del valor máximo. Todos los números que queden sin 
 * tachar son números primos.
 */ 
package numerosprimos;    

import java.util.Arrays;

public class CribaEratostenes 
{ 
 /** 
 * Generar números primos de 1 a max
 * @param max es el valor máximo
 * @return Vector de números primos
 */
    public static int[] generarPrimos (int max) {

        // Declaraciones
        int[] primosTemp = new int[max]; 
        int[] primos;
        int count = 0;

        // Inicializar el array
        for (int i=0, j=0; i<max; i++) {
            if(esPrimo(i)){
                primosTemp[j] = i;
                j++;
            }
        }
        // Borrar parte del array no usado
        // Contamos cuantos numeros tiene el array para copiarlo en otro
        
        for (int i=0; i<max; i++) {
            if(primosTemp[i] != 0){
                count++;
            }
        }
        
        primos = new int[count];
        
        System.arraycopy(primosTemp, 0, primos, 0, count);
        
        return primos;
    }
 
 
    private static boolean esPrimo(int n){

              if (n <= 1)
                  return false;

              for (int i = 2; i < n; i++)
                  if (n % i == 0)
                      return false;

              return true;
      }
  
}







