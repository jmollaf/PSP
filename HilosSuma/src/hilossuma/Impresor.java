/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilossuma;

/**
 *
 * @author Juan Molla Fernandez
 */
public class Impresor extends Thread{
      
       public void run () {
              System.out.println("La suma es:" + SumadorImpresor.suma);
       }
}