package Retos2;

import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) {
        //Declaramos matrices
        String[][] simbolo= new String[2][3];
        int[][] tablero = {{1, 2, 3}, {4, 5, 6}};
        //Declaramos variables
        int res1, res2;
        String resp;
        //Instanciamos la clase Scanner
        Scanner leer = new Scanner(System.in);
        //Asignamos los valores a cada posición de la matriz
        simbolo[0][0]=":)";
        simbolo[0][1]=":D";
        simbolo[0][2]=":D";
        simbolo[1][0]="<3";
        simbolo[1][1]=":)";
        simbolo[1][2]="<3";
        
        System.out.println("Bienvenido al juego de concentrese");
        // Recorrer filas
        for (int f = 0; f < tablero.length; f++) {
            // Recorrer columnas
            for (int c = 0; c < tablero[f].length; c++) {
                System.out.print(tablero[f][c] + " ");
            }
            System.out.println(); // Cambiar de línea después de cada fila
        } 
        
        do{
            System.out.println("Por favor elija una posición");
            res1=leer.nextInt();
            //Si el usuario elige :)
            if (res1==1 || res1==5){
                System.out.println("El simbolo que has elegiodo es "+simbolo[0][0]);
                System.out.println("Elija la siguiente posición");
                res2=leer.nextInt();
                if(res2==5 || res2==1){
                    System.out.println("¡Felicitaciones! Has encontrado la pareja");
                }
                else{
                    System.out.println("Lo siento esa no es la pareja");
                }
            }
            //Si el usuario elige :D
            else if (res1==2 || res1==3){
                System.out.println("El simbolo que has elegido es "+simbolo[0][1]);
                System.out.println("Elija la siguiente posición");
                res2=leer.nextInt();
                if(res2==2 || res2==3){
                    System.out.println("¡Felicitaciones! Has encontrado la pareja");
                }
                else{
                    System.out.println("Lo siento esa no es la pareja");
                }
            
            }
            //Si el usuario elige <3
            else if(res1==4 || res1==6){
                System.out.println("El simbolo que has elegido es "+simbolo[1][0]);
                System.out.println("Elija la siguiente posición");
                res2=leer.nextInt();
                if(res2==4 || res2==6){
                    System.out.println("¡Felicitaciones! Has encontrado la pareja");
                }
                else{
                    System.out.println("Lo siento esa no es la pareja");
                }
                
            }
           
            System.out.println("¿Deseas seguir jugando? (si/no)");
            resp = leer.next();
            leer.nextLine(); // Limpiar el búfer de entrada
        } while (resp.equalsIgnoreCase("si"));
        leer.close();
        
        
    }
    
}
