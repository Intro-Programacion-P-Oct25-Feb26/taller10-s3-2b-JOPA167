/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete7;

import java.util.Scanner;

/**
 *
 * @author Alexito
 */
public class Problema07 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int[][] x = new int [3][3];
        int[][] a = new int [3][3];
        int[][] b = new int [3][3];
        String estado="";
        boolean iguales = true;
        String reporteX = "";
        String reporteA = "";
        String reporteB = "";
        String reporteFinal = "";
        
        
        
        for (int filaX = 0; filaX < x.length; filaX++) {
            for (int colX = 0; colX < x[filaX].length; colX++) {
                System.out.printf("Ingrese el valor para la posicion (%d-%d) de "
                        + "la matriz x: ",
                        filaX,
                        colX); 
                x[filaX][colX] = entrada.nextInt();
                reporteX = String.format("%s%d\t",reporteX,x[filaX][colX]);
            }
            reporteX = String.format("%s\n",reporteX);
        }
        
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {

                a[i][j]= (x[i][j] + 1) *(x[i][j] + 1);
                reporteA = String.format("%s%d\t",reporteA,a[i][j]);
            }
            reporteA = String.format("%s\n",reporteA);
        }
        
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {

                b[i][j]= (x[i][j] * x[i][j]) + (2 * x[i][j]) + 1;
                reporteB = String.format("%s%d\t",reporteB,b[i][j]);
            }
            reporteB = String.format("%s\n",reporteB);
        }
        
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != b[i][j]) {
                    iguales = false;
                    estado = String.format("La identidad algebraica NO se cumple "
                            + "matriz A ≠ matriz B");
                    break;
                }else{
                    estado = String.format("La identidad algebraica se cumple "
                            + "matriz A = matriz B");
                }
            }
        }
        
        reporteFinal = String.format("--MATRIZ X--\n%s\n--MATRIZ A--\n%s\n--MATRIZ B--\n%s\n%s",
                reporteX,
                reporteA,
                reporteB,
                estado);
        System.out.printf("%s\n",reporteFinal);
    }
}
