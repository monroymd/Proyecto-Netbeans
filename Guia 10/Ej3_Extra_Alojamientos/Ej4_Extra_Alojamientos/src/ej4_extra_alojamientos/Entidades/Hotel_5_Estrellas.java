package ej4_extra_alojamientos.Entidades;

public class Hotel_5_Estrellas extends Hotel_4_Estrellas {

    // Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
    protected int cantSalonesConf, cantSuites, cantLimosinas;

    public Hotel_5_Estrellas() {
        this(4, 5, 3, "a", "nombreResto", 7, 5, 3, 5);
    }

    public Hotel_5_Estrellas(int cantSalonesConf, int cantSuites, int cantLimosinas, String gimnasio, String nombreRestaurante, int capRestaurante, int CantHab, int numcamas, int CantPisos) {
        super(gimnasio, nombreRestaurante, capRestaurante, CantHab, numcamas, CantPisos);
        this.cantSalonesConf = cantSalonesConf;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public int getCantSalonesConf() {
        return cantSalonesConf;
    }

    public void setCantSalonesConf(int cantSalonesConf) {
        this.cantSalonesConf = cantSalonesConf;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(int cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }

    @Override
    public String toString() {
        return "Hotel_5_Estrellas{" + super.toString() + "cantSalonesConf=" + cantSalonesConf + ", cantSuites=" + cantSuites + ", cantLimosinas=" + cantLimosinas + '}';
    }

    @Override
    public void calularPrecioHabitacion() {
        super.calularPrecioHabitacion();
        this.PrecioHab += ValorAgLimosinas();
    }

    /*Valor agregado por las limosinas:
• $15 por la cantidad de limosinas del hotel.*/
    public int ValorAgLimosinas() {
        return 15 * cantLimosinas;
    }

}
