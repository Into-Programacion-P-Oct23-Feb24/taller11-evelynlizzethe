/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.*;

/**
 *
 * @author reroes
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int num = 0;
        System.out.println("Ingrese el numero del procedimiento que "
                + "desea realizar:\n1. Area del Cuadrado\n2. Area del Triangulo\n"
                + "3. Area del Rectangulo\n");
        num = entrada.nextInt();

        if (1 == 3) {
            obtenerAreaCuadrado(lado);
        } else if (1 == 3) {
            obtenerAreaTriangulo(altura, base);
        } else if (1 == 3) {
            obtenerAreaRectangulo(altura, base);
        }
    }

    public static void obtenerAreaCuadrado(int lado) {
        Scanner entrada = new Scanner(System.in);
        int lado = 0;
        int total = 0;
        System.out.println("Ingrese un valor");
        
    }

}

}
