/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package var;

/**
 *
 * @author 34633
 */
public class BarcoCrucero {
    
    public static int cont = 1;
    int metros_eslora ;
    int camas_ocupadas;
    

    //constructor:

    public BarcoCrucero( int metros_eslora, int cont) {
        this.metros_eslora = metros_eslora;
        this.camas_ocupadas = cont;
        
        System.out.println("Barco crucero creado: "+ metros_eslora + cont );
    
    }
    //getters y setters

    public static int getCont() {
        return cont;
    }

    public static void setCont(int cont) {
        BarcoCrucero.cont = cont;
    }

    public int getMetros_eslora() {
        return metros_eslora;
    }

    public void setMetros_eslora(int metros_eslora) {
        this.metros_eslora = metros_eslora;
    }

    public int getCamas_ocupadas() {
        return camas_ocupadas;
    }

    public void setCamas_ocupadas(int camas_ocupadas) {
        this.camas_ocupadas = camas_ocupadas;
    }
    
    
    //metodos
    public void alarma(){
        System.out.println("Alarma");
    
    }
    public void Socorro(String mensaje){
        alarma();
        System.out.println("Socorro"+ mensaje);
    
    }
    
}
