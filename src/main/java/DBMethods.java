import java.sql.*;
import java.util.ArrayList;

public class DBMethods {
    Statement stmt;
    ResultSet rs;
    PreparedStatement prepStmt;


    DBConnection db = new DBConnection();
    Connection conn = db.getConnection();

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
     * Busca una fila de la tabla ciudad y lo guarda en un ArrayList de objetos Ciudad
     * @param id
     * @return
     */
    public ArrayList<Ciudad> searchRowCiudad(int id){
        ArrayList<Ciudad> selectCiudad = new ArrayList<Ciudad>();
        Ciudad ciudad;
        try{
            prepStmt = conn.prepareStatement("SELECT * FROM CIUDAD WHERE CODCIUDAD = ?");
            prepStmt.setString(1, String.valueOf(id));
            rs = prepStmt.executeQuery();

            while(rs.next()){
                String codCiudad = rs.getString("CODCIUDAD");
                String nombreCiudad = rs.getString("NOMBRECIUDAD");
                String estado = rs.getString("ESTADO");
                String numeroHabitantes = rs.getString("numeroHabitantes");
                ciudad = new Ciudad(codCiudad, nombreCiudad, estado,numeroHabitantes);
                selectCiudad.add(ciudad);

            }

        }catch(SQLException e){
            e.printStackTrace();
        }
        return selectCiudad;
    }

    public ArrayList<Ciudad> searchViewCiudadByHabitantesHigher(int numHabitantes){
        ArrayList<Ciudad> selectCiudad = new ArrayList<Ciudad>();
        Ciudad ciudad;
        try{
            prepStmt = conn.prepareStatement("SELECT * FROM CIUDAD WHERE NUMEROHABITANTES > ?");
            prepStmt.setString(1, String.valueOf(numHabitantes));
            rs = prepStmt.executeQuery();

            while(rs.next()){
                String codCiudad = rs.getString("CODCIUDAD");
                String nombreCiudad = rs.getString("NOMBRECIUDAD");
                String estado = rs.getString("ESTADO");
                String numeroHabitantes = rs.getString("numeroHabitantes");
                ciudad = new Ciudad(codCiudad, nombreCiudad, estado,numeroHabitantes);
                selectCiudad.add(ciudad);

            }

        }catch(SQLException e){
            e.printStackTrace();
        }
        return selectCiudad;
    }

    /***
     * Obtiene todos los nombres de ciudades
     * @return
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
     * @return
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

    // PRODUCTO----
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
        //TODO: Completar el metodo deleteProducto, la logica es la misma que deleteCiudad
    }

    public void updateProducto(int id,String nomProd, String descProd, String unidadProd, String precioProd ){
        //TODO: Completar el metodo
    }

//    public ArrayList<Producto> searchRowProducto(int id){
//        //TODO: Completar el metodo, aqui es necesario crear la clase Producto y usar la logica de los metodos anteriores
//        return
//    }

    public ArrayList<String> getProducto(){
        ArrayList<String> nombresProd = new ArrayList<>();
        // TODO: Completar
        return nombresProd;
    }

    public ArrayList<String> getIDProducto(){
        ArrayList<String> IDsProd = new ArrayList<>();
        //TODO: Completar
        return IDsProd;
    }


    public static void main(String[] args) {
        DBMethods methods = new DBMethods();
        methods.setProducto("Bicicleta","0","12","12.4");

    }
}
// GUI.form
// GUI.java
