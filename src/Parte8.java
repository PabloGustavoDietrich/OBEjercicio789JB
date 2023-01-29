public class Parte8 {
    public static void main(String[] args) {
        /* Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".*/
        try {
           int resultadoDivision = divisionPorCero(5, 0);
            System.out.println(resultadoDivision);
        }catch (ArithmeticException e){
           // System.out.println(e.getMessage());
            System.out.println("Esto no puede hacerse");
        }finally {
            System.out.println("Demo de código");
        }
    }
    public static int divisionPorCero(int a, int b) {
        return a/b;
    }
}
