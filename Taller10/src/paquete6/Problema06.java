/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema06 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String reporteA = "";
        
        String reporteFinal;
        int numero;
        

        int[][] a = new int[5][6];
        int[][] b = new int[5][6];
        System.out.println("MATRIZ 1");
        for (int filaA = 0; filaA < a.length; filaA++) {
            for (int colA = 0; colA < a[filaA].length; colA++) {
                System.out.printf("Ingrese el valor para la posicion (%d-%d) de "
                        + "la matriz 1: ",
                        filaA,
                        colA);
                a[filaA][colA] = entrada.nextInt();

            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int c = 0; c < a[i].length; c++) {
                reporteA = String.format("%s%d\t",
                        reporteA,
                        a[i][c]);
            }
            reporteA = String.format("%s\n", reporteA);
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {

                if (a[i][j] < b[i][j]) {
                    primera = false;
                

                }
            }

        }
        
        reporteFinal = String.format("\n--MATRIZ A--\n%s\n--MATRIZ B--\n%s",
                reporteA,
                reporteB);

        System.out.printf("%s\n", reporteFinal);
    }
}
