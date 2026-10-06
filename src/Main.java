import java.util.Scanner;

/**
 * Clase principal de la calculadora
 */

public class Main {

    public static void main(String[] args)
    {
        //Creacion del objeato scanner
        Scanner entrada = new Scanner(System.in);

        //Pedimos los datos de entrada al usuario
        System.out.println("Ingresa el primer numero: ");
        int num1 = entrada.nextInt();

        System.out.println("Ingresa el segundo numero: ");
        int num2 = entrada.nextInt();

         // Creamos un objeto de tipo Calculadora
         Calculadora calculadora = new Calculadora();

         // Realizamos la operacion correspondiente
        int suma = calculadora.suma(num1, num2);
        int resta = calculadora.resta(num1, num2);
        int multiplicacion = calculadora.multiplicacion(num1, num2);
        int  division = calculadora.division(num1, num2);

        //Impresion del resultado
        System.out.println("El resultado de la suma es: "+ suma);
        System.out.println("El resultado de la resta es: "+ resta);
        System.out.println("El resultado de la multiplicacion es: "+ multiplicacion);
        System.out.println("El resultado de la division es: "+ division);


    }
}
