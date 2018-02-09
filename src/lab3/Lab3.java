
package lab3;

import java.util.Scanner;

public class Lab3 {
    static Scanner sc = new Scanner (System.in);

    public static void main(String[] args) {
        
        
        ConnectiveLine objeto = new ConnectiveLine();
        
        String menu="";
        
        do{
            menu();
            
            switch(menu){
                case "a":
                    break;
                case "b":
                    login();
                    break;
                case "c":
                    
                    break;
                case "d":
                    break;
                default:
                    break;
                   
                    
            }
            
        }while (!menu.equalsIgnoreCase("e"));
        
        
    }
    
    
    public static void menu(){
        
        System.out.println("Menú principal: \n"+
                    "a - Registrar\n"+
                    "b - Login\n"+
                    "c - Modificar\n"+
                    "d - Eliminar\n");
        
    }
    
    
    
    public static void login(){
        System.out.println("Login \n"+"Ingrese el correo: ");
        String correo = sc.next();
        
        System.out.println("Ingrese la contraseña: ");
        String password = sc.next();
    }
    
    public void modificar(){
        
    }

}
