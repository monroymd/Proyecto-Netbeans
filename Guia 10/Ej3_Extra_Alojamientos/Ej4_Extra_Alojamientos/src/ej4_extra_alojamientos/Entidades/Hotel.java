
package ej4_extra_alojamientos.Entidades;

public class Hotel extends Alojamiento {
    //Cantidad de Habitaciones, Número de Camas, Cantidad de
//Pisos, Precio de Habitaciones
    protected int CantHab, numcamas, CantPisos, PrecioHab;
    protected final int PRECIO_BASE = 50;

    public Hotel() {
       
    }

    public Hotel(int CantHab, int numcamas, int CantPisos) {
        this.CantHab = CantHab;
        this.numcamas = numcamas;
        this.CantPisos = CantPisos;
    }

    public int getPrecioHab() {
        return PrecioHab;
    }

    
    @Override
    public String toString() {
        return "Hotel{" + "CantHab=" + CantHab + ", numcamas=" + numcamas + ", CantPisos=" + CantPisos + ", PrecioHab=" + PrecioHab + ", PRECIO_BASE=" + PRECIO_BASE + '}';
    }
  
    
    public void calularPrecioHabitacion(){
        
    }
    
    
}
