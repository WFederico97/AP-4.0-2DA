import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class Main {
    public static void main (String[] args){
        System.out.println(saludoPersonalizadoPara("Fede" , "Wuthrich" ));
        int[] numeros = {1,5,7,8,10,11};
        int resultado = sumatoria(numeros);
        int promedio = resultado / numeros.length;

        System.out.println("El promedio es: " + promedio);

        lecturaArchivo();
    }

    private static void lecturaArchivo(){
        String nombreArchivo = "C:\\Users\\User\\Desktop\\VATES\\tablas_base.txt\"";
//        Files.readAllLines(Paths.get(nombreArchivo));
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
