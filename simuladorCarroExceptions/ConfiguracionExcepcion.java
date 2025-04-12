/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladorcarro.exceptions;

/**
 * Excepción lanzada cuando ocurre un error en la configuración del vehículo
 * 
 * Esta excepción se produce generalmente durante la lectura del archivo de configuración
 * o cuando los parámetros de configuración son inválidos (valores fuera de rango,
 * formatos incorrectos, etc.).
 * 
 * @author Sofia bermudez
 * @version 1.0.0
 * @since 12042025
 * @see VehiculoExcepcion
 */
public class ConfiguracionExcepcion extends VehiculoExcepcion {
    /**
     * Crea una nueva instancia de la excepción con un mensaje específico
     * 
     * @param mensaje Descripción detallada del error de configuración, que puede incluir
     *                el parámetro problemático y el valor esperado
     */
    public ConfiguracionExcepcion(String mensaje) {
        super(mensaje);
    }
}
