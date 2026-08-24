public class ObjProducto {
    private int IdProducto;
    private int Cantidad;
    private String Nombre;
    private double Precio;
    private boolean EnOferta;

    public ObjProducto() {

    }
    public ObjProducto(int idProducto, int cantidad, String nombre, double precio, boolean enOferta) {
        IdProducto = idProducto;
        Cantidad = cantidad;
        Nombre = nombre;
        Precio = precio;
        EnOferta = enOferta;
    }
    public int getIdProducto() {
        return IdProducto;
    }
    public void setIdProducto(int idProducto) {
        IdProducto = idProducto;
    }
    public int getCantidad() {
        return Cantidad;
    }
    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public double getPrecio() {
        return Precio;
    }
    public void setPrecio(double precio) {
        Precio = precio;
    }
    public boolean isEnOferta() {
        return EnOferta;
    }
    public void setEnOferta(boolean enOferta) {
        EnOferta = enOferta;
    }
    
}
  