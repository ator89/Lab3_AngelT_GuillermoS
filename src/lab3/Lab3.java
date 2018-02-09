
package lab3;

import java.util.Scanner;

public class Lab3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        String menu="";
        
        do{
            menu();
            
        }while (!menu.equalsIgnoreCase("e"));
        
        
    }
    
    
    public static void menu(){
        
        System.out.println("Menú principal: \n"+
                    "1 - Registrar\n"+
                    "2 - Login\n"+
                    "3 - Modificar\n"+
                    "4 - Eliminar\n");
        
    }
    
    

}
