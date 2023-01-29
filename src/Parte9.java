import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class Parte9 {
    public static void main(String[] args) {
        /*Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".*/
        try {
            InputStream in = new FileInputStream("prueba.json");
            PrintStream out = new PrintStream("prueba2.json");
            copiaArchivos(in,out);
        } catch (Exception e){
            System.out.println("tuvo una exception, no lo leyo por: " + e.getMessage());
        }

    }
    public static void copiaArchivos(InputStream fileIn, PrintStream fileOut)throws Exception{
        byte[] datos = fileIn.readAllBytes();
        fileIn.close();
        fileOut.write(datos);
        fileOut.close();
    }

}
