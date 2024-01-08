/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema5 {

    public static void main(String[] args) {
        // Creamos un arreglo bidimencional
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int sumaTotal;
        // Imprime la suma total
        sumaTotal = obtenerSuma(informacion);
        System.out.println(sumaTotal);
    }

    public static int obtenerSuma(int[][] datos) {
        // Declaramos una variable para acumular la suma total
        int sumaTotal = 0;
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                sumaTotal = sumaTotal + datos[i][j];
            }
        }
        // Devuelvemos la suma 
        return sumaTotal;
    }
}
