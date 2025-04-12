/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladorcarro.models;

/**
 * Representa un vehículo con motor y llantas, capaz de acelerar, frenar y mantener
 * un estado de operación (encendido/apagado, accidentado, patinando)
 * 
 * Esta clase actúa como contenedor principal que integra todos los componentes
 * del vehículo y mantiene su estado actual
 * 
 * @author SOFIA RUDAS
 * @version 1.0.0
 * @since 12042025
 */

public class Vehiculo {
    private int velocidadActual;
    private boolean encendido;
    private boolean patinando;
    private boolean accidentado;
    private Motor motor;
    private Llantas[] llantas;
    
     /**
     * Crea un nuevo vehículo con el motor y llantas especificados
     * 
     * @param motor El motor del vehículo
     * @param llantas Array de 4 llantas para el vehículo
     */
    public Vehiculo(Motor motor, Llantas[] llantas) {
        this.velocidadActual = 0;
        this.encendido = false;
        this.patinando = false;
        this.accidentado = false;
        this.motor = motor;
        this.llantas = llantas;
    }
    
    /**
     * Obtiene la velocidad actual del vehículo
     * 
     * @return Velocidad actual en km/h
     */
    public int getVelocidadActual() {
        return velocidadActual;
    }
    
    /**
     * Establece la velocidad actual del vehículo
     * 
     * @param velocidadActual Nueva velocidad en km/h
     */
    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    
    /**
     * Indica si el vehículo está encendido
     * 
     * @return true si está encendido, false si está apagado
     */
    public boolean isEncendido() {
        return encendido;
    }
    
    /**
     * Cambia el estado de encendido del vehículo
     * 
     * @param encendido true para encender, false para apagar
     */
    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
    
    /**
     * Indica si el vehículo está patinando
     * 
     * @return true si está patinando, false en caso contrario
     */
    public boolean isPatinando() {
        return patinando;
    }
    
    /**
     * Cambia el estado de patinaje del vehículo
     * 
     * @param patinando true si está patinando, false si no
     */
    public void setPatinando(boolean patinando) {
        this.patinando = patinando;
    }
    
    /**
     * Indica si el vehículo ha sufrido un accidente.
     * 
     * @return true si está accidentado, false en caso contrario
     */
    public boolean isAccidentado() {
        return accidentado;
    }
    
    /**
     * Cambia el estado de accidente del vehículo
     * 
     * @param accidentado true si ha sufrido accidente, false si no
     */
    public void setAccidentado(boolean accidentado) {
        this.accidentado = accidentado;
    }
    
    /**
     * Obtiene el motor del vehículo
     * 
     * @return El motor del vehículo
     */
    public Motor getMotor() {
        return motor;
    }
    
     /**
     * Obtiene las llantas del vehículo
     * 
     * @return Array con las 4 llantas del vehículo
     */
    public Llantas[] getLlantas() {
        return llantas;
    }
    
}
