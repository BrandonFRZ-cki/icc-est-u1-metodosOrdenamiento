public class MetodoBurbuja {
    public void imprimirArreglo(int[] arreglo) {
        System.out.println("\n---------------------------------");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " , ");
        }
        System.out.println("\n---------------------------------");
    }

    public int[] ordenar(int[] arreglo, boolean ascendente, boolean conPasos) {
        int n = arreglo.length;
        int contComparaciones = 0;
        int contCambios = 0;

        if (conPasos) {
            if (ascendente) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < arreglo.length; j++) {
                        contComparaciones++;
                        System.out.println("\nComparacion " + contComparaciones + " : " + arreglo[i] + " < " + arreglo[j]);
                        if (arreglo[i] < arreglo[j]) {
                            contCambios++;
                            int aux = arreglo[j];
                            arreglo[j] = arreglo[i];
                            arreglo[i] = aux;
                            System.out.println("Intercambio: " + arreglo[j] + " <-> " + aux);
                        } else {
                            System.out.println("\n\tNo hay intercambio en el arreglo");
                        }
                        imprimirArreglo(arreglo);
                    }
                }
            } else {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < arreglo.length; j++) {
                        contComparaciones++;
                        System.out.println("\nComparacion " + contComparaciones + " : " + arreglo[i] + " > " + arreglo[j]);
                        if (arreglo[i] > arreglo[j]) {
                            contCambios++;
                            int aux = arreglo[j];
                            arreglo[j] = arreglo[i];
                            arreglo[i] = aux;
                            System.out.println("Intercambio: " + arreglo[j] + " <-> " + aux);
                        } else {
                            System.out.println("\n\tNo hay intercambio en el arreglo");
                        }
                        imprimirArreglo(arreglo);
                    }
                }
            }
        } else {//sin pasos
            if (ascendente) {
                for (int i = 0; i < n; i++) {
                    for (int j = i + 1; j < n; j++) {
                        contComparaciones++;
                        if (arreglo[i] > arreglo[j]) {
                            int aux = arreglo[j];
                            contCambios++;
                            arreglo[j] = arreglo[i];
                            arreglo[i] = aux;
                        }
                    }
                }

            } else {
                for (int i = 0; i < n; i++) {
                    for (int j = i + 1; j < n; j++) {
                        contComparaciones++;
                        if (arreglo[i] < arreglo[j]) {
                            int aux = arreglo[j];
                            contCambios++;
                            arreglo[j] = arreglo[i];
                            arreglo[i] = aux;

                        }
                    }
                }

            }
        }
        int[] respuesta = {contComparaciones, contCambios};
        return respuesta;

    }
}
