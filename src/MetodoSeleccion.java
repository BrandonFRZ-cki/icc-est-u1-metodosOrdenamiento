public class MetodoSeleccion {
    public void imprimirArreglo(int[] arreglo) {
        System.out.println("\n---------------------------------");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " , ");
        }
        System.out.println("\n---------------------------------");
    }
    public int[] ordenar(int[] arreglo,boolean ascendente,boolean conPasos) {
        int n = arreglo.length;
        int contComparaciones = 0;
        int contCambios = 0;
        boolean control=true;

        if(conPasos){
            if(ascendente){
                for(int i=0;i<n;i++){
                    int minIdx = i;
                    for(int j=i+1;j<n;j++){
                        contComparaciones++;
                        if(arreglo[j]<arreglo[minIdx]){
                            minIdx = j;
                        }
                        System.out.println("\nComparacion " + contComparaciones + " : " + arreglo[j] + " < " + arreglo[minIdx]);
                        if(minIdx==i){
                            System.out.println("\n\tNo hay intercambio en el arreglo");
                        }
                    }
                    if(minIdx!=i){
                        contCambios++;
                        imprimirArreglo(arreglo);
                        int aux = arreglo[minIdx];
                        arreglo[minIdx] = arreglo[i];
                        arreglo[i] = aux;
                        System.out.println("\n\tIntercambio: " + arreglo[minIdx] + " <-> " + aux);
                        imprimirArreglo(arreglo);
                    }
                }
            }else{
                for(int i=0;i<n;i++){
                    int minIdx = i;
                    for(int j=i+1;j<n;j++){
                        contComparaciones++;
                        if(arreglo[j]>arreglo[minIdx]){
                            minIdx = j;
                        }
                        System.out.println("\nComparacion " + contComparaciones + " : " + arreglo[j] + " > " + arreglo[minIdx]);
                        if(minIdx==i){
                            System.out.println("\n\tNo hay intercambio en el arreglo");
                        }
                    }
                    if(minIdx!=i){
                        contCambios++;
                        imprimirArreglo(arreglo);
                        int aux = arreglo[minIdx];
                        arreglo[minIdx] = arreglo[i];
                        arreglo[i] = aux;
                        System.out.println("\n\tIntercambio: " + arreglo[minIdx] + " <-> " + aux);
                        imprimirArreglo(arreglo);
                    }
                }
            }
        }else{
            if(ascendente){
                for(int i=0;i<n;i++){
                    int minIdx = i;
                    for(int j=i+1;j<n;j++){
                        if(arreglo[j]<arreglo[minIdx]){
                            minIdx = j;
                        }
                    }
                    contComparaciones++;
                    if(minIdx!=i){
                        contCambios++;
                        int aux = arreglo[minIdx];
                        arreglo[minIdx] = arreglo[i];
                        arreglo[i] = aux;
                    }
                }
            }else{
                for(int i=0;i<n;i++){
                    int minIdx = i;
                    for(int j=i+1;j<n;j++){
                        if(arreglo[j]>arreglo[minIdx]){
                            minIdx = j;
                        }
                    }
                    contComparaciones++;
                    if(minIdx!=i){
                        contCambios++;
                        int aux = arreglo[minIdx];
                        arreglo[minIdx] = arreglo[i];
                        arreglo[i] = aux;
                    }
                }
            }
        }
        int []respuesta= {contComparaciones,contCambios};
        return respuesta;
    }
}






