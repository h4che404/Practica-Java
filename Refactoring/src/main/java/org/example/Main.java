package org.example;


import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        Menu();

    }

    public static void Menu(){
        System.out.println("Menu Con numeros");
        System.out.println("1- (Dar vuelta la palabra) \n2- ARRAY dimensional " +
                "\n3- Array bi-dimensional \n4- Vector \n5- LinkedList " +
                "\n6- ArrayList de enteros \n7- Divide por ceros");
        Scanner leer = new Scanner(System.in);
        int menu = leer.nextInt();
        switch (menu){
            case 1 -> {
                System.out.println("Ingresa una palabra:");
                String palabra = leer.next();
                String resultadoDavueltalapalabra = Davueltalaplabra(palabra);
                System.out.println(resultadoDavueltalapalabra);
            }
            case 2 ->{
                ListaUnidimensional();
            }
            case 3 ->{
                ListaBidimensional();
            }
            case 4 ->{
                ListaDeVectores();
            }
            case 5 ->{
                ListaVinculada();
            }
            case 6 ->{
                ListaDeEnteros();
            }
            case 7 ->{
                DividePorCero();
            }

        }
    }

    @org.jetbrains.annotations.NotNull
    public static String Davueltalaplabra(String a) {
        StringBuilder buffer = new StringBuilder(a);
        return buffer.reverse().toString();
    }

    public static void ListaUnidimensional(){
        EjerciciosArray lists = new EjerciciosArray();
        lists.ingresarDatosunidimensionales();
        lists.MostrarListaunidimensional();
    }

    public static void ListaBidimensional(){
        EjerciciosArray lists = new EjerciciosArray();
        lists.ingresarDatosbidimensionales();
        lists.MostrarDatosBidimensionales();
    }

    public static void ListaDeVectores(){
        EjerciciosArray lists = new EjerciciosArray();
        lists.ingresarDatosVectores();
        lists.MostrarDatosVectores();
    }

    public static void ListaVinculada(){
        EjerciciosArray lists = new EjerciciosArray();
        lists.CopiarDatosLinkedlist();
    }

    public static void ListaDeEnteros(){
        EjerciciosArray lists = new EjerciciosArray();
        lists.IngresoDeDatosArrayList();
        lists.EliminarDatosDelArrayList();
    }

    public static void DividePorCero() {
        try {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese un numero");
            int numero = leer.nextInt();
            int resultado = (numero / 0);
            System.out.println(resultado);
        }catch (ArithmeticException e){
            System.out.println(e.getClass());
        }finally {
            System.out.println("Demo de codigo");
        }
    }

    public static void ManejoDeArchivos(){

    }

}