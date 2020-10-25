package excepcion2;
public class Excepcion {
    
    String s1 = "";
    String s2 = "";
    public void cargarNumeros () {
    s1 = "12";
    s2 = "0";
    }
    public void calculo () throws Exception {
        int n, d, c;
    n = Integer.parseInt(s1);
    d = Integer.parseInt(s2);
    c = n/d;
    System.out.println(String.valueOf(c));
    }
}
