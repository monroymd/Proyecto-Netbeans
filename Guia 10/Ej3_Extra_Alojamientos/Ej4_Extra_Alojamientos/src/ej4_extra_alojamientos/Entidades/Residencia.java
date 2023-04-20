
package ej4_extra_alojamientos.Entidades;

public class Residencia extends ExtraHotelero {
    /*cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo
*/
    protected int cantHab;
    protected boolean descuento, campoDeportivo;

    public Residencia() {
        
    }

    public Residencia(int cantHab, boolean descuento, boolean campoDeportivo, boolean privado, int metroscuad) {
        super(privado, metroscuad);
        this.cantHab = cantHab;
        this.descuento = descuento;
        this.campoDeportivo = campoDeportivo;
    }

    public int getCantHab() {
        return cantHab;
    }

    public void setCantHab(int cantHab) {
        this.cantHab = cantHab;
    }

    public boolean isDescuento() {
        return descuento;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public String toString() {
        return "Residencia{"+ " Superficie Residencia: " + super.metroscuad + " Tipo: "+ super.privado + "cantHab=" + cantHab + ", descuento=" + descuento + ", campoDeportivo=" + campoDeportivo + '}';
    }
    
    
    
}
