/*En el programa principal se invoca a función, la cual en su cabecera aclara que puede lanzar
una excepción sin indicar cuál. En este caso, se hace referencia a la clase genérica de las
excepciones. Como te comentamos, al delegar la excepción lo hace al nivel superior, en este
caso, al método main, quien también debe indicar que es posible que lance la misma
excepción, pero la diferencia es que dentro de este método se definió un bloque try, que está
evaluando si la invocación del método estático Dividir lanza una excepción.
En este ejemplo, como el divisor es cero, la función Dividir lanza la excepción
ArithmeticExcepcion al tratar de dividir por cero. De esta manera, lo primero que hace el
compilador es verificar si en el lugar donde se lanzó la excepción posee un bloque try/catch
que la capture. Como la función no lo tiene definido, delega la excepción al nivel superior
(main), en el main busca si existe este bloque y captura la excepción produciendo como
salida por consola “División por cero”.*/
package excepcion3;
public class Main {
    public static void main(String[] args) throws Exception {
        int a, b, c;
        a = 10;
        b = 0;
        try {
        c = Excepcion.Dividir(a, b);
        System.out.println (String.valueOf(c));
        }
        catch (ArithmeticException e) {
        System.out.println("División por cero");
        }
    }
}
