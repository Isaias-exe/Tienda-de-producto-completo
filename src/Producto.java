
public class Producto {

    public String CodProd;
    public String name;
    public double precio;
    private double costo;
    public String descripcion;

    public Producto(String codProd, String name, int precio, int costo, String descripcion){
        this.CodProd = codProd;
        this.name = name;
        this.precio = precio;
        this.costo = costo;
        this.descripcion = descripcion;
    }

    public double getCosto(){
        return this.costo;
    }

    public void setCosto(int costo){
         this.costo = costo;
    }
    public void mostrarDetalles(){

        System.out.println("Codigo "+this.CodProd);
        System.out.println("Nombre "+this.name);
        System.out.println("Precio "+this.precio);
        System.out.println("costo "+this.costo);
        System.out.println("Descripcion "+this.descripcion);
    }

}
