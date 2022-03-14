package Practica;

/**
 * @author Melissa Rodriguez y David Mulet
 */
public class Juguete {
    //Atributos
    private String nombre = new String();
    private int precio;

    /**
     * Constructor de objetos juguete sin valores
     */
    public Juguete() {
    }
    /**
     *Constructor de objetos juguete
     * @param nombre
     * @param precio
     */
    public Juguete(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     * Metodo toString del padre
     * @return en formato de String el nombre y precio de un objeto juguete
     */
    @Override
    public String toString() {
        return "Juguete{" +
                "Nombre= " + nombre +
                ", Precio=" + precio +
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
     * @return precio
     */
    public int getPrecio() {
        return precio;
    }
    /**
     * @param precio
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
