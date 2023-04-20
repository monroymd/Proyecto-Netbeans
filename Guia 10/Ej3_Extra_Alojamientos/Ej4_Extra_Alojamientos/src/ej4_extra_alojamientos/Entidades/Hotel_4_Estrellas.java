package ej4_extra_alojamientos.Entidades;

public class Hotel_4_Estrellas extends Hotel {
// Gimnasio,
//Nombre del Restaurante, Capacidad del Restaurante,

    protected String gimnasio, nombreRestaurante;
    protected int capRestaurante;

    public Hotel_4_Estrellas(String gimnasio, String nombreRestaurante, int capRestaurante, int CantHab, int numcamas, int CantPisos) {
        super(CantHab, numcamas, CantPisos);
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capRestaurante = capRestaurante;
    }

    public Hotel_4_Estrellas() {
        this("a","nombreResto",41,15,10,5);
    }

    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public int getCapRestaurante() {
        return capRestaurante;
    }

    public void setCapRestaurante(int capRestaurante) {
        this.capRestaurante = capRestaurante;
    }

    @Override
    public String toString() {
        return "Hotel_4_Estrellas{" + super.toString()+ "gimnasio=" + gimnasio + ", nombreRestaurante=" + nombreRestaurante + ", capRestaurante=" + capRestaurante + '}';
    }

    /*El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
agregado por gimnasio) + (valor agregado por limosinas).
     */
    @Override
    public void calularPrecioHabitacion() {
        this.PrecioHab = PRECIO_BASE + calcularCapHotel() + calcularValorAgRestaurante() + calcularValorAgGimnasio();

    }

    public int calcularCapHotel() {
        int x = (1 * super.CantHab * super.CantPisos * super.numcamas);
        return x;
    }

    /*Valor agregado por el restaurante:
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas.
• $50 si es mayor de 50.*/
    public int calcularValorAgRestaurante() {
        if(capRestaurante < 30){
            return 10;
        }else if(capRestaurante < 50 ){
            return 30;
        }else{
            return 50;
        }
    }
    
    public int calcularValorAgGimnasio(){
        if(gimnasio.equalsIgnoreCase("a")){
            return 50;
        }else if(gimnasio.equalsIgnoreCase("b")){
            return 30;
        }else {
            return 0;
        }
    }

    
}
