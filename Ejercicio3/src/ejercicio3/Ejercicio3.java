/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;
import java.io.*;
import java.util.Arrays;


/**
 *
 * @author Sammy Guergachi <jmollaf at gmail.com>
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String[] comando1 = {"ls","-l"};
        String[] comando2 = {"tr","d","D"};
        ProcessBuilder pb1 = new ProcessBuilder(comando1);
        Process process1 = pb1.start();
        ProcessBuilder pb2 = new ProcessBuilder(comando2); 
        Process process2 = pb2.start();
        BufferedReader br1 = new BufferedReader(new InputStreamReader(process1.getInputStream()));
        
        OutputStream outputStream = process2.getOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        String line;
        while ((line = br1.readLine()) != null){
                  printStream.println(line);
        }
        printStream.close();
        BufferedReader br2 = new BufferedReader(new InputStreamReader(process2.getInputStream()));
        String line2;
        while((line2=br2.readLine())!=null){
                   System.out.println(line2);
         
        }
       
       }
}
    

