package Retos2;

import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {
        //Declaramos variables
        int n, tiempo;
        String nombre;
        //Instanciamos clase Scanner
        Scanner leer=new Scanner(System.in);
        //Solicitamos datos
        System.out.println("Ingrese la cantidad de competidores");
        n=leer.nextInt();
        leer.nextLine();
        //Declaramos arreglos
        int []compe=new int[n];
        String[]nombres=new String[n];
        int [] tiempos=new int[n];
        //Solicitamos datos
        for(int i=0; i<compe.length;i++){
        System.out.println("Ingrese el nombre del nadador # "+(i+1));
        nombre=leer.nextLine();
        nombres[i]=nombre;
        
        System.out.println("Ingrese el tiempo");
        tiempo=leer.nextInt();
        leer.nextLine();
        tiempos[i]=tiempo;
        }
        //Mostramos datos
        for(int i=0; i<compe.length; i++){
            System.out.println("El nadadodor "+nombres[i]+" tiene el tiempo "+tiempos[i]);
            
        }

        int indiceGanador = 0;
        for (int i = 1; i < n; i++) {
            if (tiempos[i] < tiempos[indiceGanador]) {
                indiceGanador = i;
            }
        }
        System.out.println("El ganador es " + nombres[indiceGanador]);
       //Limpiamos el bufer
       leer.close();
    }
    
}
