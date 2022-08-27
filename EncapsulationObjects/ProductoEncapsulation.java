package EncapsulationObjects;

/**
 * Clase para la encapsulacion de los datos de la tabla Producto
 * @author Gutemberg S. Mendoza
 */
public class ProductoEncapsulation {
    public String codigoProducto;
    public String nombreProducto;
    public String descuentoProducto;
    public String unidadProducto;
    public String precioProducto;
    public String tipoProducto;

    /**
     * Constructor de la clase
     * @param codigoProducto
     * @param nombreProducto
     * @param descuentoProducto
     * @param unidadProducto
     * @param precioProducto
     * @param tipoProducto
     */
    public ProductoEncapsulation(String codigoProducto, String nombreProducto, String descuentoProducto, String unidadProducto, String precioProducto, String tipoProducto) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.descuentoProducto = descuentoProducto;
        this.unidadProducto = unidadProducto;
        this.precioProducto = precioProducto;
        this.tipoProducto = tipoProducto;
    }
}
