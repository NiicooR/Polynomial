/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package polynomial;

/**
 *
 * @author NicoSam
 * @param <x>
 */
public class Term <x extends Comparable> implements Comparable  {
    private x coeficiente;
    private int exponente;
    
    public Term()
    {
    }
    
    public Term(x c, int e)
    {
        coeficiente = c ; 
        if(!(e<0))
        {
            exponente = e;  
        }
       
    }
    
    public x getCoeficiente()
    {
        return coeficiente;
        
    }
    
    public int getExponente()
    {
        return exponente;
        
    }       
    
    public void setCoeficiente(x c){
        coeficiente = c;
    }
    
    public void setExponetne(int e){
        exponente= e;
    }
    
    public String toString(){
        return (coeficiente+"x^"+exponente);
        
    }
    public int compareTo(Object x){
       Term c = (Term)x;
       return this.exponente - c.exponente; 
       
    }
}
