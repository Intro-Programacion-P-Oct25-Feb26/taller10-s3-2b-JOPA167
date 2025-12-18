/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {

    public static void main(String[] args) { 

        Scanner entrada = new Scanner(System.in);

        String reporteA = "";
        String reporteB = "";
        String reporteFinal;
        boolean primera= true;
        boolean segunda = false;

        int[][] a = new int[3][2];
        int[][] b = new int[3][2];
        System.out.println("MATRIZ A");
        for (int filaA = 0; filaA < a.length; filaA++) {
            for (int colA = 0; colA < a[filaA].length; colA++) {
                System.out.printf("Ingrese el valor para la posicion (%d-%d) de "
                        + "la matriz A: ",
                        filaA,
                        colA);
                a[filaA][colA] = entrada.nextInt();
                
            }
        }
    
        for (int i = 0; i< a.length;i++){
            for (int c = 0; c< a[i].length;c++){
                reporteA = String.format("%s%d\t",
                        reporteA,
                        a[i][c]);
            }
            reporteA = String.format("%s\n",reporteA);
        }
        
        System.out.println("-----------------------------");
        
        System.out.println("MATRIZ B");
        for (int filaB = 0; filaB < b.length; filaB++) {
            for (int colB = 0; colB < b[filaB].length; colB++) {
                System.out.printf("Ingrese el valor para la posicion (%d-%d) de "
                        + "la matriz B: ",
                        filaB,
                        colB);
                b[filaB][colB] = entrada.nextInt();
                
            }
        }
        
        for (int i = 0; i< b.length;i++){
            for (int c = 0; c< a[i].length;c++){
                reporteB = String.format("%s%d\t",
                        reporteB,
                        b[i][c]);
            }
            reporteB=String.format("%s\n",reporteB);
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {


                if (a[i][j] < b[i][j]) {
                    primera = false;
                } else {
                    if (a[i][j] > b [i][j]) {
                        segunda = true;
                    }

                }
            }

        }
        if (primera == true && segunda == true){
            reporteFinal = String.format("La matriz A es mayor que la matriz B");
        }else{
            reporteFinal = String.format("La matriz A no es mayor que la matriz B");
        }
        reporteFinal = String.format("\n--MATRIZ A--\n%s\n--MATRIZ B--\n%s\n\n%s", 
                reporteA,
                reporteB,
                reporteFinal);
        
        System.out.printf("%s\n",reporteFinal);
    }
}
