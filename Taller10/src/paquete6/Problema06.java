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
        String reporteMaFi = "";
        String reporteFinal;
        int numero;

        int[][] a = new int[5][6];
      
        int[][] matrizFinal = new int[5][6];

        System.out.println("Ingrese el multiplicador: ");
        numero = entrada.nextInt();
        System.out.println("MATRIZ 1");
        for (int filaA = 0; filaA < a.length; filaA++) {
            for (int colA = 0; colA < a[filaA].length; colA++) {
                System.out.printf("Ingrese el valor para la posicion (%d-%d) de "
                        + "la matriz Inicial: ",
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

        for (int i = 0; i < matrizFinal.length; i++) {
            for (int j = 0; j < matrizFinal[i].length; j++) {

                matrizFinal[i][j]= a[i][j] * numero;

            }
        }
        
        for (int i = 0; i < matrizFinal.length; i++) {
            for (int c = 0; c < matrizFinal[i].length; c++) {
                reporteMaFi = String.format("%s%d\t",
                        reporteMaFi,
                        matrizFinal[i][c]);
            }
            reporteMaFi = String.format("%s\n", reporteMaFi);
        }

        reporteFinal = String.format("\n--MATRIZ INICIAL--\n%s\n--MATRIZ FINAL--\n%s",
                reporteA,reporteMaFi);
                

        System.out.printf("%s\n", reporteFinal);
    }
}
