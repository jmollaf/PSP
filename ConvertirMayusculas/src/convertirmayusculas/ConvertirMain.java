package convertirmayusculas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.*;
import java.io.*;

/**
 * 
 * @author Juan Molla Fernandez <jmollaf at gmail.com>
 */
public class ConvertirMain {
    
         public static void main(String[]args) throws IOException{
            String[] comando={"java", "convertirmayusculas.ConvertirMayusculas"};
            ProcessBuilder pb1 = new ProcessBuilder(comando);
            System.out.println("Introduce la palabra");
            Process process1 =  pb1.start();
            String line="";
            BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
            
           
            while ((br1.readLine()).compareTo("fin") !=0){
                 Process process2 = pb1.start(); 
                
                   
                OutputStream outputStream = process2.getOutputStream();
                PrintStream ps = new PrintStream(outputStream);
                ps.println(line);
                ps.close();
                BufferedReader br2 = new BufferedReader(new InputStreamReader(process2.getInputStream()));
                String line2;
                if ((line2 = br2.readLine()) !=null){
                        System.out.println(line2);
                        br2.close();
                        
                        process1.destroy();  
                }
            
            }
            
        
         }

}

