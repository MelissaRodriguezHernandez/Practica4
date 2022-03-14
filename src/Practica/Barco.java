package Practica;
import java.util.Date;

/**
 * @author Melissa Rodriguez y David Mulet
 */
public class Barco  {
    //Atributos
    private String nombre = new String ();
    private Date fechaConstrucción = new Date();
    private int numCamarotes;
    private Motor motor;

    /**
     * Constructor de objetos barco sin valores
     */
    public Barco(){}
    /**
     *Constructor de objetos barco
     * @param nombre
     * @param fechaConstrucción
     * @param numCamarotes
     * @param motor
     */
    public Barco(String nombre, Date fechaConstrucción, int numCamarotes, Motor motor) {
        this.nombre = nombre;
        this.fechaConstrucción = fechaConstrucción;
        this.numCamarotes = numCamarotes;
        this.motor = new Motor();
    }

    /**
     * Metodo toString del padre
     * @return en formato de String el nombre, fecha de construccion y numero de camarotes de un objeto barco
     */
    @Override
    public String toString() {
        return "Barco{" +
                " Nombre=" + nombre +
                " FechaConstrucción= " + fechaConstrucción +
                ", NumCamarotes= " + numCamarotes +
                "}";
    }

    //Getters y Setters

    /**
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return fechaConstrucción
     */
    public Date getFechaConstrucción() {
        return fechaConstrucción;
    }

    /**
     *
     * @param fechaConstrucción
     */
    public void setFechaConstrucción(Date fechaConstrucción) {
        this.fechaConstrucción = fechaConstrucción;
    }

    /**
     *
     * @return numCamarotes
     */
    public int getNumCamarotes() {
        return numCamarotes;
    }

    /**
     *
     * @param numCamarotes
     */
    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    /**
     * Metodo sonido
     */

    public void sonido(){};
}
