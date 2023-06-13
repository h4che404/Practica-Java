package org.example;

import java.util.*;

public class EjerciciosArray {

    //Creación de Arrays unidimensional y bidimensional.
    ArrayList<String> unidimensional = new ArrayList<>();
    int[][] biDimensional = new int[2][3];

    //Creation del vector
    Vector<String> lineaDeDatos = new Vector<>();

    //Arraylist entero pero eliminando los pares
    ArrayList<Integer> ListaDeEnteros = new ArrayList<>();

    /*
    --------------------------------------------------------------
     */

    //Array Unidimensional con sus respectivos metodos
    public void ingresarDatosunidimensionales() {
        String palabras = "hola";
        for (int i = 0; !Objects.equals(palabras, ""); i++){
            Scanner leer = new Scanner(System.in);
            System.out.println("ingresa letras:");
            String palabra = leer.nextLine();
            palabras = palabra;
            unidimensional.add(i, palabra);
            if (Objects.equals(palabras, "")){
                unidimensional.remove("");
            }
        }
    }
    public void MostrarListaunidimensional (){
        System.out.println(unidimensional);
    }

    //Array Bidimensional con sus respectivos metodos
    public void ingresarDatosbidimensionales(){
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                Scanner leer = new Scanner(System.in);
                System.out.println("ingrese un numero");
                int numeros = leer.nextInt();
                biDimensional[i][j] = numeros;
            }
        }
    }
    public void MostrarDatosBidimensionales(){
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                System.out.println("\n" +
                        " Posicion x= " + i + "\n" +
                        " Posicion y= " + j + "\n" + "\t" +
                        " Valor = " + biDimensional[i][j]);
            }
        }
    }

    //vectors
    public void ingresarDatosVectores(){
        String palabras = "hola";
        for (int i = 0; !Objects.equals(palabras, ""); i++){
            Scanner leer = new Scanner(System.in);
            System.out.println("ingresa algun nombre:");
            String letras = leer.nextLine();
            palabras = letras;
            lineaDeDatos.add(i, letras);
            if (Objects.equals(palabras, "")){
                lineaDeDatos.remove("");
            }
        }
    }
    public void MostrarDatosVectores(){
        System.out.println(lineaDeDatos);
    }


    //LinkedList
    public void CopiarDatosLinkedlist(){
        ingresarDatosunidimensionales();
        LinkedList<String> listaVinculada = new LinkedList<>(unidimensional);
        System.out.println("ArrayList");
        for (String lista : unidimensional){
            System.out.println(lista);

        }
        System.out.println("LinkedList");
        for (String lista : listaVinculada){
            System.out.println(lista);
        }

    }


    //ArrayList metods
    public void IngresoDeDatosArrayList(){
        for (int i = 0; i < 10; i++) {
            ListaDeEnteros.add(i, i);
        }
    }

    public void EliminarDatosDelArrayList(){
        for (int i = 0; i < ListaDeEnteros.size(); i++) {
            if (ListaDeEnteros.get(i) % 2 == 0){
                ListaDeEnteros.remove(i);
            }
        }
        System.out.println(ListaDeEnteros);
    }













}
