package lab3;

import java.util.ArrayList;

class DisenadorGrafico extends Freelance{

    private ArrayList<Proyecto> ListaProyectosPublicitarios = new ArrayList();
    private String universidad, hobbies;

    public DisenadorGrafico() {
        super();
    }

    public DisenadorGrafico(String universidad, String hobbies, String nombre, 
            String password, String genero, String ciudad, int edad, int dinero,
            int telefono, int id, String email) {
        super(nombre, password, genero, ciudad, edad, dinero, telefono, id, email);
        this.universidad = universidad;
        this.hobbies = hobbies;
    }

    public DisenadorGrafico(String universidad, String hobbies) {
        this.universidad = universidad;
        this.hobbies = hobbies;
    }
    

    public ArrayList<Proyecto> getListaProyectosPublicitarios() {
        return ListaProyectosPublicitarios;
    }

    public void setListaProyectosPublicitarios(ArrayList<Proyecto> ListaProyectosPublicitarios) {
        this.ListaProyectosPublicitarios = ListaProyectosPublicitarios;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "DisenadorGrafico{" + "ListaProyectosPublicitarios=" + ListaProyectosPublicitarios + ", universidad=" + universidad + ", hobbies=" + hobbies + '}';
    }

    

}
