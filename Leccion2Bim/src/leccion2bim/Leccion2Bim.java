package leccion2bim;
public class Leccion2Bim {
    public static void main(String[] args) {
        
        //Inicializacion - Declaración de variables
        int [] arreglo1 = {110, 220, 430, 140, 250, 460};
        int [] arreglo2 = {10, 20, 30, 40, 50, 60};
        double [] arreglo3 = new double [6];
        double suma = 0;
        double promedio;
        
        //Imprimir encabezado
        System.out.print("\nArreglo1\tArreglo2\tArreglo3\n");
        
        // Calculo de valores para el arreglo 3 - Impresión de valores
        for (int contador = 0; contador < arreglo1.length; contador++){
            arreglo3[contador] = arreglo1[contador] / arreglo2[contador];
            System.out.printf("%d\t\t%d\t\t%.2f\n", arreglo1[contador], arreglo2[contador], arreglo3[contador]);
            suma = suma + arreglo3[contador];
        }
        promedio = suma/arreglo1.length;
        
        //Imprimir Promedio de arreglo 3
        System.out.print("El promedio del arreglo 3 es "+promedio+"\n");
    }
}
