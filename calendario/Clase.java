package calendario;
public class Clase {
    
    public void dias (String dia){
        try{
            switch (dia){
                case "Lunes":
                    System.out.println("1");
                    break;
                case "Martes":
                    System.out.println("2");
                    break;
                case "Miercoles":
                    System.out.println("3");
                    break;
                case "Jueves":
                    System.out.println("4");
                    break; 
                default:
                    throw new IllegalArgumentException("Dia invalido: " + dia);
            }
        }catch(IllegalArgumentException mensaje){
                System.out.println("Dia no encontrado");
                System.out.println("Error Tecnico: " + mensaje);
        }
    }
}
