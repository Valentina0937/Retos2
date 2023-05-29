package Retos2;

import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        //Declaramos variables
        int n;
        double calif, suma=0;
        //Instanciamos Scanner
        Scanner leer = new Scanner(System.in);
        //Mostramos mensaje de bienvenida
        System.out.println("Bienvenid@ al programa para calcular el promedio de las notas");
        //Solicitamos la cantidad de notas
        System.out.println("Ingrese la cantidad de notas que desea ingresar");
        n=leer.nextInt();
        //Declaramos y creamos el arreglo nota
        int [] nota=new int[n];
        //Pedimos las calificaciones y se suman
        for(int i=0;i<nota.length;i++){
            System.out.println("Ingrese la calificación # "+(i+1)); 
            calif=leer.nextDouble();
            suma=suma+calif;
        }
        //Declaramos variable y realizamos operaciones
            double promedio=suma/nota.length;
            System.out.println("Su nota total es "+suma);
            System.out.println("Su promedio es: "+promedio);
        //Realizamos condicionales
        if(promedio<3){
            System.out.println("Reprobaste :(");
        }
        else if((promedio>=3)&&(promedio<=4.0)){
            System.out.println("Pasaste raspando ._.");
        }
        else if(promedio>4.0){
            System.out.println("Aprobaste con buenos reultados :D");
        }           
        //Limpiamos bufer 
        leer.close();
    
    }
    
}
