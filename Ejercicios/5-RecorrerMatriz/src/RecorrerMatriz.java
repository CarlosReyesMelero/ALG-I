public class RecorrerMatriz {
    public static void main(String[] args) {

        int[][] m = {
                {1, 2, 3, 5, 6, 7},
                {4, 5, 6},
                {7, 8, 9}
        };
        recorrerMatrizRecursiva(m, 0, 0);

    }

    public static void recorrerMatrizRecursiva(int[][] m, int i, int j) {

        // Caso base: i alcanza el numero de filas
        if (i == m.length) {
            return;
        }

        // Caso bae: cambio de fila al superar las columnas de dicha fila
        if (j == m[i].length) {
            System.out.println();
            recorrerMatrizRecursiva(m, i + 1, 0);
            return;
        }

        // Caso general: se imprime el elemento de la posicion [i][j] y se pasa a la sig. columna
        System.out.print(m[i][j] + " ");
        recorrerMatrizRecursiva(m, i, j + 1);
    }

}