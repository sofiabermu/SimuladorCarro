/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladorcarro.exceptions;

/**
 * Excepción lanzada cuando ocurre un error relacionado con el encendido del vehículo
 * 
 * Esta excepción se produce cuando se intenta encender un vehículo que ya está encendido,
 * o cuando falla el proceso de encendido por alguna razón mecánica.
 * 
 * @author SOFIA RUDAS
 * @version 1.0.0
 * @since 12042025
 * @see VehiculoExcepcion
 */
public class EncendidoExcepcion extends VehiculoExcepcion {
    /**
     * Crea una nueva instancia de la excepción con un mensaje descriptivo.
     * 
     * @param mensaje Descripción detallada del error de encendido, incluyendo
     *                la causa específica del fallo
     */
    public EncendidoExcepcion(String mensaje) {
        super(mensaje);
    }
}
