public class Main {
    public static void main(String[] args) {

        int [] tamanos = new int[] {10,25,50,75,100,150,200,250,500,750,1000,1250,1500,1750,1900,2000};

        System.out.println("Tamanio || Tiempo de inserccion (ms) || Tiempo burbuja (ms)");

        for (int i = 0; i < tamanos.length; i++) {
            int tam = tamanos[i];

            int[] vectorOriginal = rellenarArray(tam);

            int[] vectorInserccion = vectorOriginal.clone();
            int[] vectorBurbuja = vectorOriginal.clone();
            int[] vectorOrdenarPorSeleccion = vectorOriginal.clone();

            long inicioInsercion = System.nanoTime();
            ordenarPorInsercion(vectorInserccion);
            long finInsercion = System.nanoTime();
            long tiempoInsercionNs = (finInsercion - inicioInsercion);

            long inicioBurbuja = System.nanoTime();
            ordenarPorBurbujaIterativo(vectorOrdenarPorSeleccion);
            long finBurbuja = System.nanoTime();
            long tiempoBurbujaNs = (finBurbuja - inicioBurbuja);

            long inicioSeleccion = System.nanoTime();
            ordenacionPorSeleccion(vectorOrdenarPorSeleccion);
            long finSeleccion = System.nanoTime();
            long tiempoSeleccionNs = (finSeleccion - inicioSeleccion);

            System.out.println(tam + " | " + tiempoInsercionNs + " | " + tiempoBurbujaNs + " | " + tiempoSeleccionNs);
        }


    }

    public static int[] rellenarArray(int tam){
        int[] vectorAleatorio = new int[tam];
        for (int i = 0; i < vectorAleatorio.length; i++) {
            vectorAleatorio[i] = (int) (Math.random() * 10000);
        }
        return vectorAleatorio;
    }

    public static void ordenarPorInsercion(int[] vector) {
        int j, valorActual;
        for (int i = 1; i < vector.length; i++) {
            valorActual = vector[i];
            j = i - 1;
            while ((j >= 0) && (valorActual < vector[j])) {
                vector[j + 1] = vector[j];
                j--;
            }
            vector[j + 1] = valorActual;
        }
    }

    public static void ordenarPorBurbujaIterativo(int[] vector) {
        int i, aux;
        boolean intercambio;
        do {
            intercambio = false;
            for (i = 0; i < vector.length - 1; i++) {
                if (vector[i + 1] < vector[i]) {
                    aux = vector[i + 1];
                    vector[i + 1] = vector[i];
                    vector[i] = aux;
                    intercambio = true;
                }
            }
        } while (intercambio);
    }

    public static void ordenacionPorSeleccion(int[] vector) {
        int n = vector.length;
        // Mover el límite de la sublista no ordenada a la sublista ordenada
        for (int i = 0; i < n - 1; i++) {
            // Encontrar el índice del elemento mínimo en el resto del vector no ordenado
            int indiceMin = i;
            for (int j = i + 1; j < n; j++) {
                if (vector[j] < vector[indiceMin]) {
                    indiceMin = j;
                }
            }
            // Intercambiar el elemento mínimo encontrado con el primer elemento no
            // ordenado
            int temp = vector[indiceMin];
            vector[indiceMin] = vector[i];
            vector[i] = temp;
        }
    }

}