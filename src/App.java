import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception 
    {
        int[] arreglo = { 12, -7, 25, 0, -15, 33, 19, -22, 5, 48, -3, 27, -30, 14, 7, -1, 41, 20, -11, 8 };
        int[] original= new int[arreglo.length];

        for (int i = 0; i < arreglo.length; i++) {
            original[i] = arreglo[i];
        }
        
        Scanner scanner = new Scanner(System.in);
        MetodoBurbuja metodoBurbujaClase = new MetodoBurbuja();
        MetodoSeleccion metodoSeleccion = new MetodoSeleccion();
        MetodoInsercion metodoInsercion = new MetodoInsercion();
        MetodoBurbujaMejorado metodoBurbujaMejorado = new MetodoBurbujaMejorado();
        
        boolean continuar=true;
        int[]respuesta;
        String ordenAsDes;
        String pasos;


        while(continuar){
            for (int i = 0; i < arreglo.length; i++) {
                arreglo[i]=original[i];
            }
            System.out.println("\n--------- Metodos de Ordenamiento -------");
            System.out.println("\t[1] Burbuja");
            System.out.println("\t[2] Seleccion");
            System.out.println("\t[3] Insercion");
            System.out.println("\t[4] Murbuja Mejorado");
            System.out.println("\t[5] Salir");
            
            int metodo = getPositive(scanner,"\tIngrese la opcion");
            
            if(metodo==5){
                continuar=false;
                break;
            }
            do {
                System.out.println("Desea ver los pasos (P), No (N)");
                pasos = scanner.next();
            } while (!pasos.equalsIgnoreCase("P") && !pasos.equalsIgnoreCase("N"));
            boolean conPasos=pasos.equalsIgnoreCase("P");

            do {
                System.out.println("¿Desea ordenar ascendente (A) o descendente (D)?");
                ordenAsDes = scanner.next();
            } while (!ordenAsDes.equalsIgnoreCase("A") && !ordenAsDes.equalsIgnoreCase("D"));
            boolean ascendente = ordenAsDes.equalsIgnoreCase("A");

            switch (metodo) {
                case 1:
                    System.out.println("------------ BURBUJA ----------");
                    respuesta=metodoBurbujaClase.ordenar(arreglo, ascendente,conPasos);
                    metodoBurbujaClase.ordenar(arreglo, ascendente,conPasos);
                    System.out.println("\n\t ---- FIN ----\n\n--- Arreglo Original:   ");
                    metodoBurbujaClase.imprimirArreglo(original);
                    System.out.println("\n\n--- Arreglo Ordenado con: \n\tComparaciones: "+respuesta[0]+"\n\tCambios: "+respuesta[1]);
                    metodoBurbujaClase.imprimirArreglo(arreglo);
                    break;
                case 2:
                    System.out.println("------------ SELECCION ---------- ");
                    respuesta=metodoSeleccion.ordenar(arreglo,ascendente,conPasos);
                    metodoSeleccion.ordenar(arreglo,ascendente,conPasos);
                    System.out.println("\n\t ---- FIN ----\n\n--- Arreglo Original:   ");
                    metodoSeleccion.imprimirArreglo(original);
                    System.out.println("\n\n--- Arreglo Ordenado con: \n\tComparaciones: "+respuesta[0]+"\n\tCambios: "+respuesta[1]);
                    metodoSeleccion.imprimirArreglo(arreglo);
                    break;
                case 3:
                    System.out.println("------------ INSERCION ---------- ");
                    respuesta=metodoInsercion.ordenar(arreglo, ascendente,conPasos);
                    metodoInsercion.ordenar(arreglo,ascendente,conPasos);
                    System.out.println("\n\t ---- FIN ----\n\n--- Arreglo Original:   ");
                    metodoInsercion.imprimirArreglo(original);
                    System.out.println("\n--- Arreglo Ordenado con: \n\tComparaciones: "+respuesta[0]+"\n\tCambios: "+respuesta[1]);
                    metodoInsercion.imprimirArreglo(arreglo);
                    break;
                case 4:
//                    System.out.println("****** BurbujaMejorado ********: ");
//                    System.out.println("\n------------ Arreglo Original: ");
//                    respuesta = metodoBurbujaMejorado.ordenarAsBurbujaMejorado(arreglo);
//                    general.imprimirArreglo(arreglo);
//                    metodoBurbujaMejorado.ordenarAsBurbujaMejorado(arreglo);
//                    System.out.println("\n------------ Arreglo Ordenado: ");
//                    general.imprimirArreglo(arreglo);
//                    System.out.println("Comparaciones: " + respuesta[0] + " Cambios: " + respuesta[1]);
//                    break;
                default:
                    System.out.println("Opcion Incorecta");
            }
        }

        // System.out.println("****** BURBUJA ********: ");
        // System.out.println("\n*** Arreglo Ejemplo: ");
        // metodoBurbujaClase.imprimirArreglo(arreglo);
        // metodoBurbujaClase.ordenar(arreglo, false);
        // System.out.println("\n*** Arreglo Ascendente: ");
        // metodoBurbujaClase.imprimirArreglo(arreglo);
        // metodoBurbujaClase.ordenar(arreglo, true);
        // System.out.println("\n*** Arreglo Desendente: ");
        // metodoBurbujaClase.imprimirArreglo(arreglo);
        
        // System.out.println("****** SELECCION ********: ");
        // System.out.println("\n*** Arreglo Ejemplo: ");
        // metodoBurbujaClase.imprimirArreglo(arreglo);
        // metodoSeleccion.ordenar(arreglo, true);
        // System.out.println("\n*** Arreglo Desendente: ");
        // metodoBurbujaClase.imprimirArreglo(arreglo);
        // metodoSeleccion.ordenar(arreglo, false);
        // System.out.println("\n*** Arreglo Ascendente: ");
        // metodoBurbujaClase.imprimirArreglo(arreglo);
        
        // System.out.println("****** INSERCION ********: ");
        // System.out.println("\n--------------------------- Arreglo Ejemplo: ");
        // metodoBurbujaClase.imprimirArreglo(arreglo);
        // metodoInsercion.ordenar(arreglo, true);
        // System.out.println("\n---- FINAL: ");
        // metodoBurbujaClase.imprimirArreglo(arreglo);
        // metodoInsercion.ordenar(arreglo, false);
        // System.out.println("\n---- FINAL: ");
        // metodoBurbujaClase.imprimirArreglo(arreglo);

        
        



    }
    
    public static int getPositive(Scanner scanner,String message){
        System.out.println("Ingrese un numero positivo");
        int number;
        do {
            System.out.print(message + ":");
            number = scanner.nextInt();
            if(number<=0){
                System.out.println("EL numero debe ser positivo. Intente nuevamente");
            }
        } while (number <= 0);
        return number;
        
    }
    public static void imprimirArreglo(int[] arreglo){
        System.out.println("\n---------------------------------");
        for(int i=0 ; i<arreglo.length;i++){
            System.out.print(arreglo[i]+" , ");
        }
        System.out.println("\n---------------------------------");
    }
    
}
