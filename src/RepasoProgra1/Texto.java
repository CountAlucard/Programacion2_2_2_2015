
package RepasoProgra1;


public class Texto {
    private String valor;
    private int vocales = 0;
    
    public Texto(String valor)
    {
        this.valor = valor;
    }
    
    public void setValor(String v)
    {
        valor = v;
    }
    
    public String getValor()
    {
        return valor;
    }
    
    public boolean Palindromo()
    {                
        for(int c = 0; c < this.valor.length()-1; c++)
        {
            if(this.valor.charAt(c) != this.valor.charAt(this.valor.length()-1-c))
            {
                return false;
            }
        }        
        return true;
    }
    
    public int getVocales()
    {        
        for(int c = 0; c < this.valor.length(); c++)
        {            
            switch(this.valor.toLowerCase().charAt(c))
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vocales++;
                    break;
            }
                                
        }
        return vocales;
    }
    
    //crear una funcion llamada to_array que me retorne un arreglo unidimensional que tenga los caracteres que el atributo valor tiene.
            
}
