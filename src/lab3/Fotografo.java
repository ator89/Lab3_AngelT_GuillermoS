package lab3;

import java.util.ArrayList;

class Fotografo extends Freelance{

    private ArrayList<ProyectoPublicitario> listaProyectosPublicitarios = new ArrayList();
    private String nombreMarca;
    private String modeloCamara;

    public Fotografo() {
        super();
    }

    public Fotografo(String nombreMarca, String modeloCamara, String nombre, String password, String genero, String ciudad, int edad, int dinero, int telefono, int id, String email) {
        super(nombre, password, genero, ciudad, edad, dinero, telefono, id, email);
        this.nombreMarca = nombreMarca;
        this.modeloCamara = modeloCamara;
    }

    public ArrayList<ProyectoPublicitario> getListaProyectosPublicitarios() {
        return listaProyectosPublicitarios;
    }

    public void setListaProyectosPublicitarios(ArrayList<ProyectoPublicitario> listaProyectosPublicitarios) {
        this.listaProyectosPublicitarios = listaProyectosPublicitarios;
    }

    public String getNombreMarca() {
        return nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }

    public String getModeloCamara() {
        return modeloCamara;
    }

    public void setModeloCamara(String modeloCamara) {
        this.modeloCamara = modeloCamara;
    }

    @Override
    public String toString() {
        return "Fotografo{" + "listaProyectosPublicitarios=" + listaProyectosPublicitarios + ", nombreMarca=" + nombreMarca + ", modeloCamara=" + modeloCamara + '}';
    }

    

}
