package EJERCICIO_1;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la dimensión de la matriz (n x n):");
        int n = sc.nextInt();
        sc.nextLine(); // Limpiar buffer
        
        ObjProducto[][] matriz = new ObjProducto[n][n];
        Metodos metodos = new Metodos(sc);
        
        boolean continuar = true;
        
        while (continuar) {
            int opcion = metodos.OpcionesMenuPrincipal();
            
            switch (opcion) {
                case 1:
                    matriz = metodos.LlenarMatrizProductos(n);
                    System.out.println("✓ Matriz llenada exitosamente");
                    break;
                    
                case 2:
                    int total = metodos.ContarProductosEnOferta(matriz);
                    System.out.println("\n========== RESULTADO ==========");
                    System.out.println("Total de productos en oferta: " + total);
                    System.out.println("De un total de: " + (n * n) + " productos");
                    break;
                    
                case 3:
                    metodos.MostrarProductosEnOferta(matriz);
                    break;
                    
                case 4:
                    System.out.println("¡Gracias por usar el sistema!");
                    continuar = false;
                    break;
                    
                default:
                    System.out.println("❌ Opción no válida. Intente de nuevo.");
            }
        }
    }
}
