package lab3;

import java.util.ArrayList;

public class Empresas {

    private String nombre, email, password, descripcion;
    private int telefono;
    private ArrayList<Proyecto> proyectos = new ArrayList();

    public Empresas() {
    }
    
    public Empresas(String nombre, String email, String password, String descripcion, int telefono) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.descripcion = descripcion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(ArrayList<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }

    @Override
    public String toString() {
        return "Empresas{" + "nombre=" + nombre + ", email=" + email + ", password=" + password + ", descripcion=" + descripcion + ", telefono=" + telefono + ", proyectos=" + proyectos + '}';
    }

    
    
    
}
