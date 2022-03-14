package Practica;

/**
 * @author Melissa Rodriguez y David Mulet
 */
public class Motor {
    //Atributos
    private String fabricante = new String();
    private String potencia = new String();
    private int codigo;

    /**
     * Constructor de objetos motor sin valores
     */
    public Motor(){}
    /**
     *Constructor de objetos motor
     * @param fabricante
     * @param potencia
     * @param codigo
     */
    public Motor(String fabricante, String potencia, int codigo) {
        this.fabricante = fabricante;
        this.potencia = potencia;
        this.codigo = codigo;
    }

    /**
     * Metodo toString del padre
     * @return en formato de String el fabricante, potencia y codigo de un objeto motor
     */
    @Override
    public String toString() {
        return "Motor{" +
                " Fabricante= " + fabricante +
                ", Potencia= " + potencia +
                ", Código= " + codigo +
                "}";
    }

    //Getters y Setters

    /**
     *
     * @return fabricante
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     *
     * @param fabricante
     */
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    /**
     *
     * @return potencia
     */
    public String getPotencia() {
        return potencia;
    }

    /**
     *
     * @param potencia
     */
    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    /**
     *
     * @return codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     *
     * @param codigo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
