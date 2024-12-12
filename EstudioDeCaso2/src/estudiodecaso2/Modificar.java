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
public class Modificar {

    
    //Atributos de clase
    private String[][] mapaHotel;
    private String habitacionPorModificar;
    //Constructor
    public Modificar(String Habitacion, String[][] mapaHotel) {
        
        habitacionPorModificar = Habitacion;
        this.mapaHotel = mapaHotel;
        modificacionHabitacion();
        
    }
    
    //Metodos
    
    private void modificacionHabitacion()
    {
        for(int i = 1; i < 4; i++)
        {
            for(int j = 1; j < 4; j++)
            {
                
                String datoGuardado[] = mapaHotel[i][j].split(",");
                System.out.println(datoGuardado[0] + habitacionPorModificar);
                if(datoGuardado[0].compareTo(habitacionPorModificar) == 0) //encuentra si la habuitacion por modificar existe
                {
                    Object[] opciones = new Object[]{"1- Numero", "2- Ocupado/No ocupado", "3- Tipo de habitacion", "4-Precio"}; // elige que atributo de la habitacion deseo modificar
                    int seleccion;
                    seleccion = JOptionPane.showOptionDialog(null, "Elige el campo por modificar", "Modificacion", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
                    datoGuardado[seleccion] = JOptionPane.showInputDialog("Introduzca el nuevo dato:");
                    String nuevosAtributos = "";
                    for (int P = 0; P < datoGuardado.length; P++) {
                        nuevosAtributos = nuevosAtributos + datoGuardado[P] + ","; //Guarda los atributos para no tener que hacerlo manualmente para cada combinacion posible
                    }
                    mapaHotel[i][j] = nuevosAtributos; //le devuelve el nuevo valor al mapa de habitaciones
                    Interfaz devolverse = new Interfaz(false, mapaHotel);
                    return;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Ese numero de habitacion no existe.");
    }
    
    public String[][] getMapaHotel() {
        return mapaHotel;
    }
    
    
}
