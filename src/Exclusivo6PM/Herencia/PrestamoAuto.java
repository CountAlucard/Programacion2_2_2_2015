
package Exclusivo6PM.Herencia;

public class PrestamoAuto extends Prestamo{
    private double montoSeguro;
    private String descripcionAuto;
    
    public PrestamoAuto(int n, String deudor, double m){
        super(n, deudor, m, 0.08);
        montoSeguro = monto * 0.50;
        balance += montoSeguro;
    }

    public String getDescripcionAuto() {
        return descripcionAuto;
    }

    public void setDescripcionAuto(String descripcionAuto) {
        this.descripcionAuto = descripcionAuto;
    }
    
    public double getMontoSeguro() {
        return montoSeguro;
    }
    
    @Override
    public void quienSoy(){
        System.out.println("Soy de tipo Auto");
    }
    
    @Override
    public String toString(){
        return super.toString() + ", Monto Seguro=" +montoSeguro + ", Descripcion de Auto= "+ descripcionAuto;
    }
       
}
