
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
class Fotografo {

    private ArrayList<String> listaProyectosPublicitarios = new ArrayList();
    private String nombremarca;
    private String modelocamara;

    public Fotografo() {
    }

    public Fotografo(String nombremarca, String modelocamara) {
        this.nombremarca = nombremarca;
        this.modelocamara = modelocamara;
    }

    public ArrayList<String> getListaProyectosPublicitarios() {
        return listaProyectosPublicitarios;
    }

    public void setListaProyectosPublicitarios(ArrayList<String> listaProyectosPublicitarios) {
        this.listaProyectosPublicitarios = listaProyectosPublicitarios;
    }

    public String getNombremarca() {
        return nombremarca;
    }

    public void setNombremarca(String nombremarca) {
        this.nombremarca = nombremarca;
    }

    public String getModelocamara() {
        return modelocamara;
    }

    public void setModelocamara(String modelocamara) {
        this.modelocamara = modelocamara;
    }

    @Override
    public String toString() {
        return "Fotografo{" + "listaProyectosPublicitarios=" + listaProyectosPublicitarios + ", nombremarca=" + nombremarca + ", modelocamara=" + modelocamara + '}';
    }

}
