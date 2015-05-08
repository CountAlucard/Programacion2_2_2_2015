package Exclusivo6PM.Herencia;

public class PrestamoVivienda extends Prestamo{
    private double gastoCierre;

    public PrestamoVivienda(int numero, String Deudor, double monto) {
        super(numero, Deudor, monto, 0.1);
        gastoCierre = 30000;
    }

    public double getGastoCierre() {
        return gastoCierre;
    }  
    
    @Override
    public void quienSoy(){
        System.out.println("Soy de tipo Vivienda");
    }
    
    @Override
    public String toString(){
        return super.toString() + ", Gasto de Cierre=" + gastoCierre;
    }
        
}
