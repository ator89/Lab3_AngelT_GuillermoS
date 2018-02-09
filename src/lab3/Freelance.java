package lab3;

import java.util.ArrayList;



class Freelance extends Personas{
    
    private String nombre, password, genero, ciudad;
    private int edad, dinero, telefono;
    private ArrayList<Empresas> empresas = new ArrayList();


    public Freelance() {
    }

    public Freelance(String nombre, String password, String genero, String ciudad, int edad, int dinero, int telefono, int id, String email) {
        super(id, email);
        this.nombre = nombre;
        this.password = password;
        this.genero = genero;
        this.ciudad = ciudad;
        this.edad = edad;
        this.dinero = dinero;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Empresas> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(ArrayList<Empresas> empresas) {
        this.empresas = empresas;
    }

    @Override
    public String toString() {
        return "Freelance{" + "nombre=" + nombre + ", password=" + password + ", genero=" + genero + ", ciudad=" + ciudad + ", edad=" + edad + ", dinero=" + dinero + ", telefono=" + telefono + ", empresas=" + empresas + '}';
    }


}
