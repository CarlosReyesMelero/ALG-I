/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e2;

/**
 *
 * @author carlo
 */
public class E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        int n = 1;
        System.out.println("Resultado: " + puzzle(n));
       
    }

    public static int puzzle(int n) throws Exception {
        if ( n <= 0){
            if (n == 1) {
                return 1;
            }
            if (n % 2 == 0) {
                return puzzle(n / 2);
            } else {
                return puzzle(3 * n + 1);
            }
        }
        throw new Exception("Fuera de rango");
    }
}
