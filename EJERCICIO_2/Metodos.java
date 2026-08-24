import java.util.Scanner;
public class Metodos {
    Scanner sc = new Scanner(System.in);

    public ObjProducto [][] LlenarMatrizProductos(int n) {
        int id = 1;
        ObjProducto [][] matriz = new ObjProducto[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ObjProducto producto = new ObjProducto();
                producto.setIdProducto(id);
                id++;
                System.out.print("Ingrese el nombre del producto: ");
                producto.setNombre(sc.nextLine());
                System.out.print("Ingrese el precio del producto: ");
                producto.setPrecio(sc.nextDouble());
                System.out.print("¿El producto está en oferta? (1 = si, 0 = no): ");
                int oferta = sc.nextInt();
                sc.nextLine();
                producto.setEnOferta(oferta == 1);                
                
                matriz[i][j] = producto;
            }
    
        }
        return matriz;
    }
    public int SumarInventarioTotal(ObjProducto[][] matriz){
        int totalInventario = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                totalInventario += matriz[i][j].getCantidad();
            }
        }
        return totalInventario;
    }

    public int ContarProductosEnOferta(ObjProducto [][] matriz) {
        if (matriz == null || matriz.length == 0 || matriz[0].length == 0) {
            return 0;
        }

        int contadorOferta = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != null && matriz[i][j].isEnOferta()) {
                    contadorOferta++;
                }
            }
        }
        return contadorOferta;
    }

    public void MostrarProductosEnOferta(ObjProducto [][] matriz) {
        if (matriz == null || matriz.length == 0 || matriz[0].length == 0) {
            System.out.println("No hay productos para mostrar.");
            return;
        }

        System.out.println("Productos en oferta:");
        boolean hayOfertas = false;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != null && matriz[i][j].isEnOferta()) {
                    hayOfertas = true;
                    System.out.println("ID: " + matriz[i][j].getIdProducto() + ", Nombre: " + matriz[i][j].getNombre() + ", Precio: " + matriz[i][j].getPrecio());
                }
            }
        }

        if (!hayOfertas) {
            System.out.println("No hay productos en oferta o la matriz aun no se ha llenado.");
        }
    }

    public int OpcionesMenuPrincipal() {
        System.out.println("Seleccione una opción:");
        System.out.println("1. Llenar matriz de productos");
        System.out.println("2. Contar productos en oferta");
        System.out.println("3. Mostrar productos en oferta");
        System.out.println("4. Salir");
        int opcion = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer
        return opcion;
    }
}
