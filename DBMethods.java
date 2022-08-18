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

    public static void main(String[] args) {
        DBMethods methods = new DBMethods();
        //methods.setCiudad("Santa Ana", "Manabi", "12000");
        //methods.deleteCiudad(18);
        //methods.updateCiudad(17, "Santa Ana", "Manabi", "12000");


        ArrayList<Ciudad> foo = new ArrayList<Ciudad>();
//        //methods.setCiudad("New York", "New York", "1000000");
//        //methods.deleteCiudad(18);
//        //methods.updateCiudad(17,"Moscu", "Rusia", "160000");
        foo = methods.searchViewCiudadByHabitantesHigher(20000);
        for(int i=0; i<foo.size(); i++){
            System.out.println("[ " + foo.get(i).id + " " +foo.get(i).nombreCiudad+ " " + foo.get(i).estado + " " + foo.get(i).numeroHabitantes + " ]");
        }
    }
}
// GUI.form
// GUI.java
