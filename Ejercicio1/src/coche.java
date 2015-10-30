/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author Juan Mollá Fernández <jmollaf at gmail.com>
 */
public class coche {
    

   int kilometraje;

   public coche(String marca){
      // El constructor tiene solo un parametro, en este caso marca
      System.out.println("La marca es : " + marca );
   }
   public void setKilometraje( int kilometraje ){
       this.kilometraje = kilometraje;
   }

   public int getKilometraje( ){
       System.out.println("El kilometraje es : " + kilometraje );
       return this.kilometraje;
   }
   public static void main(String []args){
      /* Creación */
      coche miCoche = new coche( "Ford" );

      /* Establecemos el kilometraje del carro */
      miCoche.setKilometraje( 2000 );

      /* Obtenemos el kilometraje del carro */
      miCoche.getKilometraje( );

      /* También podemos acceder a la variable de la clase */
      System.out.println("Valor variable : " + miCoche.kilometraje );
   }
}

