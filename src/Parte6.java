import java.util.ArrayList;
import java.util.LinkedList;

public class Parte6 {
    public static void main(String[] args) {
       /* Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.*/
        ArrayList<Integer> enteros1 = new ArrayList<>();
        enteros1.add(1);
        enteros1.add(2);
        enteros1.add(3);
        enteros1.add(4);
        LinkedList<Integer> enteros2 = new LinkedList<>(enteros1);
        for(Integer entero: enteros1){
            System.out.println(entero);
        }
        for(Integer entero: enteros2){
            System.out.println(entero);
        }

    }
}
