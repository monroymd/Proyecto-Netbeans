/*
Una compañía de promociones turísticas desea mantener información sobre la infraestructura
de alojamiento para turistas, de forma tal que los clientes puedan planear sus vacaciones de
acuerdo con sus posibilidades. Los alojamientos se identifican por un nombre, una dirección,
una localidad y un gerente encargado del lugar. La compañía trabaja con dos tipos de
alojamientos: Hoteles y Alojamientos Extrahoteleros.
Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas. Las
características de las distintas categorías son las siguientes:
• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, de
acuerdo a las prestaciones observadas. Las limosinas están disponibles para cualquier
cliente, pero sujeto a disponibilidad, por lo que cuanto más limosinas tenga el hotel, más caro
será.
El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
agregado por gimnasio) + (valor agregado por limosinas).
Donde:
Valor agregado por el restaurante:
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas.
• $50 si es mayor de 50.
Valor agregado por el gimnasio:
• $50 si el tipo del gimnasio es A.
• $30 si el tipo del gimnasio es B.
Valor agregado por las limosinas:
• $15 por la cantidad de limosinas del hotel.
En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los
hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada
Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
cuadrados que ocupa. Existen dos tipos de alojamientos extrahoteleros: los Camping y las
Residencias. Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones. Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo. Realizar un programa en el que se representen todas las relaciones
descriptas.
Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento.
 */
package ej4_extra_alojamientos;

import ej4_extra_alojamientos.Entidades.Alojamiento;
import ej4_extra_alojamientos.Entidades.Camping;
import ej4_extra_alojamientos.Entidades.Hotel;
import ej4_extra_alojamientos.Entidades.Hotel_4_Estrellas;
import ej4_extra_alojamientos.Entidades.Hotel_5_Estrellas;
import ej4_extra_alojamientos.Entidades.Residencia;
import ej4_extra_alojamientos.Entidades.ServicioAlojamiento;
import java.util.ArrayList;

import java.util.Scanner;

/**
 *
 * @author Martin Correa
 */
public class Ej4_Extra_Alojamientos {

    public static void main(String[] args) {
        ArrayList<Alojamiento> lista = new ArrayList();
        Scanner leer = new Scanner (System.in).useDelimiter("\n");

        Hotel_4_Estrellas h4 = new Hotel_4_Estrellas();
        Hotel_5_Estrellas h5 = new Hotel_5_Estrellas();

        Camping c1 = new Camping();
        Camping c2 = new Camping(50, 6, true, true, 6000);

        Residencia r1 = new Residencia(20, true, true, true, 800);
        Residencia r2 = new Residencia(30, false, true, false, 1000);
        
        lista.add(h4);
        lista.add(h5);
        lista.add(c1);
        lista.add(c2);
        lista.add(r1);
        lista.add(r2);
        
        
        for (Alojamiento aux : lista) {
            if (aux instanceof Hotel){
            Hotel aux2 = (Hotel) aux;
            aux2.calularPrecioHabitacion();
            }
        }
        
        
            
        System.out.println("-------------MENU-------------");
        System.out.println("Indique metodo de busqueda");
        System.out.println("1) Mostrar Alojamientos");
        System.out.println("2) Mostrar Hoteles de 4 Estrellas");
        System.out.println("3) Mostrar Hoteles de 5 Estrellas");
        System.out.println("4) Mostrar Lista Extra Hoteleros");
        System.out.println("5) Mostrar Campings");
        System.out.println("6) Mostrar Residencias");
        System.out.println("7) Mostrar Hoteles por rango de precios en Orden Descendente");
        System.out.println("8) Mostrar Campings con restaurante");
        System.out.println("9) Mostrar Residencias con descuento");
        System.out.println("10) Realizar otra busqueda? S/N");
        int opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                ServicioAlojamiento.mostrarHoteles(lista);
                break;
            case 2:
                ServicioAlojamiento.mostrarHoteles4(lista);
                break;
            case 3:
                ServicioAlojamiento.mostrarHoteles5(lista);
                break;
            case 4:
                ServicioAlojamiento.mostrarExtraHoteles(lista);
                break;
            case 5:
                ServicioAlojamiento.mostrarCamping(lista);
                break;
            case 6:
                ServicioAlojamiento.mostrarResidencia(lista);
                break;
            case 7:
                ServicioAlojamiento.hotelValorDescendente(lista);
                break;
            case 8:
                ServicioAlojamiento.mostrarCampingRestaurante(lista);
                break;
            case 9:
                ServicioAlojamiento.mostrarResidenciaDescuento(lista);
                break;
            case 10:
                    System.out.println("Quiere continuar?");
                    String seguir = leer.next();
                try {
            } catch (Exception e) {
                    System.out.println("Error, bebe (borracho) colocar una letra");
                    System.out.println(e.getMessage());
                    System.out.println(e.fillInStackTrace());
            }
                System.out.println("Muchas Gracias");
                break;
            
        }
        
        
    }

}
