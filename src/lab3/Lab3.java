package lab3;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String op, usuario, contra, genero, lenguaje, departamento, municipio, vision, mision, correo, pais, pagina, contrasena, descripcion, universidad, idioma, red, hobbies, marca, modelo;
        int edad;
        boolean inscripcion;
//      ConnectiveLine objeto = new ConnectiveLine();
        do {
            switch (menu()) {
                case "a":
                    switch (Registrar()) {
                        case "a":
                            System.out.println("Nombre de usuario:");
                            usuario = sc.next();
                            System.out.println("Contraseña: ");
                            contra = sc.next();
                            break;
                        case "b":
                            System.out.println("Nombre Completo:");
                            String nombre = sc.nextLine();
                            nombre = sc.nextLine();
                            System.out.println("Contraseña: ");
                            contra = sc.next();
                            System.out.println("Genero:");
                            genero = sc.next();
                            System.out.println("Edad:");
                            edad = sc.nextInt();
                            ArrayList<String> listaempresas = new ArrayList();
                            String resp;
                            do {
                                System.out.println("Ingrese empresa a agregar:");
                                listaempresas.add(sc.nextLine());
                                System.out.println("Desea ingresar otra empresa:[si/no]");
                                resp = sc.next();
                            } while (resp.equalsIgnoreCase("si"));
                            System.out.println("Dinero:");
                            double dinero = sc.nextDouble();
                            System.out.println("Ciudad:");
                            String ciudad = sc.next();
                            System.out.println("Telefono:");
                            String telefono = sc.next();
                            switch (RegistroFreelance()) {
                                case "a":
                                    System.out.println("Lenguaje de Programacion:");
                                    lenguaje = sc.next();
                                    System.out.println("Universidad:");
                                    universidad = sc.next();
                                    System.out.println("Idioma:");
                                    idioma = sc.next();
                                    ArrayList<String> listaproyectoweb = new ArrayList();
                                    do {
                                        System.out.println("Ingrese proyecto web a agregar:");
                                        listaproyectoweb.add(sc.nextLine());
                                        System.out.println("Desea ingresar otro proyecto:[si/no]");
                                        resp = sc.next();
                                    } while (resp.equalsIgnoreCase("si"));
                                    break;
                                case "b":
                                    ArrayList<String> listaproyectopublic = new ArrayList();
                                    do {
                                        System.out.println("Ingrese proyecto publicitario a agregar:");
                                        listaproyectopublic.add(sc.nextLine());
                                        System.out.println("Desea ingresar otro proyecto:[si/no]");
                                        resp = sc.next();
                                    } while (resp.equalsIgnoreCase("si"));
                                    System.out.println("Universidad:");
                                    universidad = sc.next();
                                    System.out.println("Hobbies:");
                                    hobbies = sc.next();
                                    break;
                                case "c":
                                    ArrayList<String> listaproyectopublicfotografo = new ArrayList();
                                    do {
                                        System.out.println("Ingrese proyecto publicitario a agregar:");
                                        listaproyectopublicfotografo.add(sc.nextLine());
                                        System.out.println("Desea ingresar otro proyecto:[si/no]");
                                        resp = sc.next();
                                    } while (resp.equalsIgnoreCase("si"));
                                    System.out.println("Nombre de la marca:");
                                    marca = sc.next();
                                    System.out.println("Modelo camara fotografica:");
                                    modelo = sc.next();
                                    break;
                                case "d":
                                    ArrayList<String> listaproyectopublicaudiovisuales = new ArrayList();
                                    do {
                                        System.out.println("Ingrese proyecto publicitario a agregar:");
                                        listaproyectopublicaudiovisuales.add(sc.nextLine());
                                        System.out.println("Desea ingresar otro proyecto:[si/no]");
                                        resp = sc.next();
                                    } while (resp.equalsIgnoreCase("si"));
                                    System.out.println("Nombre de la marca:");
                                    marca = sc.next();
                                    System.out.println("Modelo camara fotografica:");
                                    modelo = sc.next();
                                    break;
                                case "e":
                                    ArrayList<String> listaproyectocomerciales = new ArrayList();
                                    do {
                                        System.out.println("Ingrese proyecto publicitario a agregar:");
                                        listaproyectocomerciales.add(sc.nextLine());
                                        System.out.println("Desea ingresar otro proyecto:[si/no]");
                                        resp = sc.next();
                                    } while (resp.equalsIgnoreCase("si"));
                                    System.out.println("Red social mas usada:");
                                    red = sc.next();
                                    break;
                                case "f":
                                    ArrayList<String> listaproyectocomercialesContador = new ArrayList();
                                    do {
                                        System.out.println("Ingrese proyecto publicitario a agregar:");
                                        listaproyectocomercialesContador.add(sc.nextLine());
                                        System.out.println("Desea ingresar otro proyecto:[si/no]");
                                        resp = sc.next();
                                    } while (resp.equalsIgnoreCase("si"));
                                    System.out.println("Universidad:");
                                    universidad = sc.next();
                                    System.out.println("Estado de la inscripcion del Colegio de Peritos Mercantiles[true/false]:");
                                    inscripcion = sc.nextBoolean();
                                    System.out.println("Hobbie:");
                                    hobbies = sc.next();
                                    break;
                            }//fin switch
                            break;
                        case "c":
                            System.out.println("Nombre:");
                            nombre = sc.next();
                            System.out.println("Telefono:");
                            telefono = sc.next();
                            ArrayList<String> listaproyecto = new ArrayList();
                            do {
                                System.out.println("Ingrese proyecto publicitario a agregar:");
                                listaproyecto.add(sc.nextLine());
                                System.out.println("Desea ingresar otro proyecto:[si/no]");
                                resp = sc.next();
                            } while (resp.equalsIgnoreCase("si"));
                            System.out.println("Correo Electronico:");
                            correo = sc.next();
                            System.out.println("Contraseña:");
                            contrasena = sc.next();
                            System.out.println("Descripcion:");
                            descripcion = sc.next();
                            switch (RegistroEmp()) {
                                case "a":
                                    System.out.println("Pais:");
                                    pais = sc.next();
                                    System.out.println("ciudad:");
                                    ciudad = sc.next();
                                    System.out.println("Pagina Web:");
                                    pagina = sc.next();
                                    break;
                                case "b":
                                    System.out.println("Departamento:");
                                    departamento = sc.next();
                                    System.out.println("Municipio:");
                                    municipio = sc.next();
                                    System.out.println("Ciudad:");
                                    ciudad = sc.next();
                                    System.out.println("Mision:");
                                    mision = sc.next();
                                    System.out.println("Vision:");
                                    vision = sc.next();
                                    break;
                            }
                            break;
                    }//fin switch
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
            }//fin switch
            System.out.println("Desea ingresar otra opcion?");
            op = sc.next();
        } while (op.equalsIgnoreCase("si"));

    }//fin main

    public static String menu() {

        System.out.println("Menú principal: \n"
                + "a - Registrar\n"
                + "b - Login\n"
                + "c - Modificar\n"
                + "d - Eliminar\n"
                + "e - Salir");
        System.out.println("Ingrese Opcion");
        String op = sc.next();
        return op;
    }

    public static String Registrar() {
        System.out.println("a - Registrar Administrador \n"
                + "b - Registrar Freelance \n"
                + "c - Registrar Empresa \n"
                + "e - Salir");
        System.out.println("Ingrese Opcion");
        String op = sc.next();
        return op;
    }//fin registrar

    public static String RegistroEmp() {
        System.out.println("a - Empresa Extranjera \n"
                + "b - Empresa Nacional");
        System.out.println("Ingrese opcion");
        String op = sc.next();
        return op;
    }

    public static String RegistroFreelance() {
        System.out.println("a - Desarrollador Web \n"
                + "b - Diseñador Grafico \n"
                + "c - Fotografo \n"
                + "d - Medios Audiovisuales \n"
                + "e - Marketing \n"
                + "f - Contador \n");
        System.out.println("Ingrese Opcion");
        String op = sc.next();
        return op;
    }

    public static void login() {
        System.out.println("Login \n" + "Ingrese el correo: ");
        String correo = sc.next();

        System.out.println("Ingrese la contraseña: ");
        String password = sc.next();
    }//fin login

    public void modificar() {

    }//fin modificar

}//fin class
