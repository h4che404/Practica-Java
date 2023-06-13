package ArchivosManipulados;

import java.io.*;
import java.util.Arrays;

public class Archivostxt {

    public static void main(String[] args) {
        String archivo = "C:/Users/elias/Desktop/Archivo2.txt.txt";
        try{
            //InputStream fichero = new FileInputStream("src/archivosjava/archivo.txt"); // Ruta completa del archivo en el escritorio
            InputStream fichero2 = new FileInputStream(archivo); // Ruta completa del archivo en el escritorio
            try{
                byte [] datos = fichero2.readAllBytes();
                for (byte dato: datos) {
                    System.out.print((char)dato);
                }
            }catch (IOException e){
                System.out.println(e.getMessage());
            }
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }


        }
    }



