package Persona;

/**
 * @author Melissa Rodriguez y David Mulet
 */
public abstract class Persona {
    //Atributos
    private String nombre = new String();
    private String dni = new String();
    private int edad;

    //Constructores
    /**
     * Constructor de objetos persona sin valores
     */
    public Persona(){}

    /**
     *Constructor de objetos persona
     * @param nombre
     * @param dni
     * @param edad
     */
    public Persona(String nombre, String dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    /**
     * Metodo toString del padre
     * @return en formato de String el nombre, dni y edad de un objeto persona
     */
    @Override
    public String toString() {
        return "Persona{" +
                "Nombre= " + nombre +
                ", Dni= " + dni +
                ", Edad= " + edad +
                "}";
    }
    //Getters y Setters
    /**
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * @return dni
     */
    public String getDni() {
        return dni;
    }
    /**
     * @param dni
     */
    public void setDni(String dni) {
        this.dni = dni;
    }
    /**
     * @return edad
     */
    public int getEdad() {
        return edad;
    }
    /**
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

}
