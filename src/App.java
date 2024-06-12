
import java.util.ArrayList;
import java.util.Scanner;
public class App {
    
    public static Scanner sc = new Scanner(System.in);
    
    public static ArrayList<Producto> productos = new ArrayList<Producto>();
    public static void main(String[] args) throws Exception {
        

        System.out.println("Bienvenido a la tienda");

        boolean repetir = true;

            do {
                try {
                    System.out.println("Que accion desea realizar");
                    System.out.println("1. Ingresar");
                    System.out.println("2. Mostrar catalogo");
                    System.out.println("3. Eliminar");
                    System.out.println("4. Buscar");
                    System.out.println("5. Modificar");
                    System.out.println("0. Salir");
    
                
                int respuesta = sc.nextInt();
                   sc.nextLine();
    
                switch (respuesta) {
                    case 1:
                         ingreseproductos();
                        break;
                    case 2:
                        mostrarCatalogo();
                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:
                        
                        break;
                    case 6:
                        
                        break;
                
                    default:
                    System.out.println("Opcion no valida");
                        break;
                }
                } catch (Exception e) {
                    System.out.println("Error");
                    sc.nextLine();
                }
    
            } while (repetir);
            System.out.println("Gracias por usar la tienda");
            }
            public static void ingreseproductos(){
             System.out.println("Ingrese codigo del producto");
             String codprod=sc.nextLine();
             System.out.println("Ingrese nombre del producto");
             String nombre=sc.nextLine();
             System.out.println("Ingrese precio del produccto");
             double precio=sc.nextDouble();
             sc.nextLine();
             System.out.println("Ingrese costo del producto");
             double costo=sc.nextDouble();
             sc.nextLine();
             System.out.println("Ingrese la descripcion del producto");
             String descripcion=sc.nextLine();

             Producto nuevProducto= new Producto(codprod, nombre, 0, 0, descripcion);
             productos.add(nuevProducto);


        }
            public static void mostrarCatalogo(){
                if (productos.size()==0) {
                    System.out.println("No hay productos en el catalogo");
                
                } else {
                    for (Producto producto: productos) {
                        producto.mostrarDetalles();
                        System.out.println("=================================");
                        
                    }
                    
                }

            }
            
    
}
