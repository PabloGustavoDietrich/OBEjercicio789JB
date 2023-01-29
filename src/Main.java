import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.*/

        HashMap<Integer, String> hashMap = new HashMap<>();
        Scanner numeroDeAlumnos = new Scanner(System.in);
        System.out.println("cuantos alumnos va a ingresar?");
        int cantidadAlumnos = numeroDeAlumnos.nextInt();
        for (int i = 0; i < cantidadAlumnos;i++) {//ciclo para ingresar una x cantidad de alumnos
            int dni = 0;
            String nombreCompleto = "";
            boolean correcto = false;
            do {
                try {
                    Scanner scanner = new Scanner(System.in);//leeremos datos de un alumno
                    System.out.println("Ingresa tu DNI: ");
                    dni = scanner.nextInt();
                    System.out.println("Dime tu nombre: ");
                    nombreCompleto = scanner.next();
                    correcto = true;
                } catch (Exception e) {
                    System.out.println("Ingresa tus datos otra vez, paso esto: " + e.getMessage());
                }
            } while (!correcto);//verificamos los datos del alumno a ingresar
            hashMap.put(dni, nombreCompleto);

        }
        ArrayList<String> arrayDeNombres = new ArrayList<>(hashMap.values());//nos quedaremos solo con los nombres de alumnos ingresados
        System.out.println(arrayDeNombres);
    }
}