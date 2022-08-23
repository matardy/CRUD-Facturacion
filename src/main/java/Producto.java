public class Producto {
    public String codigoProducto;
    public String nombreProducto;
    public String descuentoProducto;
    public String unidadProducto;
    public String precioProducto;
    public String tipoProducto;

    public Producto(String codigoProducto, String nombreProducto, String descuentoProducto, String unidadProducto, String precioProducto, String tipoProducto) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.descuentoProducto = descuentoProducto;
        this.unidadProducto = unidadProducto;
        this.precioProducto = precioProducto;
        this.tipoProducto = tipoProducto;
    }
}
