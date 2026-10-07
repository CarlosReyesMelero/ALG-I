public class BuscarElementoArray {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 8};
        int elementoABuscar = 9;
        int posElementoEncontrado = posicionElemento(array, elementoABuscar, 0);
        System.out.println(posElementoEncontrado);

    }

    public static int posicionElemento(int[] array, int elementoBuscar, int indice) {

        if (indice == array.length) {
            // Caso base 1 (fracaso)
            return -1;
        } else if (array[indice] == elementoBuscar) {
            // Caso base 2 (exito)
            return indice;
        } else {
            // Caso general
            return posicionElemento(array, elementoBuscar, indice + 1);
        }
    }
}