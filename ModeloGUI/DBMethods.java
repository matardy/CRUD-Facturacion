package ModeloGUI;

import EncapsulationObjects.CiudadEncapsulation;
import EncapsulationObjects.ClienteEncapsulation;
import EncapsulationObjects.ProductoEncapsulation;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DBMethods {
    Statement stmt;
    ResultSet rs;
    PreparedStatement prepStmt;


    DBConnection db = new DBConnection();
    Connection conn = db.getConnection();

    // ------- CIUDAD -------------------------------------------
    /***
     * Inserta datos dentro de la tabla ciudad
     * @param nombreCiudad Nombre de la ciudad
     * @param estado Estado de la ciudad
     * @param numeroHabitantes numero de habitantes de la ciudad
     */
    public void setCiudad(String nombreCiudad, String estado, String numeroHabitantes){

        String auxCod = "";
        try{
            stmt = conn.createStatement();
            String query = "SELECT TOP 1 * FROM CIUDAD ORDER BY CODCIUDAD DESC";
            rs = stmt.executeQuery(query);
            while(rs.next()){
                 auxCod = rs.getString("CODCIUDAD");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        String codciudad = String.valueOf(Integer.parseInt(auxCod) + 1);

        // Insertion
        try{
            prepStmt = conn.prepareStatement("INSERT INTO CIUDAD (CODCIUDAD, NOMBRECIUDAD, ESTADO, NUMEROHABITANTES) VALUES (?,?,?,?) ");
            prepStmt.setString(1, codciudad);
            prepStmt.setString(2, nombreCiudad);
            prepStmt.setString(3, estado);
            prepStmt.setString(4, numeroHabitantes);
            prepStmt.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    /***
     * Borra datos de la tabla ciudad dado el Id de la ciudad
     * @param id
     */
    public void deleteCiudad(int id){
        try{
            prepStmt = conn.prepareStatement("DELETE FROM CIUDAD WHERE CODCIUDAD = ?");
            prepStmt.setString(1,String.valueOf(id));
            prepStmt.executeUpdate();



        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    /***
     * Actualiza un dato basado en su ID en la tabla ciudad
     * @param id
     * @param nombreCiudad
     * @param estado
     * @param numeroHabitantes
     */
    public void updateCiudad(int id,String nombreCiudad, String estado, String numeroHabitantes){
        try{
            prepStmt = conn.prepareStatement("UPDATE CIUDAD SET NOMBRECIUDAD = ?, ESTADO = ?, NUMEROHABITANTES = ? WHERE CODCIUDAD = ? ");
            prepStmt.setString(1, nombreCiudad);
            prepStmt.setString(2, estado);
            prepStmt.setString(3, numeroHabitantes);
            prepStmt.setString(4,String.valueOf(id));
            prepStmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }


    }

    /***
     * Busca una fila de la tabla ciudad y lo guarda en un ArrayList de objetos EncapsulationObjects.CiudadEncapsulation
     * @param id
     * @return ArrayList con objetos ciudad
     */
    public ArrayList<CiudadEncapsulation> searchRowCiudad(int id){
        ArrayList<CiudadEncapsulation> selectCiudad = new ArrayList<CiudadEncapsulation>();
        CiudadEncapsulation ciudad;
        try{
            prepStmt = conn.prepareStatement("SELECT * FROM CIUDAD WHERE CODCIUDAD = ?");
            prepStmt.setString(1, String.valueOf(id));
            rs = prepStmt.executeQuery();

            while(rs.next()){
                String codCiudad = rs.getString("CODCIUDAD");
                String nombreCiudad = rs.getString("NOMBRECIUDAD");
                String estado = rs.getString("ESTADO");
                String numeroHabitantes = rs.getString("numeroHabitantes");
                ciudad = new CiudadEncapsulation(codCiudad, nombreCiudad, estado,numeroHabitantes);
                selectCiudad.add(ciudad);

            }

        }catch(SQLException e){
            e.printStackTrace();
        }
        return selectCiudad;
    }

    /***
     * Genera un Select * From Ciudad
     * @return Array list <Ciudad> con Select * From ciudad
     */
    public ArrayList<CiudadEncapsulation> ciudadView(){
        ArrayList<CiudadEncapsulation> selectCiudad = new ArrayList<CiudadEncapsulation>();
        CiudadEncapsulation ciudad;
        try{
            prepStmt = conn.prepareStatement("SELECT * FROM CIUDAD");
            //prepStmt.setString(1, String.valueOf(numHabitantes));
            rs = prepStmt.executeQuery();

            while(rs.next()){
                String codCiudad = rs.getString("CODCIUDAD");
                String nombreCiudad = rs.getString("NOMBRECIUDAD");
                String estado = rs.getString("ESTADO");
                String numeroHabitantes = rs.getString("numeroHabitantes");
                ciudad = new CiudadEncapsulation(codCiudad, nombreCiudad, estado,numeroHabitantes);
                selectCiudad.add(ciudad);

            }

        }catch(SQLException e){
            e.printStackTrace();
        }
        return selectCiudad;
    }

    /***
     * Obtiene todos los nombres de ciudades
     * @return Array List con los nombres de ciudades
     */
    public ArrayList<String> getCiudad(){
        ArrayList<String> nombreCiudades = new ArrayList<>();
        try{
            prepStmt = conn.prepareStatement("SELECT NOMBRECIUDAD FROM CIUDAD");
            rs = prepStmt.executeQuery();

            while(rs.next()){
                nombreCiudades.add(rs.getString("NOMBRECIUDAD"));
            }

        }catch(SQLException e){
            e.printStackTrace();
        }
        return nombreCiudades;
    }

    /***
     * Obtiene los ID de las ciudades
     * @return ArrayList con los id de ciudades
     */
    public ArrayList<String> getIDCiudad(){
        ArrayList<String> nombreCiudades = new ArrayList<>();
        try{
            prepStmt = conn.prepareStatement("SELECT CODCIUDAD FROM CIUDAD");
            rs = prepStmt.executeQuery();
            while(rs.next()){
                nombreCiudades.add(rs.getString("CODCIUDAD"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return nombreCiudades;
    }

    // --------------        FIN CIUDAD     -----------



    // --------------        PRODUCTO       -----------
    public void setProducto(String nomProd, String descProd, String unidadProd, String precioProd){
        String auxCod = "";
        try{
            stmt = conn.createStatement();
            String query = "SELECT TOP 1 * FROM PRODUCTO ORDER BY CODPRODUCTO DESC";
            rs = stmt.executeQuery(query);
            while(rs.next()){
                auxCod = rs.getString("CODPRODUCTO");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        String codProd = String.valueOf(Integer.parseInt(auxCod) + 1);

        // Insertion
        try{
            prepStmt = conn.prepareStatement("INSERT INTO PRODUCTO (CODPRODUCTO, NOMPROD, DESCPPRODUCTO, UNIDADPRODUCTO, PRECIOPRODUCTO, TIPOPROD) VALUES (?,?,?,?,?,?) ");
            prepStmt.setString(1, codProd);
            prepStmt.setString(2, nomProd);
            prepStmt.setString(3, descProd);
            prepStmt.setString(4, unidadProd);
            prepStmt.setString(5, precioProd);
            prepStmt.setString(6, "A");
            prepStmt.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void deleteProducto(int id){
        try{
            prepStmt = conn.prepareStatement("DELETE FROM PRODUCTO WHERE CODPRODUCTO = ?");
            prepStmt.setString(1,String.valueOf(id));
            prepStmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void updateProducto(int id,String nomProd, String descProd, String unidadProd, String precioProd ){
        try{
            prepStmt = conn.prepareStatement("UPDATE PRODUCTO SET NOMPROD = ?, DESCPPRODUCTO = ?, UNIDADPRODUCTO = ?" +
                    ", PRECIOPRODUCTO = ?, TIPOPROD = ? WHERE CODPRODUCTO = ? ");
            prepStmt.setString(1, nomProd);
            prepStmt.setString(2, descProd);
            prepStmt.setString(3, unidadProd);
            prepStmt.setString(4, precioProd);
            prepStmt.setString(5, "A");
            prepStmt.setString(6, String.valueOf(id));
            prepStmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public ArrayList<ProductoEncapsulation> searchRowProducto(int id){
        ArrayList<ProductoEncapsulation> selectProducto = new ArrayList<ProductoEncapsulation>();
        try{
            prepStmt = conn.prepareStatement("SELECT * FROM PRODUCTO WHERE CODPRODUCTO = ?");
            prepStmt.setString(1, String.valueOf(id));
            rs = prepStmt.executeQuery();

            while(rs.next()){
                String codProd = rs.getString("CODPRODUCTO");
                String nomprod = rs.getString("NOMPROD");
                String descProd = rs.getString("DESCPPRODUCTO");
                String uniProd = rs.getString("UNIDADPRODUCTO");
                String precioProd = rs.getString("PRECIOPRODUCTO");
                String tipoProd = rs.getString("TIPOPROD");
                ProductoEncapsulation producto;
                producto = new ProductoEncapsulation(codProd,nomprod,descProd,uniProd,precioProd,tipoProd);
                selectProducto.add(producto);
            }

        }catch(SQLException e){
            e.printStackTrace();
        }
        return selectProducto;
    }

    public ArrayList<ProductoEncapsulation> productoView(){
        ArrayList<ProductoEncapsulation> selectProducto = new ArrayList<ProductoEncapsulation>();
        try{
            prepStmt = conn.prepareStatement("SELECT * FROM PRODUCTO");
            //prepStmt.setString(1, String.valueOf(id));
            rs = prepStmt.executeQuery();

            while(rs.next()){
                String codProd = rs.getString("CODPRODUCTO");
                String nomprod = rs.getString("NOMPROD");
                String descProd = rs.getString("DESCPRODUCTO");
                String uniProd = rs.getString("UNIDADPRODUCTO");
                String precioProd = rs.getString("PRECIOPRODUCTO");
                String tipoProd = rs.getString("TIPOPROD");
                ProductoEncapsulation producto;
                producto = new ProductoEncapsulation(codProd,nomprod,descProd,uniProd,precioProd,tipoProd);
                selectProducto.add(producto);
            }

        }catch(SQLException e){
            e.printStackTrace();
        }
        return selectProducto;
    }

    public ArrayList<String> getProducto(){
        ArrayList<String> nombresProd = new ArrayList<>();
        try{
            prepStmt = conn.prepareStatement("SELECT NOMPROD FROM PRODUCTO");
            rs = prepStmt.executeQuery();
            while(rs.next()){
                nombresProd.add(rs.getString("NOMPROD"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return nombresProd;
    }

    public ArrayList<String> getIDProducto(){
        ArrayList<String> IDsProd = new ArrayList<>();
        try{
            prepStmt = conn.prepareStatement("SELECT CODPRODUCTO FROM PRODUCTO");
            rs = prepStmt.executeQuery();
            while(rs.next()){
                IDsProd.add(rs.getString("CODPRODUCTO"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return IDsProd;
    }
    // ---------  FIN PRODUCTO --------

    // --------- CLIENTE --------------
    public void setCliente(String codCiudad, String nombreCliente, String apellidoCliente, String correoCliente, String salario){
        String auxCod = "";
        try{
            stmt = conn.createStatement();
            String query = "SELECT TOP 1 * FROM CLIENTE ORDER BY CODCLIENTE DESC";
            rs = stmt.executeQuery(query);
            while(rs.next()){
                auxCod = rs.getString("CODCLIENTE");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        String codCliente = String.valueOf(Integer.parseInt(auxCod) + 1);

        try{
            prepStmt = conn.prepareStatement("INSERT INTO CLIENTE (CODCLIENTE, CODCIUDAD, NOMBRECLIENTE, APELLIDOCLIENTE, CORREOCLIENTE, SALARIO) VALUES (?, ?, ?, ?, ?, ?)");
            prepStmt.setString(1, codCliente);
            prepStmt.setString(2, codCiudad);
            prepStmt.setString(3,nombreCliente);
            prepStmt.setString(4, apellidoCliente);
            prepStmt.setString(5,correoCliente);
            prepStmt.setString(6,salario);
            prepStmt.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }

    }

    public void deleteCliente(int id){
        try{
            prepStmt = conn.prepareStatement("DELETE FROM CLIENTE WHERE CODCLIENTE = ?");
            prepStmt.setString(1,String.valueOf(id));
            prepStmt.executeUpdate();



        }catch(SQLException e){
            e.printStackTrace();
        }

    }

    public void updateCliente(int id,String codCiudad, String nombreCliente, String apellidoCliente, String correoCliente, String salario){
        try{
            prepStmt = conn.prepareStatement("UPDATE CLIENTE SET CODCIUDAD = ?, NOMBRECLIENTE = ?, APELLIDOCLIENTE = ?, CORREOCLIENTE = ?, SALARIO = ? WHERE CODCLIENTE = ? ");
            prepStmt.setString(1, codCiudad);
            prepStmt.setString(2, nombreCliente);
            prepStmt.setString(3, apellidoCliente);
            prepStmt.setString(4, correoCliente);
            prepStmt.setString(5, salario);
            prepStmt.setString(6,String.valueOf(id));
            prepStmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public ArrayList<ClienteEncapsulation> searchRowCliente(int id){
        ArrayList<ClienteEncapsulation> selectedCliente = new ArrayList<>();
        ClienteEncapsulation cliente;
        try{
            prepStmt = conn.prepareStatement("SELECT * FROM CLIENTE WHERE CODCLIENTE = ?");
            prepStmt.setString(1, String.valueOf(id));
            rs = prepStmt.executeQuery();

            while(rs.next()){
                String codCliente = rs.getString("CODCLIENTE");
                String codCiudad = rs.getString("CODCIUDAD");
                String nombreCliente = rs.getString("NOMBRECLIENTE");
                String apellidoCliente = rs.getString("APELLIDOCLIENTE");
                String correoCliente = rs.getString("CORREOCLIENTE");
                String salario = rs.getString("SALARIO");

                cliente = new ClienteEncapsulation(codCliente,codCiudad, nombreCliente, apellidoCliente, correoCliente, salario);
                selectedCliente.add(cliente);

            }

        }catch(SQLException e){
            e.printStackTrace();
        }
    return selectedCliente;
    }

    public ArrayList<ClienteEncapsulation> clienteView(){
        ArrayList<ClienteEncapsulation> selectedCliente = new ArrayList<>();
        ClienteEncapsulation cliente;
        try{
            prepStmt = conn.prepareStatement("SELECT * FROM CLIENTE");
            //prepStmt.setString(1, String.valueOf(id));
            rs = prepStmt.executeQuery();

            while(rs.next()){
                String codCliente = rs.getString("CODCLIENTE");
                String codCiudad = rs.getString("CODCIUDAD");
                String nombreCliente = rs.getString("NOMBRECLIENTE");
                String apellidoCliente = rs.getString("APELLIDOCLIENTE");
                String correoCliente = rs.getString("CORREOCLIENTE");
                String salario = rs.getString("SALARIO");

                cliente = new ClienteEncapsulation(codCliente,codCiudad, nombreCliente, apellidoCliente, correoCliente, salario);
                selectedCliente.add(cliente);

            }

        }catch(SQLException e){
            e.printStackTrace();
        }
        return selectedCliente;

    }

    public ArrayList<String> getIDCliente(){
        ArrayList<String> IDClientes = new ArrayList<>();
        try{
            prepStmt = conn.prepareStatement("SELECT CODCLIENTE FROM CLIENTE");
            rs = prepStmt.executeQuery();
            while(rs.next()){
                IDClientes.add(rs.getString("CODCLIENTE"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return IDClientes;
    }

    //-------- FIN CLIENTE -------------

    //------- EL KILOMBO DE FACTURA Y DETALLE-FACTURA --------

    /***
     * -- FACTURA(NUMFACTURA, CODCLIENTE, FECHAEMISION, FORMAPAGO, TOTALFACTURA, DESCUENTO, IVA, SUBTOTAL, TOTAL)
     * -- DETALLE_POR_PRODUCTO(NUMDETALLE, NUMFACTURA, CODPRODUCTO, CANTIDADUNIDADES, PRECIOVENTA, CATEGORIAPRODUCTO)
     */

    public String setFactura(String codCliente, String fechaEmision, String formaPago, String totalFactura,String subtotal, String descuento, String iva,String total){
        String auxCod = "";
        try{
            stmt = conn.createStatement();
            String query = "SELECT TOP 1 * FROM FACTURA ORDER BY NUMFACTURA DESC";
            rs = stmt.executeQuery(query);
            while(rs.next()){
                auxCod = rs.getString("NUMFACTURA");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        String codFactura = String.valueOf(Integer.parseInt(auxCod) + 1);

        try{
            prepStmt = conn.prepareStatement("INSERT INTO FACTURA (NUMFACTURA, CODCLIENTE, FECHAEMISION, FORMAPAGO, TOTALFACTURA, DESCUENTO, IVA, SUBTOTAL, TOTAL) VALUES (?,?,?,?,?,?,?,?,?)" );
            prepStmt.setString(1,codFactura);
            prepStmt.setString(2,codCliente);
            prepStmt.setString(3,fechaEmision);
            prepStmt.setString(4, formaPago);
            prepStmt.setString(5,totalFactura);
            prepStmt.setString(6, descuento);
            prepStmt.setString(7, iva);
            prepStmt.setString(8,subtotal);
            prepStmt.setString(9,total);
            prepStmt.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return codFactura;
    }

    public void setDetalleProducto(String numFactura, String codProducto, String cantidadUnidades, String precioVenta, String categoria){
        String auxCod = "";
        try{
            stmt = conn.createStatement();
            String query = "SELECT TOP 1 * FROM DETALLE_POR_PRODUCTO ORDER BY NUMDETALLE DESC";
            rs = stmt.executeQuery(query);
            while(rs.next()){
                auxCod = rs.getString("NUMDETALLE");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
         String numDetalle = String.valueOf(Integer.parseInt(auxCod) + 1);

        try{
            prepStmt = conn.prepareStatement("INSERT INTO DETALLE_POR_PRODUCTO (NUMDETALLE, NUMFACTURA, CODPRODUCTO, CANTIDADUNIDADES, PRECIOVENTA, CATEGORIAPRODUCTO) VALUES (?, ?, ?, ?, ?, ?)");
            prepStmt.setString(1, numDetalle);
            prepStmt.setString(2, numFactura);
            prepStmt.setString(3, codProducto);
            prepStmt.setString(4, cantidadUnidades);
            prepStmt.setString(5, precioVenta);
            prepStmt.setString(6, categoria);
            prepStmt.executeUpdate();

        }catch (SQLException e){
            e.printStackTrace();
        }

    }




}
