public class SumaRecursiva {
    public static void main(String[] args) {
        int n = 4;
        int resultado = sumaRecursiva(n);
        System.out.println("La suma recursiva del numero " + n + " es: " + resultado);

    }

    public static int sumaRecursiva(int numero) {

        int res = 0;

        // Caso base: si es 1 no necesita sumar mas numero
        if (numero == 1) {
            res = 1;
        } else {
            // Caso general: el resultado es el propio numero mas la suma de los anteriores
            res = numero + sumaRecursiva(numero - 1);
        }
        return res;
    }

    // Lo que hace es ((1+2)+3)+4: suma el caso base con el anterio (1+2), al resultado
    // le suma el siguiente (3+3) y al resultado final le suma el numeoro de origen (6+4)
}