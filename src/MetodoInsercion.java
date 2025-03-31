public class MetodoInsercion {
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
        int aux = 0;
        int j = 0;
        if (conPasos) {
            if (ascendente) {
                for (int i = 1; i < n; i++) {
                    aux = arreglo[i];
                    j = i - 1;
                    while (j >= 0 && arreglo[j] > aux) {
                        contComparaciones++;
                        System.out.println("\nComparacion " + contComparaciones + " : " + arreglo[j] + " > " + aux);
                        System.out.println("\nCopio " + arreglo[j] + " posicion: " + j + " en " + arreglo[j + 1] + " posicion: " + (j + 1));
                        arreglo[j + 1] = arreglo[j];

                        imprimirArreglo(arreglo);
                        j--;
                    }
                    if (arreglo[j + 1] <= aux) {
                        System.out.println("\n\tNo hay intercambio por que el arreglo en [ " + (j + 1) + " ] por que no cumple " + arreglo[j] + " > " + aux);
                    } else {
                        arreglo[j + 1] = aux;
                        contCambios++;
                        System.out.println("\nIncerto el auxiliar " + aux);
                        imprimirArreglo(arreglo);
                    }

                }
            } else {
                for (int i = 1; i < n; i++) {
                    aux = arreglo[i];
                    j = i - 1;
                    while (j >= 0 && arreglo[j] < aux) {
                        contComparaciones++;
                        System.out.println("\nComparacion " + contComparaciones + " : " + arreglo[j] + " < " + aux);
                        System.out.println("\nCopio " + arreglo[j] + " posicion: " + j + " en " + arreglo[j + 1] + " posicion: " + (j + 1));
                        arreglo[j + 1] = arreglo[j];

                        imprimirArreglo(arreglo);
                        j--;
                    }
                    if (arreglo[j + 1] >= aux) {
                        System.out.println("\n\tNo hay intercambio por que el arreglo");
                    } else {
                        arreglo[j + 1] = aux;
                        contCambios++;
                        System.out.println("\nIncerto el auxiliar " + aux);
                        imprimirArreglo(arreglo);
                    }

                }
            }
        } else {
            if (ascendente) {
                for (int i = 1; i < n; i++) {
                    aux = arreglo[i];
                    j = i - 1;
                    while (j >= 0 && arreglo[j] > aux) {
                        contComparaciones++;
                        arreglo[j + 1] = arreglo[j];
                        j--;
                    }
                    arreglo[j + 1] = aux;
                    contCambios++;
                }
            } else {
                for (int i = 1; i < n; i++) {
                    aux = arreglo[i];
                    j = i - 1;
                    while (j >= 0 && arreglo[j] < aux) {
                        contComparaciones++;
                        arreglo[j + 1] = arreglo[j];
                        j--;
                    }
                    arreglo[j + 1] = aux;
                    contCambios++;
                }
            }
        }
        int[] respuesta = {contComparaciones, contCambios};
        return respuesta;
    }
}