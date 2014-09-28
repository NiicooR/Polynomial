/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package polynomial;
import java.util.LinkedList;
/**
 *
 * @author NicoSam
 * @param <x>
 */
public class Polynomial <x extends Comparable >{  
    private LinkedList <Term> ll;
    
    
    public Polynomial(){
        ll= new LinkedList<>();
       Term <x> termino = new Term (0,0); 
       ll.addFirst(termino);
    }
    
     public Polynomial(x coef[]){
         ll= new LinkedList<>(); 
         int grado= coef.length;
        
         for ( int exponente = 0; exponente < grado;exponente++ )
        {
            if(coef[exponente].compareTo(0)!=0){
            Term <x> termino= new Term (coef[exponente], exponente);
            ll.addLast(termino);
            }
                    }
        }   
     
    public Polynomial(int n){
        int coeficiente = n;
        ll= new LinkedList<>();
        for ( int exponente = 0; exponente <= n ; exponente ++,coeficiente--)
        {
            
            Term <x> termino= new Term (coeficiente, exponente);
            ll.addLast(termino);
        }
    }
    
    public Polynomial add(Polynomial<x> pol){
    LinkedList <Term> suma;   
    int cantidadterminos = 0;
    LinkedList entrada= pol.getLista();
    Term ultimodeentrada= (Term)entrada.getLast();
    if (ll.getLast().getExponente()> ultimodeentrada.getExponente()){ cantidadterminos = ll.getLast().getExponente();}
    else{cantidadterminos = ultimodeentrada.getExponente();}
    
    for(int i= 0; i<= cantidadterminos; i++)
    {
      
    }
    
        
       
    return pol;
    }
    
    
    
    public double valueOf(float x){
        double resultado=0;
        int exponente;
        int coeficiente;
        for (Term unTermino : this.ll){
            exponente=unTermino.getExponente() ;
            coeficiente=(Integer) unTermino.getCoeficiente();
            double parcial = coeficiente*(Math.pow(x,exponente));
             resultado += parcial;
        }
        
        return resultado;
         
    }
    
    public LinkedList getLista(){
        return ll;
    }
    
    @Override
    public String toString() {
        String r="";
       for (Term unTermino : this.ll){
          r+=unTermino.toString()+"\t";
       }
       return r;
    }
    
   
}
    

