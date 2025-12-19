/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete8;

/**
 *
 * @author Alexito
 */
public class Problema8 {

    public static void main(String[] args) {
        // Creación de arreglo bidimensionales

        double[][] dato1 = {{1, 2, 3}, {6, 8, 9}};
        double[][] dato2 = {{10, 1, 2}, {10, 9, 1}};
        double [][] matrizF = new double[2][3];
        String reporte = "";
        // En función de los arreglos dados, genere
        // un arreglo que tenga los siguientes valores
        /*
            1   1   2
            6   8   1
         */

        for (int i = 0; i < dato1.length; i++) {
            for (int c = 0; c < dato1[i].length; c++) {
                if (dato1[i][c]< dato2[i][c]){
                    matrizF[i][c] = dato1[i][c];
                }else{
                    matrizF[i][c] = dato2[i][c];
                }
                reporte = String.format("%s%.0f\t",reporte,matrizF[i][c]);
            }
            reporte = String.format("%s\n",reporte);
        }
        System.out.printf("%s\n",reporte);
    }
}
