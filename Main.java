import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.StandardOpenOption;

public class Main {
    public static void main (String[] args) throws IOException{
        String nombreArchivo = "C:\\Users\\wuthr\\Desktop\\ARGENTINA-PROGRAMA-JAVA\\AP-4.0-2DA\\Libro_prueba.csv";

        System.out.println(saludoPersonalizadoPara("Fede" , "Wuthrich" ));
        int[] numeros = {1,5,7,8,10,11};
        int resultado = sumatoria(numeros);
        int promedio = resultado / numeros.length;

        System.out.println("El promedio es: " + promedio);

        lecturaArchivo(nombreArchivo);
        escrituraArchivo(nombreArchivo);
    }

    private static void lecturaArchivo(String nombreArchivo) throws IOException{
        for (String unaLinea: Files.readAllLines(Paths.get(nombreArchivo))){
            System.out.println(unaLinea);
        }
    }

    private static void escrituraArchivo (String nombreArchivo) throws IOException {
        String writeWord = System.lineSeparator() + "Hola mundo";
        Files.writeString(Paths.get(nombreArchivo), writeWord, StandardOpenOption.APPEND); //StandardOpenOption. APPEND agrega al final de lo que haya en el archivo
    }

    private static String saludoPersonalizadoPara(String nombre, String apellido){
        return "Hola " + nombre + " " + apellido;
    }
    private static int sumatoria(int[] numeros){
        int resultado = 0;
        for (int i = 0; i < numeros.length; i++){
            resultado += numeros[i];
        }
        return resultado;
    }
}
