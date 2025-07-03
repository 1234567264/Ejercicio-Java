

import java.text.DecimalFormat;
import java.util.Scanner;


public class Refactorizacion_Ejercicio_Tres {

    public static void main(String[] args){
            
        Scanner input = new Scanner(System.in);
         
       
          while (true){
            mostrarOpciones();

              
                  String opcion_0 = input.nextLine().trim().toLowerCase();
            
                  if(opcion_0.equals("1")){

                    calculadora();
                    String opcion_1 = input.nextLine().trim();
 
                   if(opcion_1.equals("1")){
                    
                    Double[] Listado = lista(input);
                    System.out.println( suma(Listado));
                   }
                   else if(opcion_1.equals("2")){
                    Double[] Listado = lista(input);
                    System.out.println( resta(Listado));
                   }
                  else if(opcion_1.equals("3")){
                    Double[] Listado = lista(input);
                    System.out.println( producto(Listado));
                  }
                  else if(opcion_1.equals("4")){
                    System.out.println( divison(input));
                  }
                  else if(opcion_1.equals("5") ){
                   System.out.println( potencia(input));
                  }
                  else if(opcion_1.equals("6")){
                    System.out.println( raiz(input));
                  }
                  else{
                    System.out.println("Opción no válida");
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
                            System.out.println("🤖 🔧 No haz seleccionado ninguna opción, ¡vuelve a intentarlo! 🤖 🔧");
                            continue;
                         }
                    }

        input.close();
        }

            public static void mostrarOpciones(){

             System.out.println("""
                 \nTienes tres opciones: (Ingresa sus respectivos números)
                 1. Calculadora
                 2. Hackear la nasa 😎
                 3. Salir
                 """);
                 System.out.println("Ingrese opción 🤓 : ");

            }

            public static void calculadora(){
                System.out.println("Haz abierto la calculadora 🤓");
                System.out.println("""
                        \nQue deseas: (Ingresa sus respectivos números)
                        1. Sumar 
                        2. Restar
                        3. Multiplicar
                        4. Dividir
                        5. Potencia
                        6. Raíz
                        """);
                System.out.println("Ingrese opción 🤓 : ");
            }



            public static String potencia(Scanner input){
            

            System.out.println("Esta ejecución solo puede ser realizada con números enteros");

            System.out.println("Ingrese el primer número: (base) ");
            Long num_1 = Long.parseLong(input.nextLine());
            System.out.println("Ingrese el segundo número: (exponente) ");
            Long num_2 = Long.parseLong(input.nextLine());

            Long resultado = ( long) Math.pow(num_1,num_2);
            
           String mensaje = ("🤓 La potencia de " + num_1 + " elevado a la " + num_2 + " es: " + (resultado));
           return mensaje;
            
        }

           public static String raiz(Scanner input){

            System.out.println("Esta ejecución solo puede ser realizada con dos números");

            DecimalFormat df = new DecimalFormat("#.##");
            System.out.println("Ingrese el primer número: (radicando)");
            Long num_1 = Long.parseLong(input.nextLine());
            System.out.println("Ingrese el segundo número: (índice) ");
            Long num_2 = Long.parseLong(input.nextLine());

            Double resultado =  Math.pow(num_1,1.0/num_2); // es 1.0 por qué java no admite divisiones de enteros
            // Recuerda que uno debe ser Double o Float, de esa forma todo lo transforma a decimal.
            
            
           String mensaje = ("🤓 La raíz " + num_2 + " de " + num_1 + " es: " + df.format(resultado));
           return mensaje;

            }


            public static String divison(Scanner input){

             System.out.println("Esta ejecución solo puede ser realizada con dos números");

                DecimalFormat df = new DecimalFormat("#.##");
                System.out.println("Ingrese el primer número: (dividendo)");
                Double num_1 = Double.parseDouble(input.nextLine());
                System.out.println("Ingrese el segundo número: (divisor)");
                Double num_2 = Double.parseDouble(input.nextLine());

                String mensaje = ("🤓 La división de " + num_1 + " entre " + num_2 + " es: " + df.format(num_1 / num_2));
                return mensaje ;
            }



            public static Double[] lista( Scanner input){ 

                System.out.println("Cuantos elementos deseas para realizar esta acción? ");
                String m = (input.nextLine());
                int n = 0;
                if(m.equals("")){
                    System.out.println("Debes de ingresar elementos.");
                }
                else if(Integer.parseInt(m) <= 1){
                    System.out.println("Debes de ingresar al menos dos elemento");
                }
                else{
                    n = Integer.parseInt(m);
                }

                Double [] myList = new Double[n];
                int i = 0;
                while(i < n){
                    System.out.println("Ingrese el número " + (i+1) + ": ");
                    
                    myList[i] = Double.parseDouble(input.nextLine());
                    i++;
                }
                return myList;
            }



            public static String suma(Double[] myList){

                if(myList.length == 0){
                    System.out.println("No hay elementos para realizar la suma");
                }

                DecimalFormat df = new DecimalFormat("#.##");
                Double suma = 0.0;
                for(Double num : myList){
                    suma += num;
                }
                String resultado = df.format(suma); 
                Double resultado_1 = Double.parseDouble(resultado);
                String mensaje = "El resultado de la suma es: " + resultado_1;
                return mensaje;
            }


            public static String resta(Double[] myList){
                if(myList.length == 0){
                    System.out.println("No hay elementos para realizar la resta");
                }
                DecimalFormat df = new DecimalFormat("#.##");
                Double resta = myList[0];
                for(int i = 1 ; i< myList.length ; i ++){
                    resta -= myList[i];
                }
                String resultado = df.format(resta); 
                Double resultado_1 = Double.parseDouble(resultado);
                String mensaje = "El resultado de la resta es: " + resultado_1;
                return mensaje; 
            }


            public static String producto(Double[] myList){
                if(myList.length == 0){
                    System.out.println("No hay elementos para realizar la multiplicación");
                }

                DecimalFormat df = new DecimalFormat("#.##");
                Double producto =  myList[0];
                for(int i = 1 ; i < myList.length ; i ++){
                    producto *= myList[i];
                }
                String resultado = df.format(producto); 
                Double resultado_1 = Double.parseDouble(resultado);
                String mensaje = "El resultado del producto es: " + resultado_1;
                return mensaje;
            }




    }
