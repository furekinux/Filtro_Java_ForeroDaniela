import java.util.Scanner;
import Logica.NinjaRead;
import Persistencia.Connect;
import java.sql.Connection;

public class Main {
    
    // Culpa de maven
    
    public static void main(String[] args) {
        
        boolean menu = true;
        boolean submenu = true;
        int user_ans;
        Scanner sc = new Scanner(System.in);
        while(menu){
            System.out.println("\n--- Menu Principal ---\n 1. Ninjas\n 2. Misiones\n 0. Salir");
            user_ans = sc.nextInt();
            
            switch (user_ans) {
                case 1->{
                    while(submenu){
                        System.out.println("\n--- Menu Ninja ---\n 1. Ver ninjas\n 2. Nuevo ninja\n 3. Asignar habilidad\n 0. Salir");
                        user_ans = sc.nextInt();

                        switch (user_ans) {
                            
                            case 1->{
                                System.out.println("-- Listado de ninjas --");
                                NinjaRead ninjas = new NinjaRead();
                                ninjas.readNinja();
                            }
                            case 2->{
                                System.out.println("-- Agregar un nuevo ninja --");
                                
                            }
                            case 3->{
                                System.out.println("-- Asignar habilidad a un ninja --");
                                
                            }
                            default->{
                                System.out.println("Volviendo...");
                                submenu =false;
                            }
                        }
                    }
                    submenu = true;
                }
                
                case 2->{
                    while(submenu){
                        System.out.println("\n--- Menu Misiones ---\n 1. Ver misiones\n 2. Nueva mision\n 3. Asignar mision a ninja\n 0. Salir");
                        user_ans = sc.nextInt();
                        switch (user_ans) {
                            case 1->{
                                System.out.println("-- Listado de misiones --");
                                
                            }
                            case 2->{
                                System.out.println("-- Crear una nueva mision --");
                                
                            }
                            case 3->{
                                System.out.println("-- Asignar una mision a un ninja --");
                                
                            }
                            default->{
                                System.out.println("Volviendo...");
                                submenu =false;
                            }
                        }
                    }
                    submenu = true;
                }
                
                default->{
                    System.out.println("\nCerrando...");
                    menu=false;
                }
                
            }
            
        }
        
    }
    
}
