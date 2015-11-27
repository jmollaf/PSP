/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package consultamedicasemaforos;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Medico extends Thread{
       public int pacientes=0;      
       public Medico(int pacientes){
                  this.pacientes=pacientes;
       }
}
