/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3iterativo;

/**
 *
 * @author carlo
 */
public class EJ3Iterativo {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args){
        try{
            int numero = -1;
            System.out.println("Factorial de " + numero + " es: " + factorial(numero));
        } catch( Exception e){
            System.out.println(e);
        }
        
    }
    
    public static int factorial(int n) throws Exception{
        int i, factorial;
        
        if ( n >= 0 ){
            factorial = 1;

            for(i=0; i<n; i++){
                factorial = factorial*(n-i);
            }
            return factorial; 
        } 
        throw new Exception("Fuera de rango");
    }
    
}
