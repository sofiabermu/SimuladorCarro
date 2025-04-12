/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladorcarro.exceptions;

/**
 * Excepción lanzada cuando se intenta realizar una operación con un vehículo que ha sufrido un accidente
 * 
 * Esta excepción indica que el vehículo está en estado de accidente y por lo tanto
 * no puede realizar ciertas operaciones como acelerar, frenar o encender el motor
 * 
 * @author Sofia bermudez
 * @version 1.0.0
 * @since 12042025
 * @see VehiculoExcepcion
 */
public class AccidenteExcepcion extends VehiculoExcepcion {
    
     /**
     * Crea una nueva instancia de la excepción con un mensaje específico
     * 
     * @param mensaje Descripción detallada del error (normalmente incluye la causa
     *                y la operación que no pudo realizarse)
     */
    public AccidenteExcepcion(String mensaje) {
        super(mensaje);
    }
}
