import generic.Utils;

public class Calculadora {
    public static void main(String[] args) {
        //Declaramos la variables de entradas
        int operacion_seleccionada = 0;
        double numero1 = 0, numero2 = 0;  
        //Declaramos la variable de salida
        double resultado = 0;

        //Limpiamos la consola
        Utils.limpiarConsola();

        //Establecemos el color azul a las letras
        Utils.establecerColorAzul();

        //Mostramos en la pantalla las opciones
        System.out.println("Ingrese un número para elegir una operación \n");

        System.out.printf("%-2d) %-15s \n",1,"Sumar");
        System.out.printf("%-2d) %-15s \n",2,"Restar");
        System.out.printf("%-2d) %-15s \n",3,"Multiplicar");
        System.out.printf("%-2d) %-15s \n",4,"Dividir");

        operacion_seleccionada = Utils.leerEntero("Introduce una opción \n");

        if(operacion_seleccionada == 1){
            //Establecemos el color amarillo a las letras
            Utils.establecerColorAmarillo();
            //Preguntamos el primer numero y lo asignamos a numero1
            numero1 = Utils.leerDoble("Introduce el primer número \n");
            //Preguntamos el primer numero y lo asignamos a numero2
            numero2 = Utils.leerDoble("Introduce el segundo número \n");
            //Asignamos el resultado de la suma
            resultado = numero1 + numero2;
        }else if(operacion_seleccionada == 2){
            //Establecemos el color amarillo a las letras
            Utils.establecerColorAmarillo();
            //Preguntamos el primer numero y lo asignamos a numero1
            numero1 = Utils.leerDoble("Introduce el primer número \n");
            //Preguntamos el primer numero y lo asignamos a numero2
            numero2 = Utils.leerDoble("Introduce el segundo número \n");
            //Asignamos el resultado de la resta
            resultado = numero1 - numero2;
        }else if(operacion_seleccionada == 3){
            //Establecemos el color amarillo a las letras
            Utils.establecerColorAmarillo();
            //Preguntamos el primer numero y lo asignamos a numero1
            numero1 = Utils.leerDoble("Introduce el primer número \n");
            //Preguntamos el primer numero y lo asignamos a numero2
            numero2 = Utils.leerDoble("Introduce el segundo número \n");
            //Asignamos el resultado de la multiplicacion
            resultado = numero1 * numero2;
        }else if(operacion_seleccionada == 4){
            //Establecemos el color amarillo a las letras
            Utils.establecerColorAmarillo();
            //Preguntamos el primer numero y lo asignamos a numero1
            numero1 = Utils.leerDoble("Introduce el primer número \n");
            //Preguntamos el primer numero y lo asignamos a numero2
            numero2 = Utils.leerDoble("Introduce el segundo número \n");
            //Asignamos el resultado de la division
            resultado = numero1 / numero2;
        }else{
            //Establecemos el color rojo a las letras
            Utils.establecerColorRojo();
            //Mostramos mensaje de error
            System.out.println("Porfavor ingrese un número válido, los posibles son 1, 2, 3, 4");
            //Retornamos para no mostrar resultados
            return;
        }

        //Establecemos el color verde a las letras
        Utils.establecerColorVerde();
        //Mostramos el resultado
        System.out.println(resultado);
    }
}