/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3recursivo;

/**
 *
 * @author carlo
 */
public class EJ3Recursivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            int numero = -1;
            System.out.println("Factorial de " + numero + " es: " + factorial(numero));
        } catch( Exception e){
            System.out.println(e);
        }
    }
    
    public static int factorial(int n) throws Exception{
        int r = 0;
        
        if( n >= 0 ){
            if (n == 0 || n == 1){
                r = 1;
            } else {
                r = n*factorial(n-1);
            }
            return r;
        }
        throw new Exception("Fuera de rango");
    }
    
    
}
