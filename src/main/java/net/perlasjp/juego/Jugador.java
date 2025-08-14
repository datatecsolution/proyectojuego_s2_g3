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

   public Jugador (String n, int s) {
        n = nombre;
        s = salud;
        fuerza=10;

   }
    
    public String getNombre (){
        return nombre;

    }
    
    public int getSalud (){
        return salud;
    }

    public void mostrarEstado (){
        System.out.println("Jugador:" + nombre);
        System.out.println("Jugador:" + salud);
        System.out.println("Jugador:" + fuerza);
    }
}

    

