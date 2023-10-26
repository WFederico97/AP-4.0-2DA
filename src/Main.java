package src;

import src.argprograma.dominio.personas.Persona;
import src.argprograma.dominio.personas.TipoDocumento;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.StandardOpenOption;

//*Funciones = Metodos en Java
//*Objetos = instancias de las clases
//*Clases = Representacion de entidades o conceptos con atributos y metodos.

public class Main {
    public static void main (String[] args) throws IOException{
        Persona unaPersona = new Persona(); //! Instanciacion de la clase Persona
        //* Accedemos a los setters que son publicos de la Clase Persona, para definir los valores de las variables privadas de la clase
        unaPersona.setApellido("Wuthrich");
        unaPersona.setNombre("Federico");
        unaPersona.setNumeroDocumento("M40520411");
        unaPersona.setTipoDocumento(TipoDocumento.DNI);

//        unaPersona.apellido = "Wuthrich";
//        unaPersona.nombre = "Federico";
//        unaPersona.numeroDocumento = "M40520411";
//        unaPersona.tipoDocumento = TipoDocumento.DNI;
        System.out.println(unaPersona.presentacion());

        Persona otraPersona = new Persona();
        otraPersona.setNombre("Jorge");
        otraPersona.setApellido("Rojas");

//        otraPersona.nombre = "Jorge";
//        otraPersona.apellido = "Rojas";

        System.out.println(otraPersona.presentacion());
//        String nombreArchivo = "C:\\Users\\wuthr\\Desktop\\ARGENTINA-PROGRAMA-JAVA\\AP-4.0-2DA\\Libro_prueba.csv";
//
//        System.out.println(saludoPersonalizadoPara("Fede" , "Wuthrich" ));
//        int[] numeros = {1,5,7,8,10,11};
//        int resultado = sumatoria(numeros);
//        int promedio = resultado / numeros.length;
//
//        System.out.println("El promedio es: " + promedio);
//
//        lecturaArchivo(nombreArchivo);
//        escrituraArchivo(nombreArchivo);
    }




}
