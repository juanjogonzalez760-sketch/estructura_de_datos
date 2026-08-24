package EJERCICIO_1;
public class ObjProducto {
    private int Idproducto;
    private String nombre;
    private double precio;
    private boolean enOferta;

    public ObjProducto() {
    }

    public ObjProducto(int idproducto, String nombre, double precio, boolean enOferta) {
        this.Idproducto = idproducto;
        this.nombre = nombre;
        this.precio = precio;
        this.enOferta = enOferta;
    }

    public int getIdproducto() {
        return Idproducto;
    }
    public void setIdproducto(int idproducto) {
        Idproducto = idproducto;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public boolean isEnOferta() {
        return enOferta;
    }
    public void setEnOferta(boolean enOferta) {
        this.enOferta = enOferta;
    }

    
}
