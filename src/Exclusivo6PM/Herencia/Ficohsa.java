package Exclusivo6PM.Herencia;

import java.util.ArrayList;

public class Ficohsa {
    public static void main(String[] args) {
        //UPCASTING
        ArrayList<Prestamo> prestamos = new ArrayList<>();
        prestamos.add(new PrestamoAuto(1, "Bryan", 35000));
        prestamos.add(new PrestamoVivienda(2,"Carlos",350000));
        prestamos.add(new Prestamo(3,"Alejandro",5000,0.1));
        
        for(Prestamo prem : prestamos){
            //obj instanceof Clase
            if(prem instanceof PrestamoVivienda)
                System.out.print("VIVIENDA ");            
            else if(prem instanceof PrestamoAuto)
                System.out.print("AUTO ");
            else
                System.out.print("PAPA ");
            
            System.out.println(prem);
        }        
      
    }    
}
