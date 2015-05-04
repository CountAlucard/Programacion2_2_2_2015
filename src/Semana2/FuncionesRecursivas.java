
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
    
    //Funcion DOWN.
    public int PowD(int b, int pot, int res)
    {
        if(pot >= 1)
            return PowD(b, pot-1, res*b);
        return res;
    }
    
    //calcular el maximo comun divisor.
    
    //Metodo Up:
    public int mcd(int n1, int n2, int d)
    {
        if(n1 >= d && n2 >= d)
        {
            if(n1%d==0 && n2%d==0)
                return mcd(n1/d, n2/d, d) * d;
            return mcd(n1, n2, d+1);
        }
        return 1;
    }
    
    //Metodo Down:
    public int mcd(int n1, int n2, int d, int acum)
    {
        if(n1 >= d && n2 >= d)
        {
            if(n1%d==0 && n2%d==0)
                return mcd(n1/d, n2/d, acum*d);
            return mcd(n1, n2, d+1,acum);
        }
        return acum;
    }
    
    //Formula de Euclides
    
    public int mcd(int n1, int n2)
    {
        if(n2==0)
            return n1;
        return mcd(n2, n1%n2);
    }
    
    //crear una funcion que detecte si una palabra es Palindromo.
    //retornar true si es palindromo, false de lo contrario.
    
    //Averiguar si un numero es primo
    public boolean Primo(int n,int x)
    {
        if(n==1)
            return false;
        
        else if(x < n){
            if(n%x == 0)
                return false;
            return Primo(n, x+1);
        }
        
        return true;        
    }
    
    public void Piramide(int filas, int f, int c)
    {
        if(f <= filas){
            if( c <= f){
                System.out.println("*");
                Piramide(filas, f, c+1);
            }
            else{
                System.out.println();
                Piramide(filas, f+1, 1);
            }
        }                      
    }
    
    
}
