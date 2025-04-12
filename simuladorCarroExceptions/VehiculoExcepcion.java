/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladorcarro.exceptions;

/**
 * Clase base abstracta para todas las excepciones relacionadas con operaciones del vehículo
 * 
 * Proporciona una estructura común para las excepciones específicas del vehículo,
 * permitiendo un manejo jerárquico de errores en el sistema
 * 
 * @author Sofia bermudez
 * @version 1.0.0
 * @since 12042025
 * @see Exception
 */
public abstract class VehiculoExcepcion extends Exception {
    /**
     * Crea una nueva instancia de la excepción base del vehículo.
     * 
     * @param mensaje Mensaje descriptivo del error que será heredado
     *                por todas las excepciones específicas del vehículo
     */
    public VehiculoExcepcion(String mensaje) {
        super(mensaje);
    }
}
