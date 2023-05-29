package Retos2;

import java.util.Scanner;

public class Reto4 {
    public static void main(String[] args) {
    //Declaramos matrices
    String [][] nombre = new String [4][4];
    double [][] precio=new double[4][4];
    //Instanciamos la clase Scanner
        Scanner leer= new Scanner(System.in);
        for(int filas=0; filas<4; filas++){
            for(int columnas=0; columnas<4; columnas++){
                System.out.println("Ingrese el nombre del producto en la posicion ["+filas+"]["+columnas+"]");
                nombre[filas] [columnas]=leer.nextLine();
                
                System.out.println("Digite el precio del producto en la posicicón ["+filas+"]["+columnas+"] ");
                precio[filas][columnas]=leer.nextDouble();
                leer.nextLine();
                
            }
        }
        for(int filas=0; filas<4; filas++){
            for(int columnas=0; columnas<4; columnas++){
                System.out.println("Código "+filas+" "+columnas+" Producto "+nombre[filas][columnas]+ " Precio $"+precio[filas][columnas]);
            }
        }
        
    leer.close();
    }
}
