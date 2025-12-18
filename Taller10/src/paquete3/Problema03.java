/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Problema03 {

    public static void main(String[] args) {
        boolean[][] sensores = {
            {true, true, true, true, true, true},
            {true, false, true, false, true, false},
            {false, false, false, false, false, false},
            {true, true, false, true, true, false}
        };
        String[] zonas = {"Ana", "Luis", "Carlos", "María"};
        int[] funcional = new int[4];
        int zonasFuncionando = 0;
    
        String reporte = "";
        int fallos = 0;
        int sinFallos = 0;

        for (int i = 0; i < sensores.length; i++) {
            zonasFuncionando = 0;
            for (int c = 0; c < sensores[i].length; c++) {
                if (sensores[i][c]) {
                    zonasFuncionando = zonasFuncionando + 1;
                }
                funcional[i] = zonasFuncionando;
            }
        }

        for (int i = 0; i < sensores.length; i++) {
            if (funcional[i] == 6) {
                fallos = fallos + 1;
                
            } else {
                sinFallos = sinFallos + 1;
            }
            
            reporte = String.format("El total de zonas sin fallos es: %d\n"
                    + "El total de zonas con fallos es: %d",
                    fallos,
                    sinFallos);

        }
        System.out.printf("%s\n", reporte);
    }
}
