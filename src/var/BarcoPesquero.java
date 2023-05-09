/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package var;

/**
 *
 * @author 34633
 */
public class BarcoPesquero implements Barco {
    int metros_eslora ;
    int potencia;
    int num_pescadores;
    
    //constructor:

    public BarcoPesquero(int metros_eslora, int potencia, int num_pescadores) {
        this.metros_eslora = metros_eslora;
        this.potencia = potencia;
        this.num_pescadores = num_pescadores;
        System.out.println("Barco Pesquero creado: "+metros_eslora+" "+potencia+" "+num_pescadores);

    }
    
    //getters y setters:

    public int getMetros_eslora() {
        return metros_eslora;
    }

    public void setMetros_eslora(int metros_eslora) {
        this.metros_eslora = metros_eslora;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getNum_pescadores() {
        return num_pescadores;
    }

    public void setNum_pescadores(int num_pescadores) {
        this.num_pescadores = num_pescadores;
    }
    
    //metodos:
    @Override
 

    public void alarma() {
        System.out.println("Alarma");
    }
    
    @Override

    public void Socorro(String mensaje){
        alarma();
        System.out.println("Socorro"+ mensaje);
    
    }
    
    
    
}
