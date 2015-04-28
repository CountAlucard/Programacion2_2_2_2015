
package Semana2;


public class FuncionesRecursivas {
    public void Print(int n)
    {
        if(n > 1)
        {
            Print(n-1);
        }
        System.out.println(n);
    }
    
    public void PrintHelper(int cont, int limit)
    {
        if(cont < limit)
        {
            System.out.println(cont);
            PrintHelper(cont+1, limit);
        }        
    }
    
    //Funcion UP.
    public int Suma(int n)
    {
        if(n > 1)
            return Suma(n-1) + n;
        return 1;
    }
    
    public int Pow(int b, int e)
    {
        if(e > 0)
            return (b*Pow(b,e-1));
        return 1;
    }
}
