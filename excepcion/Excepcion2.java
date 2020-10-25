package excepcion;
public class Excepcion2 {
    public static void main(String[] args) {
        
        int i = 0;
        String [] palabras = {"hola","como","estas"};
        while (i < 4) {
            
        try {
            System.out.println (palabras[i]);
            i++;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println ("Fuera de Rango");
        }
        finally {
            System.out.println ("finally");
        }
        }
    
    }
}
