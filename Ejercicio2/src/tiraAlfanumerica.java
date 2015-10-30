import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author Juan Mollá Fernández <jmollaf at gmail.com>
 */
public class tiraAlfanumerica {
    
         /*Atributo formado por  un array de strings, en el primer string almacenamos 
           la cadena que introduzca el usuario, en el segundo los caracteres de texto y en el tercelo los numeros
          */
         private final String[] Caracteres=new String[3];
         
         public tiraAlfanumerica (){
              System.out.println("Introduce los caracteres");
              Scanner tec = new Scanner(System.in);
              Caracteres[0]=tec.next();
                    
         }
         public void solicitarCaracteres() {
                  
                  
         }  
         public static void main(String[] args){
         }

}
