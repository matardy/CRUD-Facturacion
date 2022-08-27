package EncapsulationObjects;

/**
 * Clase creada para encapsular los datos de la tabla cliente
 */
public class ClienteEncapsulation {
    public String id;
    public String codCiudad;
    public String nombreCliente;
    public String apellidoCliente;
    public String correoCliente;
    public String salario;

    /**
     * Constructor de la clase
     * @param id
     * @param codCiudad
     * @param nombreCliente
     * @param apellidoCliente
     * @param correoCliente
     * @param salario
     */
    public ClienteEncapsulation(String id, String codCiudad, String nombreCliente, String apellidoCliente, String correoCliente, String salario) {
        this.id = id;
        this.codCiudad = codCiudad;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.correoCliente = correoCliente;
        this.salario = salario;
    }

}
