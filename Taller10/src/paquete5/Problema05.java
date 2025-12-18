/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author reroes
 */
public class Problema05 {

    public static void main(String[] args) {
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}

        };
        String inicial;
        String reporte = "";

        for (int i = 0; i < estudiantes.length; i++) {
            for (int c = 0; c < estudiantes[i].length; c++) {
                inicial = estudiantes[i][c].substring(0,1);
                if (inicial.equals("S")||inicial.equals("T")||inicial.equals("P")){
                    reporte = String.format("%s%s ",reporte,estudiantes[i][c]);
                }
            }
        }
        System.out.printf("%s\n",reporte);

    }
}
