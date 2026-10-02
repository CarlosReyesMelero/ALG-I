/**
 *
 * @author carlo
 */
public class p1 {

    public static final int CASO_PRIMERA_POSICION = 0;
    public static final int CASO_MITAD = 1;
    public static final int CASO_ULTIMA_POSICION = 2;
    public static final int CASO_NO_ESTA_PRINCIPIO = 3;
    public static final int CASO_NO_ESTA_MEDIO = 4;
    public static final int CASO_NO_ESTA_FINAL = 5;

    public static void main(String[] args) {
        int[] tamanos = {1000, 2000, 5000, 10000, 20000, 30000, 40000, 50000};
        int[] casos = {
                CASO_PRIMERA_POSICION,
                CASO_MITAD,
                CASO_ULTIMA_POSICION,
                CASO_NO_ESTA_PRINCIPIO,
                CASO_NO_ESTA_MEDIO,
                CASO_NO_ESTA_FINAL
        };
        String[] nombresCasos = {
                "Esta_Inicio", "Esta_Mitad", "Esta_Fin",
                "NoEsta_Inicio", "NoEsta_Mitad", "NoEsta_Fin"
        };

        ejecutarExperimento(tamanos, casos, nombresCasos);
    }

    public static void ejecutarExperimento(int[] tamanos, int[] casos, String[] nombresCasos) {
        System.out.println("==========================================================================================");
        System.out.printf("%-10s | %-16s | %-20s | %-20s%n", "Tamaño", "Caso", "T. Lineal (ns)", "T. Binaria (ns)");
        System.out.println("==========================================================================================");

        for (int tam : tamanos) {
            int[] vector = generarVectorOrdenado(tam);

            for (int j = 0; j < casos.length; j++) {
                int caso = casos[j];
                String nombreCaso = nombresCasos[j];
                int elemento = generarElementoBuscado(vector, tam, caso);

                // Medición Búsqueda Lineal
                long inicioLineal = System.nanoTime();
                busquedaLineal(elemento, vector, tam);
                long finLineal = System.nanoTime();
                long tiempoLineal = finLineal - inicioLineal;

                // Medición Búsqueda Binaria
                long inicioBinaria = System.nanoTime();
                busquedaBinaria(elemento, vector, tam);
                long finBinaria = System.nanoTime();
                long tiempoBinaria = finBinaria - inicioBinaria;

                System.out.printf("%-10d | %-16s | %-20d | %-20d%n", tam, nombreCaso, tiempoLineal, tiempoBinaria);
            }
            System.out.println("------------------------------------------------------------------------------------------");
        }
    }

    public static int[] generarVectorOrdenado(int tam) {
        int[] vec = new int[tam];
        for (int i = 0; i < vec.length; i++) {
            vec[i] = 2 * (i + 1);
        }
        return vec;
    }

    public static int busquedaLineal(int numeroABuscar, int[] vectorOrdenado, int tam) {
        for (int i = 0; i < tam; i++) {
            if (numeroABuscar == vectorOrdenado[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int busquedaBinaria(int numeroABuscar, int[] vectorOrdenado, int tam) {
        int izq = 0;
        int der = tam - 1;

        while (izq <= der) {
            int medio = izq + (der - izq) / 2;

            if (vectorOrdenado[medio] == numeroABuscar) {
                return medio;
            }

            if (vectorOrdenado[medio] < numeroABuscar) {
                izq = medio + 1;
            } else {
                der = medio - 1;
            }
        }
        return -1;
    }

    public static int generarElementoBuscado(int[] vec, int tam, int caso) {
        return switch (caso) {
            case CASO_PRIMERA_POSICION -> vec[0];
            case CASO_MITAD -> vec[tam / 2];
            case CASO_ULTIMA_POSICION -> vec[tam - 1];
            case CASO_NO_ESTA_PRINCIPIO -> vec[0] - 1;
            case CASO_NO_ESTA_MEDIO -> vec[tam / 2] - 1;
            case CASO_NO_ESTA_FINAL -> vec[tam - 1] + 1;
            default -> -1;
        };
    }
}