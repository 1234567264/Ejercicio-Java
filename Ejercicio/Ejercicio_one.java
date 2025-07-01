//package CLASE_THREE.Ejercicios;


import java.util.Scanner;

public class Ejercicio_one {
    public static void main(String[] args){

       Scanner input = new Scanner(System.in);
       
       
        
          while (true){
              System.out.println("""
                 \nTienes tres opciones: (Ingresa sus respectivos números)
                 1. Calculadora
                 2. Hackear la nasa 😎
                 3. Salir
                 """);

              System.out.println("Ingrese opción 🤓 : ");
              String opcion_0 = input.nextLine().trim().toLowerCase();
            
              if(opcion_0.equals("1")){
                System.out.println("Haz abierto la calculadora 🤓");
                System.out.println("Ingrese el primer número: ");
                Double num_1 = Double.parseDouble(input.nextLine());
                System.out.println("Ingrese el segundo número: ");
                Double num_2 = Double.parseDouble(input.nextLine());

                System.out.println("""
                        \nQue deseas: (Ingresa sus respectivos números)
                        1. Sumar
                        2. Restar
                        3. Multiplicar
                        4. Dividir
                        5. Potencia
                        """);
                 System.out.println("Ingrese opción 🤓 : ");
                 Byte opcion_1 = Byte.parseByte(input.nextLine());
                   if(opcion_1 == 1){
                    System.out.println("🤓 La suma de " + num_1 + " y " + num_2 + " es: " + (num_1 + num_2));

                   }
                   else if(opcion_1 == 2){
                    
                    System.out.println("🤓 La resta de " + num_1 + " y " + num_2 + " es: " + (num_1 - num_2));
                   }
                  else if(opcion_1 == 3){
                    System.out.println("🤓 El producto de " + num_1 + " y " + num_2 + " es: " + (num_1 * num_2));

                  }
                  else if(opcion_1 == 4){
                    System.out.println("🤓 La división de " + num_1 + " entre " + num_2 + " es: " + (num_1 / num_2));

                  }
                  else if(opcion_1 == 5 ){
                    Double resultado = Math.pow(num_1, num_2);
                    System.out.println("🤓 La potencia de " + num_1 + " elevado a la " + num_2 + " es: " + (resultado));
                  }
              } 
              else if(opcion_0.equals("2")){
                System.out.println("""
                      \n¡Estás hackeando la NASA! 😎
                        _________________
                        |       *        | 
                        |      * *       |
                        |     * * *      |
                        |    * * * *     |
                        |   * * * * *    |
                        |     * * *      |
                        |     * * *      |
                        |     * * *      |
                        |________________|

                      ¡Eres un HackerMan 😎🤯🥵💀👾!
                        """);
                        

               }
               else if(opcion_0.equals("3")){
                System.out.println("¡Hasta luego! 😊");
                break;

               }
               else {
                continue;
               }



      
            }

        input.close();

           
    }

}
