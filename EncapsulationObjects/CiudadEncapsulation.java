package EncapsulationObjects;


/**
 * Clase creada para encapsular los dados de la tabla cidad
 */
public class CiudadEncapsulation {

    public String id;
    public String nombreCiudad;
    public String estado;
    public String numeroHabitantes;


    /**
     * Constructor de clase
     * @param id
     * @param nombreCiudad
     * @param estado
     * @param numeroHabitantes
     */
    public CiudadEncapsulation(String id, String nombreCiudad, String estado, String numeroHabitantes) {
        this.id = id;
        this.nombreCiudad = nombreCiudad;
        this.estado = estado;
        this.numeroHabitantes = numeroHabitantes;
    }

}
