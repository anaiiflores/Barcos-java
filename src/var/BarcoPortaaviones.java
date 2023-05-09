/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package var;

/**
 *
 * @author 34633
 */
    class BarcoPortaaviones implements Barco {
    int num_aviones;
    int num_marinos;
    
    //constructor:

    public BarcoPortaaviones(int num_aviones, int num_marinos) {
        this.num_aviones = num_aviones;
        this.num_marinos = num_marinos;
        
        System.out.println("Barco Portaaviones creado: "+num_aviones+" "+num_marinos);
    }
    
    //getters y setters:

    public int getNum_aviones() {
        return num_aviones;
    }

    public void setNum_aviones(int num_aviones) {
        this.num_aviones = num_aviones;
    }

    public int getNum_marinos() {
        return num_marinos;
    }

    public void setNum_marinos(int num_marinos) {
        this.num_marinos = num_marinos;
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
