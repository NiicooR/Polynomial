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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Polynomial p = new Polynomial<>(5);
        System.out.println (p.toString());
//        System.out.println(p.valueOf(1));
        System.out.println(p.valueOf(2));
        Integer arreglo[]= {10,9,8,45,6,5};
        Polynomial q= new Polynomial<>(arreglo);
        System.out.println(q.toString());
        System.out.println(q.valueOf(5));
    
    }
    
}
