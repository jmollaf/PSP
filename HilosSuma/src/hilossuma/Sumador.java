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
public class Sumador extends Thread {
       public void run(){
              SumadorImpresor.suma++;
       }
       
}
