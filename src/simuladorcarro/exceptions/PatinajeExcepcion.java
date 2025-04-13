/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladorcarro.exceptions;

/**
 * Excepción lanzada cuando el vehículo comienza a patinar
 * 
 * Esta excepción indica una condición de pérdida de control del vehículo,
 * ya sea por exceso de velocidad o frenado brusco
 * 
 * @author SOFIA RUDAS
 * @version 1.0.0
 * @since 12042025
 * @see VehiculoExcepcion
 */
public class PatinajeExcepcion extends VehiculoExcepcion {
    /**
     * Crea una nueva instancia de la excepción con un mensaje descriptivo.
     * 
     * @param mensaje Detalles sobre las circunstancias del patinaje,
     *                incluyendo posibles causas y recomendaciones
     */
    public PatinajeExcepcion(String mensaje) {
        super(mensaje);
    }
}
