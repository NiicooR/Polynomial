/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package polynomial;

/**
 *
 * @author NicoSam
 */
public class Term implements Comparable  {
    private int coeficiente;
    private int exponente;
    
    public Term()
    {
        coeficiente= 0;
        exponente = -1;
               
    }
    
    public Term(int c, int e)
    {
        coeficiente = c ; 
        if(!(e<0))
        {
            exponente = e;  
        }
       
    }
    
    public int getCoeficiente()
    {
        return coeficiente;
        
    }
    
    public int getExponente()
    {
        return exponente;
        
    }       
    
    public void setCoeficiente(int c){
        coeficiente = c;
    }
    
    public void setExponetne(int e){
        exponente= e;
    }
    
    public String toString(){
        return (coeficiente+"x^"+exponente);
        
    }
    public int compareTo(Object x){
        return -1;
    }
}
