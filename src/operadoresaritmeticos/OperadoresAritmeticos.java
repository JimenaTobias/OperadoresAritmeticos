package operadoresaritmeticos;

import java.util.Scanner;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float num1, num2, suma, resta, mult, div, modulo;

        System.out.println("Ingrese el valor de numero 1 y numero 2");
        num1 = entrada.nextFloat();
        num2 = entrada.nextFloat();

        suma = num1 + num2;
        resta = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;
        modulo = num1 % num2;

        System.out.println("La suma de los números ingresados es: " + suma);
        System.out.println("La resta de los números ingresados es: " + resta);
        System.out.println("La multiplicación de los números ingresados es: " + mult);
        System.out.println("La división de los números ingresados es: " + div);
        System.out.println("El módulo de los números ingresados es: " + modulo);

        //raíz cuadrada
        double raiz = Math.sqrt(9);
        System.out.println("La raíz cuadrada de un número es: " + raiz);

        //potencia o cuadrado
        double base = 4, exp = 3;
        double result = Math.pow(base, exp);
        System.out.println("El resultado de la potencia es: " + result);

        //redondear double
        double num = 3.1416;
        double resul = Math.round(num);
        System.out.println("El resultado es: " + resul);

        //redondear float
        float num3 = 4.56f;
        int resu = Math.round(num3);
        System.out.println("El resultado es: " + resu);
    }
}
