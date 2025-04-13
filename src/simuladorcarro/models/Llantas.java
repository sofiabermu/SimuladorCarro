/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladorcarro.models;

/**
 * Representa las llantas de un vehículo con sus características principales
 * 
 * Cada llanta tiene un tipo (Buenas, Bonitas, Baratas) que determina su límite
 * de velocidad segura. El límite se calcula automáticamente al crear la llanta
 * 
 * @author Sofia bermudez
 * @version 1.0.0
 * @since 12042025
 */
public class Llantas {
    private String tipo;
    private int limiteVelocidad;
    
    /**
     * Crea una nueva llanta del tipo especificado.
     * 
     * @param tipo El tipo de llanta (Buenas, Bonitas o Baratas)
     *             Cualquier otro valor será tratado como "Baratas"
     */
    public Llantas(String tipo) {
        this.tipo = tipo;
        actualizarLimiteVelocidad();
    }
    
    /**
     * Calcula el límite de velocidad segura según el tipo de llanta.
     * 
     * Los límites son:
     * Buenas: 110 km/h
     * Bonitas: 70 km/h
     * Baratas: 50 km/h (valor por defecto)
     * 
     */
    private void actualizarLimiteVelocidad() {
        switch (tipo) {
            case "Buenas": limiteVelocidad = 110; break;
            case "Bonitas": limiteVelocidad = 70; break;
            case "Baratas": limiteVelocidad = 50; break;
            default: limiteVelocidad = 50;
        }
    }
    
    /**
     * Obtiene el tipo de llanta
     * 
     * @return El tipo de llanta (Buenas, Bonitas o Baratas)
     */
    public String getTipo() {
        return tipo;
    }
    
    /**
     * Obtiene el límite máximo de velocidad recomendado para estas llantas
     * 
     * @return El límite de velocidad en km/h
     */
    public int getLimiteVelocidad() {
        return limiteVelocidad;
    }
    
}
