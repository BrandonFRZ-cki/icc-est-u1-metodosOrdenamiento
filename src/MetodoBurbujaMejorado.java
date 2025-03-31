public class MetodoBurbujaMejorado {
    public int[] ordenarAsBurbujaMejorado(int[] arreglo){

        int n = arreglo.length;
        int contComparaciones=0;
        int contCambios=0;
        for(int i =0; i<n ; i++){
            for(int j=0; j<n-1-i ;j++){
                //System.out.println("Comparaciones: "+contComparaciones+" -> "+ arreglo[j]+" > "+arreglo[j+1]);
                contComparaciones++;
                if (arreglo[j]>arreglo[j+1]){
                    int aux = arreglo[j];
                    arreglo [j] =arreglo[j+1];
                    arreglo [j+1] = aux;
                    contCambios++;
                }
            }
        }
        int []respuesta= {contComparaciones,contCambios};
        return respuesta;
    }
}
