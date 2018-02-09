package lab3;

import java.util.ArrayList;

class DisenadorGrafico {

    private ArrayList<String> ListaProyectosPublicitarios = new ArrayList();
    private String universidad;
    private String hobbies;

    public DisenadorGrafico() {
    }

    public DisenadorGrafico(String universidad, String hobbies) {
        this.universidad = universidad;
        this.hobbies = hobbies;
    }

    public ArrayList<String> getListaProyectosPublicitarios() {
        return ListaProyectosPublicitarios;
    }

    public void setListaProyectosPublicitarios(ArrayList<String> ListaProyectosPublicitarios) {
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
