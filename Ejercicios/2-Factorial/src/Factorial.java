public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int resultado = factorialRecursivo(n);
        System.out.println("El factorial del numero " + n + " es: " + resultado);

    }

    public static int factorialRecursivo(int numero) {

        int res = 0;

        // Caso base: si es 1 no necesita sumar mas numero
        if (numero == 1) {
            res = 1;
        } else {
            // Caso general: el resultado es el propio numero mas la suma de los anteriores
            res = numero * factorialRecursivo(numero - 1);
        }
        return res;
    }

    // Se hace lo siguiente:(((1*2)*3)*4)*5


}