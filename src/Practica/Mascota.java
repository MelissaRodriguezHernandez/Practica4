package Practica;

/**
 * @author Melissa Rodriguez y David Mulet
 */
public abstract class Mascota implements ISonido {
    //Atributos
    private String nombre = new String();
    private int edad;

    /**
     * Constructor de objetos mascota sin valores
     */
    public Mascota() {
    }
    /**
     *Constructor de objetos mascota
     * @param nombre
     * @param edad
     */
    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Metodo toString del padre
     * @return en formato de String el nombre y edad de un objeto mascota
     */
    @Override
    public String toString() {
        return "Mascota{" +
                " Nombre= " + nombre +
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
