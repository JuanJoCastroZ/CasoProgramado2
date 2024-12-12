/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudiodecaso2;

/**
 *
 * @author Aulas Heredia
 */
public class EstudioDeCaso2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        String[][] mapaHotel = new String[4][4];
        mapaHotel[0][0] = "Hotel";
        for (int i = 1; i < 4; i++) {
            mapaHotel[0][i] = "Habitacion numero " + i;
            mapaHotel[i][0] = "Piso " + i;
        }
        mapaHotel[1][1] = "101,O,Simple,70$.     ";
        mapaHotel[1][2] = "102,O,Simple,70$.     ";
        mapaHotel[1][3] = "103,S,Simple,70$.     ";
        mapaHotel[2][1] = "201,L,Simple,70$.     ";
        mapaHotel[2][2] = "202,L,Doble,160$.     ";
        mapaHotel[2][3] = "203,O,Simple,70$.     ";
        mapaHotel[3][1] = "301,S,Simple,70$.     ";
        mapaHotel[3][2] = "302,L,Doble,180$.    ";
        mapaHotel[3][3] = "303,O,Simple,70$.    ";
        
        Interfaz interfazInicial = new Interfaz(true, mapaHotel);
    }
    
}
