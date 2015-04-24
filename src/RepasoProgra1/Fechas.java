package RepasoProgra1;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Fechas {
    public static void main(String[] args) {
        Date fecha = new Date();
        Date old = new Date(1000);
        System.out.println(old);
        System.out.println("Milis actuales desde el 70: " + fecha.getTime());
        
        
        if(fecha.getTime() >= old.getTime())
        {
            System.out.println("Fecha paso despues que Old");
        }
        
        if(fecha.after(old))
        {
            System.out.println("Fecha paso despues que Old");
        }
        
        if(old.before(fecha))
        {
            System.out.println("Old paso antes que Fecha");
        }
        
        System.out.println("Fecha ompare to old: " +fecha.compareTo(old));
        System.out.println("Fecha ompare to fecha: " +fecha.compareTo(fecha));
        System.out.println("Old ompare to fecha: " +old.compareTo(fecha));
        
        long diff = fecha.getTime() - old.getTime();
        double segs = diff/1000;
        double mins = segs/60;
        double hours = mins/60;
        double days = hours/24;
        double years = days/365;
        
        System.out.println("Ha pasado " +years);
        
        //----------------------------------------------------------------------
        
        
        //Calendar
        
        Calendar c = Calendar.getInstance();
        c.set(1995, Calendar.SEPTEMBER, 5);
        System.out.println(c.getTime());
        System.out.println("Year: " + c.get(Calendar.YEAR));
        System.out.println("Month: " + c.get(Calendar.MONTH));
        System.out.println("Week of the year: " + c.get(Calendar.WEEK_OF_YEAR));
        
        
        //Add or subtract month, year, days, etc... from given Calendar Date.
        c.add(Calendar.YEAR, 2);
        c.add(Calendar.MONTH, -2);
        
        System.out.println(c.getTime());
        
        //Display Name according to the field assigned.
        
        System.out.println(c.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.KOREAN));
        System.out.println(c.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.forLanguageTag("ko")));
    }
}
