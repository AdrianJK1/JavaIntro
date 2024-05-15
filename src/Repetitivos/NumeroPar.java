package Repetitivos;

import java.util.Scanner;

public class NumeroPar {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese numero de la tabla");
        int multiplicar = in.nextInt();

        for (int i = 1; i < 999999999 ; i++) {
            int resultado  = multiplicar * i;

            System.out.println(resultado);

        }

        }

    }

