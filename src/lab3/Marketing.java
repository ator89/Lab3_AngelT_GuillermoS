package lab3;

import java.util.ArrayList;

class Marketing extends Freelance{

    private ArrayList<ProyectoComercial> listaProyectosComerciales = new ArrayList();
    private String redsocial;

    public Marketing() {
        super();
    }

    public Marketing(String redsocial, String nombre, String password, String genero, String ciudad, int edad, int dinero, int telefono, int id, String email) {
        super(nombre, password, genero, ciudad, edad, dinero, telefono, id, email);
        this.redsocial = redsocial;
    }

    public ArrayList<ProyectoComercial> getListaProyectosComerciales() {
        return listaProyectosComerciales;
    }

    public void setListaProyectosComerciales(ArrayList<ProyectoComercial> listaProyectosComerciales) {
        this.listaProyectosComerciales = listaProyectosComerciales;
    }

    public String getRedsocial() {
        return redsocial;
    }

    public void setRedsocial(String redsocial) {
        this.redsocial = redsocial;
    }

    @Override
    public String toString() {
        return "Marketing{" + "listaProyectosComerciales=" + listaProyectosComerciales + ", redsocial=" + redsocial + '}';
    }
    
    


}
