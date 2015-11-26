/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilossuma;

/**
 *
 * @author Juan Mollá Fernández
 */
public class SumadorImpresor {
       public static int suma = 0;
       
       
       public static void main (String[] args){
              Sumador sum1 = new Sumador();
              Impresor imp1 = new Impresor();
              sum1.setPriority(10);
              imp1.setPriority(1);
              sum1.start();
              imp1.start();
              
       }
}
