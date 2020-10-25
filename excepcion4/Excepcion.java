/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcion4;
public class Excepcion {
    public static void main(String[] args) {
        
    String s1 = "12";
    String s2 = "-20";
    String r;
    int n, d, c;
    try {
        n = Integer.parseInt(s1);
        d = Integer.parseInt(s2);
        c = rango(n,d);
        r = String.valueOf(c);
    }
    catch (NumberFormatException e) {
    r = "Son caracters, no numeros";
    }
    catch (ArithmeticException e) {
    r = "División por cero";
    }
    catch (ExcepcionIntervalo e) {
    r = e.getMessage();
    }
    System.out.println(r);
}
    static int rango (int num, int den) throws ExcepcionIntervalo {
        if ((num > 100) || (den < -5))
    throw new ExcepcionIntervalo ("Nros fuera de rango");
        else
        return (num/den);
    }
}
    

