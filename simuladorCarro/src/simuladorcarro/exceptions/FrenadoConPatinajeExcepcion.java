/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladorcarro.exceptions;

/**
 * Excepción lanzada cuando ocurre patinaje durante un frenado brusco
 * 
 * Indica que el vehículo ha frenado bruscamente y
 * superado el límite de adherencia de las llantas
 * 
 * @author SOFIA RUDAS
 * @version 1.0.0
 * @since 12042025
 * @see VehiculoExcepcion
 */
public class FrenadoConPatinajeExcepcion extends VehiculoExcepcion {
    /**
     * Crea una nueva instancia de la excepción con un mensaje específico
     * 
     * @param mensaje Descripción del patinaje ocurrido, normalmente incluye
     *                la velocidad y condiciones que causaron el patinaje
     */
    public FrenadoConPatinajeExcepcion(String mensaje) {
        super(mensaje);
    }
}

