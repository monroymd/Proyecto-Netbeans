package ej4_extra_alojamientos.Entidades;

public class ExtraHotelero extends Alojamiento{

    protected boolean privado;
    protected int metroscuad;

    public ExtraHotelero() {
    }

    public ExtraHotelero(boolean privado, int metroscuad) {
        this.privado = privado;
        this.metroscuad = metroscuad;
    }

}
