package pedroAbarca_ProyectoUno;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import pedroAbarca_ProyectoUno.Punto;
import java.util.LinkedList;

/**
 *
 * @author Pedro
 */
public class Semaforo {
    LinkedList<Punto> luces;
    String estado;

    public Semaforo(int x, int y, boolean horizontal, String estado) {
        this.luces = new LinkedList<>();
        if (horizontal) {
        luces.add(new Punto(x, y));
        luces.add(new Punto(x-15, y));
        luces.add(new Punto(x-30, y)); 
        }else{
        luces.add(new Punto(x, y));
        luces.add(new Punto(x, y-15));
        luces.add(new Punto(x, y-30)); 
        }
       
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    

    public LinkedList<Punto> getLuces() {
        return luces;
    }
    
    
    
    
    
}
