package Retos2;

import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
        String letra1,letra2;
        int n, intento;
        Scanner leer =new Scanner(System.in);
        System.out.println("Ingrese la cantidad de letras");
        n=leer.nextInt();
        leer.nextLine();
        String[]canti=new String[n];
        String[]letras=new String[n];

        for(int i=0; i<canti.length;i++){
            System.out.println("Ingrese letra "+(i+1));
            letra1=leer.nextLine();
            letras[i]=letra1;
        }
        System.out.println("Ingrese el número de intentos");
        intento=leer.nextInt();
        
        System.out.println("Intenta adivinar la palabra");
        for(int i=0; i<intento;i++){
            System.out.println("Ingrese letra "+(i+1));
            letra2=leer.nextLine();
            letras[i]=letra2;
            if(letra2.equals(letra2)){
                System.out.println("La letra si esta");
            }
            else{
                System.out.println("La letra no esta");
            }
        }
        
        leer.close();
    }
}
