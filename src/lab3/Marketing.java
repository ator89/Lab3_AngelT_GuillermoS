
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
class Marketing {

    private ArrayList<String> listaProyectosComerciales = new ArrayList();
    private String redsocial;

    public Marketing() {
    }

    public ArrayList<String> getListaProyectosComerciales() {
        return listaProyectosComerciales;
    }

    public void setListaProyectosComerciales(ArrayList<String> listaProyectosComerciales) {
        this.listaProyectosComerciales = listaProyectosComerciales;
    }

    public String getRedsocial() {
        return redsocial;
    }

    public void setRedsocial(String redsocial) {
        this.redsocial = redsocial;
    }

    public Marketing(String redsocial) {
        this.redsocial = redsocial;
    }

    @Override
    public String toString() {
        return "Marketing{" + "listaProyectosComerciales=" + listaProyectosComerciales + ", redsocial=" + redsocial + '}';
    }

}
