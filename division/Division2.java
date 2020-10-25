package division;
public class Division2 {
    public static void main(String[] args) {
        try{
            double resultado = 9/0;
        System.out.println(resultado);
        } catch (ArithmeticException mensaje){ //catch (ArithmeticException mensaje){ // se pueden tener dos o mas catch de un solo try
            System.out.println("Ocurrio un error"); // esta es la excpecion q corresponde
            System.out.println(mensaje);
        }
//        catch (Exception mensaje){ // aritmetic y exception de segundo anda si coloco inverso, se rompe
//            System.out.println("Ocurrio un error"); //  importa el orden en el q coloco los catch
//            System.out.println(mensaje);
        finally{ // es para retomar el sistema y hace q una parte nueva del sistema siga funcionando
            System.out.println("Este es el finally"); // siempre se ejecuta el finally, exista o no el error
        }
                
    }
}
