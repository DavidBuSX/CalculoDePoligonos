package Ejercicio9;

import java.util.ArrayList;
import java.util.Scanner;


public class Principal {
    //arreglo dinamico
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String args[]){
        //llenar un poligono
        llenarPoligono();
        
        //mostrar los datos y el area de cada poligono
        mostrarResultados();
    }
    public static void llenarPoligono(){
        char respuesta;
        int opcion;
        
        do {            
            do {                
                System.out.println("Digite el poligono que desea");
                System.out.println("1 triangulo");
                System.out.println("2 rectangulo");
                System.out.println("Que opcion quiere:");
            opcion = teclado.nextInt();
            } while (opcion<1 || opcion>2);
            
            switch (opcion){
                case 1:llenarTriangulo();//Lllenar un triangulo
                    break;
                case 2:llenarRectangulo();//Llenar un rectangulo
                    break;   
            } 
            
            System.out.println("\nDesea introducir otro poligono? (s/n): ");
            respuesta = teclado.next().charAt(0);
            System.out.println("");
        } while (respuesta == 's'||respuesta == 'S');
        
    
    }
    
    public static void llenarTriangulo(){
        double lado1, lado2, lado3;
        System.out.println("\nDigite el lado 1 del triangulo");
        lado1 = teclado.nextDouble();
        System.out.println("\nDigite el lado 2 del triangulo");
        lado2 = teclado.nextDouble();
        System.out.println("\nDigite el lado 3 del triangulo");
        lado3 = teclado.nextDouble();
        
        Triangulo mensajero2 = new Triangulo(lado1, lado2, lado3);
        
        //Guardamos un triangulo dentro de nuestro arreglo de poligonos
        poligono.add(mensajero2);
    }
    
    public static void llenarRectangulo(){
        double lado1, lado2;
        System.out.println("|Digite el lado 1 del rectangulo: ");
        lado1 = teclado.nextDouble();
        System.out.println("|Digite el lado 2 del rectangulo: ");
        lado2 = teclado.nextDouble();
        
        Rectangulo mensajero3 = new Rectangulo(lado1, lado2);
        
        //Guardamos un rectangulo dentro de nuestro arreglo polignos
        poligono.add(mensajero3);
    
    }
    
    public static void mostrarResultados(){
    
        for(Poligono poli: poligono){
            System.out.println(poli.toString());
            System.out.println("Area= "+poli.area());
            System.out.println("");
                    
        
        }
    }
}
