/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladorcarro.models;

import simuladorcarro.exceptions.AccidenteExcepcion;
import simuladorcarro.exceptions.ApagadoExcepcion;
import simuladorcarro.exceptions.EncendidoExcepcion;
import simuladorcarro.exceptions.FrenadoConPatinajeExcepcion;
import simuladorcarro.exceptions.PatinajeExcepcion;

/**
 * Representa el motor de un vehículo con su funcionalidad básica
 * 
 * Gestiona el encendido/apagado, aceleración y frenado del vehículo,
 * controlando los límites mecánicos y lanzando excepciones cuando se
 * superan los límites de operación segura
 * 
 * @author Sofia bermudez
 * @version 1.0.0
 * @since 12042025
 */
public class Motor {
    private int cilindraje;
    private int velMaxima;
    private Vehiculo vehiculo;
    
    /**
     * Crea un nuevo motor con el cilindraje especificado
     * 
     * @param cilindraje El desplazamiento del motor en cc (1000, 2000 o 3000)
     *                   Valores diferentes usarán 1000cc por defecto
     */
    public Motor(int cilindraje) {
        this.cilindraje = cilindraje;
        calcularVelMaxima();
    }
    
    /**
     * Establece el vehículo al que pertenece este motor.
     * 
     * @param vehiculo El vehículo que contiene este motor
     */

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    /**
     * Calcula la velocidad máxima según el cilindraje del motor
     * 
     * Las velocidades máximas son:
     * 
     *  1000cc: 100 km/h
     *  2000cc: 160 km/h
     *  3000cc: 220 km/h
     * 
     * Otros valores usan 100 km/h por defecto
     */
    private void calcularVelMaxima() {
        switch (cilindraje) {
            case 1000:
                velMaxima = 100;
                break;
            case 2000:
                velMaxima = 160;
                break;
            case 3000:
                velMaxima = 220;
                break;
            default:
                velMaxima = 100; 
        }
    }
    
    /**
     * Obtiene el cilindraje del motor
     * 
     * @return El desplazamiento del motor en cc
     */
    
    public int getCilindraje() {
        return cilindraje;
    }
    
    /**
     * Obtiene la velocidad máxima que puede alcanzar el vehículo con este motor
     * 
     * @return La velocidad máxima en km/h
     */
    
    public int getVelMaxima() {
        return velMaxima;
    }
    
    /**
     * Enciende el motor del vehículo
     * 
     * @throws EncendidoExcepcion Si el vehículo ya está encendido
     * @throws AccidenteExcepcion Si el vehículo está accidentado
     */
    public void encender() throws EncendidoExcepcion, AccidenteExcepcion {
        if (vehiculo.isEncendido()) {
            throw new EncendidoExcepcion("El vehiculo ya esta encendido");
        }
        if (vehiculo.isAccidentado()) {
            throw new AccidenteExcepcion("No se puede encender un vehiculo accidentado");
        }
        
        vehiculo.setEncendido(true);
        System.out.println("El vehiculo ha sido encendido");
    }
    
    /**
     * Apaga el motor del vehículo
     * 
     * @throws ApagadoExcepcion Si el vehículo ya está apagado
     * @throws AccidenteExcepcion Si se apaga a alta velocidad (>60 km/h),
     *                           lo que causa un accidente
     */
    public void apagar() throws ApagadoExcepcion, AccidenteExcepcion {
        if (!vehiculo.isEncendido()) {
            throw new ApagadoExcepcion("El vehiculo ya esta apagado");
        }
        
        if (vehiculo.getVelocidadActual() > 60) {
            vehiculo.setAccidentado(true);
            vehiculo.setEncendido(false);
            vehiculo.setVelocidadActual(0);
            throw new AccidenteExcepcion("El vehiculo se apago a una velocidad superior a 60 Km/h");
        }
        
        vehiculo.setEncendido(false);
        System.out.println("El vehiculo ha sido apagado");
    }
    
    /**
     * Aumenta la velocidad del vehículo
     * 
     * @param vel Cantidad de km/h a aumentar
     * @throws ApagadoExcepcion Si el vehículo está apagado
     * @throws AccidenteExcepcion Si el vehículo está accidentado o si se supera
     *                           la velocidad máxima del motor
     */
    public void acelerar(int vel) throws ApagadoExcepcion, AccidenteExcepcion {
        if (!vehiculo.isEncendido()) {
            throw new ApagadoExcepcion("El vehiculo se encuentra apagado, no es posible acelerar");
        }

        if (vehiculo.isAccidentado()) {
            throw new AccidenteExcepcion("El vehiculo se encuentra accidentado, no es posible acelerar");
        }

        int velocidadActual = vehiculo.getVelocidadActual();
        int velocidadMaxima = vehiculo.getMotor().getVelMaxima();
        int nuevaVelocidad = velocidadActual + vel;

        if (nuevaVelocidad > velocidadMaxima) {
            vehiculo.setAccidentado(true);
            vehiculo.setEncendido(false);
            vehiculo.setVelocidadActual(0);
            throw new AccidenteExcepcion("Se ha superado la velocidad maxima del motor (" + velocidadMaxima + " Km/h), el vehiculo se ha apagado");
        }

        vehiculo.setVelocidadActual(nuevaVelocidad);

        if (vel >= 30) {
            System.out.println("Se ha realizado una aceleracion brusca , velocidad aumentada a " + nuevaVelocidad + " Km/h");
        } else {
            System.out.println("Se ha realizado una aceleracion normal , velocidad aumentada a " + nuevaVelocidad + " Km/h");
        }
    }
    
    /**
     * Reduce la velocidad del vehículo
     * 
     * @param vel Cantidad de km/h a reducir
     * @throws PatinajeExcepcion Si el vehículo comienza a patinar
     * @throws ApagadoExcepcion Si el vehículo está apagado
     * @throws AccidenteExcepcion Si el vehículo está accidentado
     * @throws FrenadoConPatinajeExcepcion Si se produce patinaje por frenado brusco
     */
    
    public void frenar(int vel) throws PatinajeExcepcion, ApagadoExcepcion, AccidenteExcepcion, FrenadoConPatinajeExcepcion {
        if (!vehiculo.isEncendido()) throw new ApagadoExcepcion("El vehiculo esta apagado");
        if (vehiculo.isAccidentado()) throw new AccidenteExcepcion("El vehiculo esta accidentado");
        if (vehiculo.isPatinando()) return;

        int velocidadActual = vehiculo.getVelocidadActual();
        if (velocidadActual == 0) return;

        // Calcular el límite mínimo de las llantas
        int limiteLlantas = vehiculo.getLlantas()[0].getLimiteVelocidad();
        for (int i = 1; i < vehiculo.getLlantas().length; i++) {
            int limite = vehiculo.getLlantas()[i].getLimiteVelocidad();
            if (limite < limiteLlantas) {
                limiteLlantas = limite;
            }
        }

        boolean esFrenoBrusco = vel > 30;
        boolean superaLimite = vel > limiteLlantas;
        boolean frenaMasQueVelocidad = vel > velocidadActual;

        if (frenaMasQueVelocidad) {
            vehiculo.setVelocidadActual(0);
            vehiculo.setPatinando(true);
            throw new PatinajeExcepcion("El vehiculo patina por intentar detenerse en seco");
        }

        if (esFrenoBrusco && superaLimite) {
            vehiculo.setVelocidadActual(0);
            vehiculo.setPatinando(true);
            throw new FrenadoConPatinajeExcepcion("Frenado brusco. El vehiculo patina");
        }

        // Frenado normal o brusco sin patinaje
        int nuevaVelocidad = velocidadActual - vel;
        if (nuevaVelocidad < 0) nuevaVelocidad = 0; // por seguridad

        vehiculo.setVelocidadActual(nuevaVelocidad);

        // Reiniciar patinaje si aplica
        if (vehiculo.isPatinando()) {
            vehiculo.setPatinando(false);
        }
    }

}