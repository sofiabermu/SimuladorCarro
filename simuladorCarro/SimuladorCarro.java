/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simuladorcarro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import simuladorcarro.models.Llantas;
import simuladorcarro.models.Motor;
import simuladorcarro.models.Vehiculo;
import simuladorcarro.views.principal;

/**
 * Clase principal que inicia el simulador de vehículos.
 * 
 * Esta clase se encarga de cargar la configuración del vehículo desde un archivo de texto
 * y crear la ventana principal de la aplicación. El archivo de configuración debe contener
 * las especificaciones del motor y las llantas del vehículo
 * 
 * @author Sofia bermudez
 * @version 1.0.0
 * @since 12042025
 */
public class SimuladorCarro {

    /**
     * Punto de entrada principal para la aplicación del simulador de vehículos.
     * 
     * Carga la configuración del vehículo desde un archivo y muestra la interfaz gráfica
     * principal si la carga es exitosa. En caso de error, muestra un mensaje al usuario
     * 
     * @param args Argumentos de línea de comandos (no utilizados en esta aplicación)
     */
    public static void main(String[] args) {
        
        Vehiculo vehiculo = cargarVehiculoDesdeArchivo("src/simuladorcarro/texto/config.txt");

        if (vehiculo != null) {
            vehiculo.getMotor().setVehiculo(vehiculo); 
            principal ventana = new principal(vehiculo);
            ventana.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "No fue posible cargar la configuracion del vehiculo");
        }
    }
    /**
     * Carga la configuración de un vehículo desde un archivo de texto
     * 
     * El archivo debe contener líneas con el formato:
     * 
     * llantas [tipo] - Especifica el tipo de llantas
     * motor [cilindraje] - Especifica el cilindraje del motor
     * @param rutaArchivo Ruta del archivo de configuración a cargar
     * @return Objeto Vehiculo configurado según el archivo, o null si ocurre un error
     * @throws IOException Si ocurre un error al leer el archivo
     * @throws NumberFormatException Si el cilindraje del motor no es un número válido
     */
    public static Vehiculo cargarVehiculoDesdeArchivo(String rutaArchivo) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo));
            String linea;
            String tipoLlantas = "";
            int cilindraje = 0;

            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split("\\s+");
                if (partes[0].equalsIgnoreCase("llantas")) {
                    tipoLlantas = partes[1];
                } else if (partes[0].equalsIgnoreCase("motor")) {
                    cilindraje = Integer.parseInt(partes[1]);
                }
            }

            reader.close();

            Motor motor = new Motor(cilindraje);
            Llantas[] llantas = {
                new Llantas(tipoLlantas),
                new Llantas(tipoLlantas),
                new Llantas(tipoLlantas),
                new Llantas(tipoLlantas)
            };

            return new Vehiculo(motor, llantas);

        } catch (IOException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error al leer la configuracion del taller " + e.getMessage());
            return null;
        }
    }
    
}
