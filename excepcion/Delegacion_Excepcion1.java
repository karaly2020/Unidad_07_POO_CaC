/* Delegación de la excepción: En el mismo código, indicamos que se puede producir una Excepción y cómo 
debe actuar el compilador para salvarla. De esta manera, el compilador delegará la excepción al nivel
superior (quien haya invocado el método) para que le pueda dar una solución. Si en ese nivel
no se puede solucionar, se enviará al nivel superior, repitiendo la delegación hasta que se
pueda tratar. En caso de llegar al nivel del main() y que este no la pueda solucionar, la
excepción se enviará a la JVM (máquina virtual de Java) quien emitirá el mensaje de error que
vimos antes.*/
package excepcion;
public class Delegacion_Excepcion1 {
    public static void main(String[] args)throws ArithmeticException {
        
        int n, d, c;
        n = 10;
        d = 0;
        c = n/d;
        System.out.println(c);
    }
    
}
