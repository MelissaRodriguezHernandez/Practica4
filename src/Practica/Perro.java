package Practica;

/**
 * @author Melissa Rodriguez y David Mulet
 */
public class Perro extends Mascota{
    //Atributos
    private String raza = new String();

    /**
     * Constructor de objetos perro sin valores
     */
    public Perro(){}
    /**
     *Constructor de objetos perro
     * @param nombre
     * @param edad
     * @param raza
     */
    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    /**
     * Metodo toString del padre
     * @return en formato de String el nombre, edad y raza de un objeto perro
     */
    public String toString() {
        return "Perro{" +
                " Nombre= " + getNombre() +
                ", Edad= " + getEdad() +
                ", Raza= " + raza +
                "}";
    }
    //Getters y Setters
    /**
     * @return raza
     */
    public String getRaza() {
        return raza;
    }
    /**
     * @param raza
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * Metodo sonido
     */
    @Override
    public void sonido(){}
}
