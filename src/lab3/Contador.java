
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Memo
 */
class Contador {

    private ArrayList<String> listaProyectosComerciales = new ArrayList();
    private String universidad;
    private boolean inscripcionColegio;
    private String hobbie;

    public Contador() {
    }

    public Contador(String universidad, boolean inscripcionColegio, String hobbie) {
        this.universidad = universidad;
        this.inscripcionColegio = inscripcionColegio;
        this.hobbie = hobbie;
    }

    public ArrayList<String> getListaProyectosComerciales() {
        return listaProyectosComerciales;
    }

    public void setListaProyectosComerciales(ArrayList<String> listaProyectosComerciales) {
        this.listaProyectosComerciales = listaProyectosComerciales;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public boolean isInscripcionColegio() {
        return inscripcionColegio;
    }

    public void setInscripcionColegio(boolean inscripcionColegio) {
        this.inscripcionColegio = inscripcionColegio;
    }

    public String getHobbie() {
        return hobbie;
    }

    public void setHobbie(String hobbie) {
        this.hobbie = hobbie;
    }

    @Override
    public String toString() {
        return "Contador{" + "listaProyectosComerciales=" + listaProyectosComerciales + ", universidad=" + universidad + ", inscripcionColegio=" + inscripcionColegio + ", hobbie=" + hobbie + '}';
    }

}//fin clase contador
