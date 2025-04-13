/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladorcarro.exceptions;

/**
 * Excepción lanzada cuando se intenta realizar una operación con un vehículo apagado.
 * 
 * Indica que la operación solicitada (como acelerar o frenar) no puede realizarse
 * porque el vehículo no está encendido. El vehículo debe estar encendido para
 * realizar la mayoría de operaciones
 * 
 * @author Sofia bermudez
 * @version 1.0.0
 * @since 12042025
 * @see VehiculoExcepcion
 */
public class ApagadoExcepcion extends VehiculoExcepcion {
    /**
     * Crea una nueva instancia de la excepción con un mensaje específico
     * 
     * @param mensaje Descripción detallada del error (indica qué operación
     *                no pudo realizarse porque el vehículo está apagado)
     */
    public ApagadoExcepcion(String mensaje) {
        super(mensaje);
    }
}