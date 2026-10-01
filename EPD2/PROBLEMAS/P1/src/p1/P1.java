/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p1;

import java.util.Arrays;

/**
 *
 * @author carlo
 */
public class P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // generarVectorOrdenado(8);
        System.out.println(busquedaLineal(8, generarVectorOrdenado(8), 8));              
    }
    
    public static int[] generarVectorOrdenado(int tam){
        int vec[] = new int[tam];
        
        for (int i = 0; i < vec.length; i++) {
            vec[i] = 2 * (i + 1);   
        }
        System.out.println(Arrays.toString(vec));
        return vec;

    }
    
    public static int busquedaLineal(int numeroABuscar, int []vectorOrdenado, int tam){
        
        for (int i = 0; i < vectorOrdenado.length; i++) {
            if(numeroABuscar == vectorOrdenado[i]){
                int pos = i;
                return pos;
            }  
        } 
        return -1;
    }
}
