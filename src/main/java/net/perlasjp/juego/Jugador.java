package net.perlasjp.juego;

public class Jugador {

   private String nombre;
   
   private int salud;
   
   private int fuerza;
 
    public void recibirDanios(int cantidad) {
        salud = salud - cantidad;
        if (salud < 0) 
            salud = 0; 
    }

        public int atacar() {
        return fuerza;
    }

     public boolean estaVivo() {
        return salud > 0;
    }

    
}

    

