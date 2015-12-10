package consultamedicasemaforos;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Juan Molla<jmollaf at gmail.com>
 */

public class ConsultaMedicaSemaforos {
                     
              
     public static void main(String[] args) {
        Semaphore Vest= new Semaphore(1);
        Thread hilo1 = new Thread(new Visita(Vest, "Paciente 1"));
        hilo1.start();
        Thread hilo2 = new Thread(new Visita(Vest, "Paciente 2"));
        hilo2.start();
        Thread hilo3 = new Thread(new Visita(Vest, "Paciente 3"));
        hilo3.start();             
     }
    
}
