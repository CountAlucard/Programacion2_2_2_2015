
package Exclusivo6PM.Herencia;

import java.util.Date;

public class Prestamo {
    protected int numero;
    protected String Deudor;
    protected double monto, balance, tasa;
    protected Date fecha;

    public Prestamo(int numero, String Deudor, double monto, double tasa) {
        this.numero = numero;
        this.Deudor = Deudor;
        this.monto = monto;
        this.tasa = tasa;
        balance = monto;
        fecha = new Date();
    }
    
    public int getNumero() {
        return numero;
    }

    public String getDeudor() {
        return Deudor;
    }

    public double getMonto() {
        return monto;
    }

    public double getBalance() {
        return balance;
    }

    public double getTasa() {
        return tasa;
    }

    public Date getFecha() {
        return fecha;
    }
    
    public void abono(double m){
        balance -= m;
    }

    @Override
    public String toString() {
        return "numero=" + numero + ", Deudor=" + Deudor + ", monto=" + monto + ", balance=" + balance + ", tasa=" + tasa;
    }
    
    public void quienSoy(){
        System.out.println("Soy el Padre");
    }
    
            
}
