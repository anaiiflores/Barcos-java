/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package var;

/**
 *
 * @author 34633
 */
public class Var {

    /**
     * @param args the command line arguments
     */
    public void inicio(){
        BarcoCrucero crucero = new BarcoCrucero(20,50);
        BarcoPesquero pesquero = new BarcoPesquero(50,51,54);
        BarcoPortaaviones portaaviones = new BarcoPortaaviones(50,50);
        
        crucero.alarma();
        pesquero.Socorro(" ayuda");
        portaaviones.alarma();
    
    
    
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Var varcoss= new Var();
        varcoss.inicio();
    }
    
}
