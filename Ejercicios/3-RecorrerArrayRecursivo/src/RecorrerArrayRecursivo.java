import java.sql.SQLOutput;

public class RecorrerArrayRecursivo {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        mostrarArrayRecursivo(array, 0);
        System.out.println("Imprimo del final al inicio:");
        mostrarArrayRecursivoAlReves(array, 0);


    }

    public static void mostrarArrayRecursivo(int[] array, int indice) {

        if (indice != array.length) {
            System.out.println(array[indice]);
            mostrarArrayRecursivo(array, indice + 1);
        }

    }

    public static void mostrarArrayRecursivoAlReves(int[] array, int indice) {

        if (indice != array.length) {
            mostrarArrayRecursivoAlReves(array, indice + 1);
            System.out.println(array[indice]);
        }

    }
}