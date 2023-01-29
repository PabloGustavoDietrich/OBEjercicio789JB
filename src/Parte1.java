public class Parte1 {
    public static void main(String[] args) {
        /*Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
         */
        String saludo = "hola mundo";
        System.out.println(saludo.charAt(saludo.length()-1));//pruebo imprimir la ultima letra del String
        String saludoInverso = "";
        for (int i = saludo.length()-1 ; i >= 0 ; i--) {
            char ultimoChar = saludo.charAt(i);
            saludoInverso = saludoInverso.concat(String.valueOf(ultimoChar));
        }
        System.out.println(saludoInverso);
    }
}
