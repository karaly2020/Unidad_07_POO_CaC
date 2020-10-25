/*Habrás observado unas pequeñas diferencias, pero la delegación del error es igual. En el
código tenemos dos llamadas a funciones que son las que se ocupan de cargar los datos y
realizar los cálculos. En este caso particular, el lanzamiento de la excepción se produce en la
función que realiza el cálculo entre las dos cadenas de caracteres, ya que al convertir los
datos en la variable n queda el valor 12 y d es la variable de valor 0; al producir la división
arroja la excepción de división por cero.
En la cabecera del método cálculo se contempla que puede arrojar la excepción pero no la
captura. De este modo, si se produce una excepción, la delegará al nivel superior, siendo
éste el método main.
De la misma manera, el método main tiene en su cabecera la cláusula throws. Esto es
necesario, ya que en el caso supuesto de no darle solución a este error, el método main
debería delegarla a su nivel superior, pero el main no tiene nivel superior por lo que el error
termina produciéndose de todos modos.
Luego de esta explicación, te habrás dado cuenta de que este modelo no sirve para ser
utilizado en forma autónoma, ya que siempre de una forma u otra termina arrojando error.
Para ello es preferible utilizar el modelo de captura en forma independiente o combinar el
modelo de captura con el modelo de delegación de excepciones, previendo de esta manera
una forma más segura en el tratamiento de las excepciones.*/
package excepcion2;
public class Main {
    public static void main(String[] args) throws Exception {
        
        Excepcion Obj = new Excepcion();
        Obj.cargarNumeros();
        Obj.calculo();
    }
    
}
