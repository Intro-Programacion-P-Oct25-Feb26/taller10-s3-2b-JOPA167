/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Problema02 {

    public static void main(String[] args) {
        
        
        int menores = 0;
        int mayores = 0;
        String reporte = "";
        int[][] edades = {
            {5, 12, 35, 40},
            {8, 15, 33, 38},
            {6, 10, 30, 36}
        };
        
        int[] edad = new int[3];
        
        for(int i = 0; i < edades.length; i++) {
            menores = 0;
            mayores = 0;
            for (int c = 0 ; c < edades[i].length;c++){
                if(edades[i][c]>=18){
                    mayores = mayores + 1;   
                }
            }
            for(int filaMayores = 0;filaMayores < edad.length;filaMayores++){
                edad[filaMayores] = mayores;
                
            }
        }
        
        for(int b = 0; b< edades.length; b++){
            reporte = String.format("%sLa familia %d tiene %d mayores de edad\n",
                    reporte,
                    b+1,
                    edad[b]);
        }
        System.out.printf("%s",reporte);
    }
}
