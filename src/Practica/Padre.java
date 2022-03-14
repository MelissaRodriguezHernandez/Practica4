package Practica;

import Persona.Persona;

/**
 * @author Melissa Rodriguez y David Mulet
 */
public class Padre extends Persona {
    //Atributos
    private String nss = new String();
    private String dirección = new String();

    /**
     * Constructor de objetos adulto sin valores
     */
    public Padre(){}

    /**
     *Constructor de objetos adulto
     * @param nombre
     * @param dni
     * @param edad
     * @param nss
     * @param dirección
     */
    public Padre(String nombre, String dni, int edad, String nss, String dirección) {
        super(nombre, dni, edad);
        this.nss = nss;
        this.dirección = dirección;
    }

    /**
     * Metodo toString del padre
     * @return en formato de String el nombre, dni, edad, nss y dirección de un objeto adulto
     */
    @Override
    public String toString() {
        return "Adulto{" +
                "Nombre= " + getNombre() +
                ", DNI= " + getDni() +
                ", Edad= " + getEdad() +
                ", NSS= " + nss +
                ", Dirección= " + dirección +
                "}";
    }

    //Getters y Setters
    /**
     * @return nss
     */
    public String getNss() {
        return nss;
    }
    /**
     * @param nss
     */
    public void setNss(String nss) {
        this.nss = nss;
    }
    /**
     * @return dirección
     */
    public String getDirección() {
        return dirección;
    }
    /**
     * @param dirección
     */
    public void setDirección(String dirección) {
        this.dirección = dirección;
    }
}
