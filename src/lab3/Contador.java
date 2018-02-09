package lab3;

import java.util.ArrayList;

class Contador extends Freelance{

    private ArrayList<ProyectoComercial> listaProyectosComerciales = new ArrayList();
    private String universidad, hobbie;
    private boolean estado;

    public Contador() {
        super();
    }

    public Contador(String universidad, String hobbie, boolean estado, String nombre, String password, String genero, String ciudad, int edad, int dinero, int telefono, int id, String email) {
        super(nombre, password, genero, ciudad, edad, dinero, telefono, id, email);
        this.universidad = universidad;
        this.hobbie = hobbie;
        this.estado = estado;
    }

    public Contador(String universidad, String hobbie, boolean estado) {
        this.universidad = universidad;
        this.hobbie = hobbie;
        this.estado = estado;
    }
    
    

    public ArrayList<ProyectoComercial> getListaProyectosComerciales() {
        return listaProyectosComerciales;
    }

    public void setListaProyectosComerciales(ArrayList<ProyectoComercial> listaProyectosComerciales) {
        this.listaProyectosComerciales = listaProyectosComerciales;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getHobbie() {
        return hobbie;
    }

    public void setHobbie(String hobbie) {
        this.hobbie = hobbie;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Contador{" + "listaProyectosComerciales=" + listaProyectosComerciales + ", universidad=" + universidad + ", hobbie=" + hobbie + ", estado=" + estado + '}';
    }
    
    
    
}//fin clase contador
