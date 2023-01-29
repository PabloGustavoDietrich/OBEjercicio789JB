import java.util.ArrayList;

public class Parte7 {
    public static void main(String[] args) {
        /*Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.*/
        ArrayList<Integer> enteros = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            enteros.add(i);
        }
        for(int i = 0; i < enteros.size();i++){
           if(0 == enteros.get(i) % 2){
               enteros.remove(enteros.get(i));
           }
        }
        for(Integer entero:enteros){
            System.out.println(entero);
        }

    }
}
