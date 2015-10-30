package convertirmayusculas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

/**
 *
 * @author Juan Mollá Fernández <jmollaf at gmail.com>
 */

public class ConvertirMayusculas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
           
        Scanner linea=new Scanner(System.in);
        System.out.print(linea.nextLine().toUpperCase());
        
    }
    
}
/*Pistas ejercicio acabar con el fin
Ejemplo de leer el stdin
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
while ((in.readLine()).compareTo("fin") !=0){}*/
