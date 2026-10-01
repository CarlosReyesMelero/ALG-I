/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package experimento1;


/**
 *
 * @author carlo
 */
public class Experimento1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[]n = new int[]{5,10,20,30,40};
        
        for (int i = 0; i < n.length; i++) {          
            int[][]matrizA = getMatrizAleatoria(n[i], n[i]);
            int[][]matrizB = getMatrizAleatoria(n[i], n[i]);
            
            long inicio = System.nanoTime();
            sumarMatricesIterativa(matrizA, matrizB);
            long fin = System.nanoTime();
            
            long tiempo = fin - inicio;

            System.out.println("Tiempo para dimension " + n[i] + " es: " + tiempo);
            
        }    
       
    }
    
    public static int numAleatorio = 100;
    
    public static int[][] sumarMatricesIterativa(int [][]a, int [][]b){
        int filas = a.length;
        int columnas = a[0].length;
        int resultado[][] = new int [filas][columnas];
        
        if(b.length!=filas || b[0].length!=columnas){
            throw new IllegalArgumentException("Las matrices deben de tener la misma dimension");
        }
        
        //System.out.println("Matriz resultado: \n");
        for(int i = 0; i < filas; i++){
            //System.out.println("\n");
            for (int j = 0; j < columnas; j++) {
                // System.out.println((resultado[i][j]=a[i][j]+b[i][j]));
                resultado[i][j]=a[i][j]+b[i][j];
            }
        }
        return resultado;
    }
    
    public static int[][] getMatrizAleatoria(int filas, int columnas){
        int[][] matriz = new int[filas][columnas];

        for(int i = 0; i < filas; i++){
            //System.out.println("\n");
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = (int)(Math.random()*numAleatorio)+1;
                // System.out.println(matriz[i][j]);
            }
        }
        return matriz;
    }   
}
