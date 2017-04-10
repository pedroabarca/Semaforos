/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedroAbarca_ProyectoUno;

import java.util.Timer;

public class Auto {
    
    Punto carro;
    int velocidad = 1;

    public Auto(int x, int y, int velocidad) {
        this.carro = new Punto(x, y);
        this.velocidad = velocidad;
    }

    public void reducir_Velocidad(int vel) {
        velocidad = velocidad - vel;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    

}
