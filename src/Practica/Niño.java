package Practica;

import Persona.Persona;

/**
 * @author Melissa Rodriguez y David Mulet
 */
public class Niño extends Persona {
    //Atributos
    private String colegio = new String();
    private Juguete juguete ;

    /**
     * Constructor de objetos niño sin valores
     */
    public Niño(){}

    /**
     *Constructor de objetos niño
     * @param nombre
     * @param dni
     * @param edad
     * @param colegio
     */
    public Niño(String nombre, String dni, int edad, String colegio) {
        super(nombre, dni, edad);
        this.colegio = colegio;

    }

    /**
     * Metodo toString del padre
     * @return en formato de String el nombre, dni, edad y colegio de un objeto niño
     */
    @Override
    public String toString() {
        return "Niño{" +
                "Nombre= " + getNombre() +
                ", DNI= " + getDni() +
                ", Edad= " + getEdad() +
                ", Colegio= " + colegio +
                '}';
    }

    //Getters y Setters
    /**
     * @return colegio
     */
    public String getColegio() {
        return colegio;
    }
    /**
     * @param colegio
     */
    public void setColegio(String colegio) {
        this.colegio = colegio;
    }


    /**
     *Metodo comprar, no devuelve nada
     * @param juguete
     */
    public void comprar(Juguete juguete){
        this.juguete = juguete;
    }
}
