package Repetitivos;
import  java.util.Scanner;

public class PromedioFor {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int num, suma = 0;

        double promedio;

        for(int i = 1; i <=10; i++){
            System.out.println("Escriba un numero : " + i + " ");
            num = entrada.nextInt();
            suma += num;
        }

        promedio = suma / 10;
        System.out.println("\n" + "El promedio de los numeros ingresados es : " + promedio);
    }
}
