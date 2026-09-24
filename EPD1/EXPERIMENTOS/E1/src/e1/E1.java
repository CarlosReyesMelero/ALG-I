/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e1;

/**
 *
 * @author Carlos Reyes
 */
public class E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 11;
        int resultado = Fibonacci(n);
        System.out.println("Fibonacci (" + n + "):" + resultado);
        
    }
    
    public static int Fibonacci(int n){
        int r = 0;
        if (r>=0){
            if (n == 0 || n == 1){
                r = n;
            } else {
                r = Fibonacci(n-1) + Fibonacci(n-2);
            }
            return r;
        }
        return -1;     // Para mostrar el error
    }
}
