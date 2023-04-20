
package ej4_extra_alojamientos.Entidades;

public class Camping extends ExtraHotelero {
    /*la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones
*/
    protected int capMaxCarpas, cantBanios;
    protected boolean restaurante;

    public Camping() {
        this( 40, 5, false, false, 4500);
    }

    public Camping(int capMaxCarpas, int cantBanios, boolean restaurante, boolean privado, int metroscuad) {
        super(privado, metroscuad);
        this.capMaxCarpas = capMaxCarpas;
        this.cantBanios = cantBanios;
        this.restaurante = restaurante;
    }

    public int getCapMaxCarpas() {
        return capMaxCarpas;
    }

    public void setCapMaxCarpas(int capMaxCarpas) {
        this.capMaxCarpas = capMaxCarpas;
    }

    public int getCantBanios() {
        return cantBanios;
    }

    public void setCantBanios(int cantBanios) {
        this.cantBanios = cantBanios;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public String toString() {
        return "Camping{" + "Superficie camping: " + super.metroscuad + " Tipo: "+ super.privado + " " + "capMaxCarpas=" + capMaxCarpas + ", cantBanios=" + cantBanios + ", restaurante=" + restaurante + '}';
    }
    
    
    
}
