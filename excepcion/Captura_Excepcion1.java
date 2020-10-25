package excepcion;
public class Captura_Excepcion1 {
    public static void main(String[] args) {
        
    try{
        
    
        int n, d, c;
        n = 10;
        d = 0;
        c = n/d;
        System.out.println(c);
        
    }
    catch (ArithmeticException e){
        System.out.println("Error división por cero");
    }

    }
    
}

