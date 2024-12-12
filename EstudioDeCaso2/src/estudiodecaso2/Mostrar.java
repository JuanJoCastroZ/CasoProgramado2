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
public class Mostrar {
    //Atributos de clase
    private int columna = 4;
    private int fila = 4;
    private String[][] mapaHotel = new String[columna][fila];
    private String printVisible = "";
    //Constructor
    
    public Mostrar(boolean primeraVez, String[][] datosPreCargados) {
       
        mapaHotel = datosPreCargados;
        mostrarMapa(true);
    }
    private void mostrarMapa(boolean primeraVez){
        for(int i = 0; i < fila; i++) //Guarda los datos de la matriz de habitaciones a un String printeable
        {
            for(int j = 0; j < columna; j++)
            {
                printVisible = printVisible + mapaHotel[i][j] + "|";
            }
            printVisible = printVisible + "\n";
        }
    
        int seleccion;
        Object[] opciones = new Object[]{ "1- Salir", "2- Modificar"};
        seleccion = JOptionPane.showOptionDialog(null,printVisible,"Menu habitaciones",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null, opciones, opciones[0]);
        switch(seleccion){
            case 0:
                Interfaz vuelta = new Interfaz(false, mapaHotel);
                break;
            case 1:
                String habitacion = JOptionPane.showInputDialog("Que numero de habitacion deseas modificar?");
                Modificar modificacion = new Modificar(habitacion, mapaHotel);
                mapaHotel = modificacion.getMapaHotel(); //accede a la modificacion de habitaciones
                mostrarMapa(false);
                break;
        }
    }
    
    
    
}
