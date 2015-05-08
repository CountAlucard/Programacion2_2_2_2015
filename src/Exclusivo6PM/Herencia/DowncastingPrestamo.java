package Exclusivo6PM.Herencia;

public class DowncastingPrestamo {
    public static void main(String[] args) {
        //UPCASTING
        Prestamo prem = new PrestamoAuto(1,"Bryan",35000);

        //DOWNCASTING INDIRECTO (Util cuando vamos a llamar varias funciones de la clase Hija)
        PrestamoAuto pauto = (PrestamoAuto)prem;
        pauto.setDescripcionAuto("Nissan GT-R 2015");
        System.out.println(prem);
        
        //DOWNCASTING DIRECTO(Util y recomendado cuando vamos a llamar una sola funcion de la clase Hija)
        ((PrestamoAuto)prem).setDescripcionAuto("Audi R8 2015");
        System.out.println(prem);
    }
    
}
