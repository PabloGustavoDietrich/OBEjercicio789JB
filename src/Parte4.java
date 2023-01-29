import java.util.Vector;

public class Parte4 {
    public static void main(String[] args) {
        /*Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.*/
        Vector<Integer> enteros = new Vector<>();
        enteros.add(1);
        enteros.add(2);
        enteros.add(3);
        enteros.add(4);
        enteros.add(5);
        enteros.remove(1);
        enteros.remove(2);
        System.out.println(enteros);
    }
}
