import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) {
        boolean menu = true;
        int user_ans;
        Scanner sc = new Scanner(System.in);
        while(menu){
            System.out.println("\n--- Menu Principal ---\n 1. Ninjas\n 2. Misiones\n 0. Salir");
            user_ans = sc.nextInt();
            
            switch (user_ans) {
                
                case 1->{
                    System.out.println("\n--- Menu Ninja ---\n 1. Nuevo ninjas\n 2. Asignar habilidad\n 0. Salir");
                }
                
                case 2->{
                    System.out.println("\n--- Menu Misiones ---\n 1. Nueva mision\n 2. Asignar mision a ninja\n 0. Salir");
                }
                
                default->{
                    System.out.println("\nCerrando...");
                    menu=false;
                }
                
            }
            
        }
        
    }
    
}
