
package Exclusivo6PM.Herencia;

public class PrestamoAuto extends Prestamo{
    private double montoSeguro;
    
    public PrestamoAuto(int n, String deudor, double m){
        super(n, deudor, m, 0.08);
        montoSeguro = monto * 0.50;
        balance += montoSeguro;
    }
    
    public double getMontoSeguro() {
        return montoSeguro;
    }
       
}
