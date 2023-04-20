package ej4_extra_alojamientos.Entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ServicioAlojamiento {

    public static void mostrarHoteles(ArrayList<Alojamiento> lista) {
        System.out.println("Lista de Hoteles");
        for (Alojamiento aux : lista) {
            
                System.out.println(aux);
            

        }
    }

    public static void mostrarHoteles4(ArrayList<Alojamiento> lista) {
        System.out.println("Lista de Hoteles de 4 Estrellas");
        for (Alojamiento aux : lista) {
            if (aux instanceof Hotel_5_Estrellas){
                break;
            } else if (aux instanceof Hotel_4_Estrellas) {
                System.out.println(aux);
            }

        }
    }

    public static void mostrarHoteles5(ArrayList<Alojamiento> lista) {
        System.out.println("Lista de Hoteles de 5 Estrellas");
        for (Alojamiento aux : lista) {
            if (aux instanceof Hotel_5_Estrellas) {
                System.out.println(aux);
            }

        }
    }

    public static void mostrarExtraHoteles(ArrayList<Alojamiento> lista) {
        System.out.println("Lista de Alojamientos Extra Hoteleros");
        for (Alojamiento aux : lista) {
            if (aux instanceof ExtraHotelero) {
                System.out.println(aux);
            }

        }
    }

    public static void mostrarCamping(ArrayList<Alojamiento> lista) {
        System.out.println("Lista de Campings");
        for (Alojamiento aux : lista) {
            if (aux instanceof Camping) {
                System.out.println(aux);
            }

        }
    }

    public static void mostrarResidencia(ArrayList<Alojamiento> lista) {
        System.out.println("Lista de Residencias");
        for (Alojamiento aux : lista) {
            if (aux instanceof Residencia) {
               System.out.println(aux);
            }

        }
    }

    public static void mostrarCampingRestaurante(ArrayList<Alojamiento> lista) {
        System.out.println("Lista de Campings con Restaurante");
        for (Alojamiento aux : lista) {
            if (aux instanceof Camping) {
                if (((Camping) aux).restaurante) {
                    System.out.println(aux);
                }
            }
        }
    }

    public static void mostrarResidenciaDescuento(ArrayList<Alojamiento> lista) {
        System.out.println("Lista de Residencias con Descuento");
        for (Alojamiento aux : lista) {
            if (aux instanceof Residencia) {
                if (((Residencia) aux).descuento) {
                   System.out.println(aux);
                }
            }

        }
    }

    public static void hotelValorDescendente(ArrayList<Alojamiento> lista) {
        ArrayList<Hotel> listaHotel = new ArrayList();
        
        for (Alojamiento aux : lista) {
            if (aux instanceof Hotel) {
                listaHotel.add((Hotel) aux);
            }
        }
        
        Comparator<Hotel> comparador = Comparator.comparing(Hotel::getPrecioHab);
        Collections.sort(listaHotel, Collections.reverseOrder(comparador));
        
        System.out.println("Lista Hoteles ordenados de mayor precio a menor");
        
        for (Hotel hotel : listaHotel) {
            System.out.println(hotel);
        }
    }

}
