package lab3;

import java.util.Scanner;

public class Lab3 {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        String op;        
//        ConnectiveLine objeto = new ConnectiveLine();
        do {
            switch (menu()) {
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
            System.out.println("Desea ingresar otra opcion?");
            op = sc.next();
        } while (op.equalsIgnoreCase("s"));
        
    }
    
    public static String menu() {
        
        System.out.println("Menú principal: \n"
                + "a - Registrar\n"
                + "b - Login\n"
                + "c - Modificar\n"
                + "d - Eliminar\n");
        System.out.println("Ingrese Opcion");
        String op = sc.next();
        return op;
    }
    
    public static void Registrar() {
        System.out.println("a - Registrar Administrador \n"
                + "b - Registrar Freelance \n"
                + "c - Registrar Empresa");
    }
    
    public static void login() {
        System.out.println("Login \n" + "Ingrese el correo: ");
        String correo = sc.next();
        
        System.out.println("Ingrese la contraseña: ");
        String password = sc.next();
    }
    
    public void modificar() {
        
    }
    
}
