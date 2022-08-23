package EncapsulationObjects;

public class ClienteEncapsulation {
    public String id;
    public String codCiudad;
    public String nombreCliente;
    public String apellidoCliente;
    public String correoCliente;
    public String salario;

    public ClienteEncapsulation(String id, String codCiudad, String nombreCliente, String apellidoCliente, String correoCliente, String salario) {
        this.id = id;
        this.codCiudad = codCiudad;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.correoCliente = correoCliente;
        this.salario = salario;
    }

}
