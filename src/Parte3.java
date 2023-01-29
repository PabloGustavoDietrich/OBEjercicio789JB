public class Parte3 {
    public static void main(String[] args) {
       /* Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones. */
        int [][] enteros = {
                {1,2,3,4},
                {5,6,7,8}
        };
        for(int i = 0; i < enteros.length ;i++){
            for(int j = 0; j < enteros[i].length;j++){
                System.out.println("posición i = " + i + ", posición j = " + j + ", valor = " + enteros[i][j]);
            }
        }

    }
}
