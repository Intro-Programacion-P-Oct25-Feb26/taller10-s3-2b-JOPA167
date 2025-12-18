/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author UTPL
 */
public class Problema11 {
   

    public static void main(String[] args) {

        boolean[][] asistencia = {
            {true, true, false, true, true},
            {true, false, false, true, false},
            {true, true, true, true, true},
            {false, true, true, false, true}
        };

        String[] estudiantes = {"Ana", "Luis", "Carlos", "María"};
        int[] numAsistencia = new int [4];
        int asistenciaTotal=0;
        String completa;
        String reporte = "";

        for (int i = 0; i < asistencia.length; i++) {
            asistenciaTotal = 0;
            for (int c = 0 ; c < asistencia[i].length;c++){
            if (asistencia[i][c]){
                asistenciaTotal = asistenciaTotal +1;
            }
            numAsistencia[i] = asistenciaTotal;
        }
        }
        
        
        for (int i = 0; i < asistencia.length; i++){
            if (numAsistencia[i]==5){
                completa = "COMPLETA";
                
            }else{
                completa = " INCOMPLETA";
            }
            reporte = String.format ("%sEl estudiante %s asistió %d días, "
                    + "su asistencia es: %s\n",
                    reporte,
                    estudiantes[i],
                    numAsistencia[i],
                    completa);
            
        }
        System.out.printf("%s",reporte);
    }

}

