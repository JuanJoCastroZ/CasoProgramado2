/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudiodecaso2;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class Interfaz {
    //Atributos de clase
    private boolean primerVez = true;
    private int seleccion = 0;
    private String[][] datosPreCargados;
    //Constructor
    public Interfaz(boolean primerVez, String[][] datosPreCargados) {
        this.primerVez = primerVez;
        this.datosPreCargados = datosPreCargados;
        mostrarMenu();
    }
    //Metodos
    private void mostrarMenu()
    {
        if(primerVez) //Muestra el mensaje de bienvenida solo la primera vez que se ejecuta el programa
        {
            JOptionPane.showMessageDialog(null, "Bienvenido al sistema de hotelería.");
        }
        seleccion = Integer.parseInt(JOptionPane.showInputDialog("Elige una de estas opciones:\n1-Ver habitaciones\n2-Reservar")); //Guarda el proximo paso
        switch(seleccion)
        {
            case 1:
                Mostrar muestra = new Mostrar(primerVez, datosPreCargados); //Clase que muestra las habitaciones con sus atributos
                break;
            case 2: 
                String habitacionporReservar = JOptionPane.showInputDialog("Introduce la habitacion por reservar");
                Reservar reserva = new Reservar(habitacionporReservar); //accede al modulo reserva
                
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida.");
                primerVez = false;
                mostrarMenu();
        }
    }
}
