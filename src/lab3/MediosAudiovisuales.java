
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
class MediosAudiovisuales {

    private ArrayList<String> ProyectosPublicitarios = new ArrayList();
    private String nombremarca;
    private String modelocamaravideo;

    public MediosAudiovisuales() {
    }

    public MediosAudiovisuales(String nombremarca, String modelocamaravideo) {
        this.nombremarca = nombremarca;
        this.modelocamaravideo = modelocamaravideo;
    }

    public ArrayList<String> getProyectosPublicitarios() {
        return ProyectosPublicitarios;
    }

    public void setProyectosPublicitarios(ArrayList<String> ProyectosPublicitarios) {
        this.ProyectosPublicitarios = ProyectosPublicitarios;
    }

    public String getNombremarca() {
        return nombremarca;
    }

    public void setNombremarca(String nombremarca) {
        this.nombremarca = nombremarca;
    }

    public String getModelocamaravideo() {
        return modelocamaravideo;
    }

    public void setModelocamaravideo(String modelocamaravideo) {
        this.modelocamaravideo = modelocamaravideo;
    }

    @Override
    public String toString() {
        return "MediosAudiovisuales{" + "ProyectosPublicitarios=" + ProyectosPublicitarios + ", nombremarca=" + nombremarca + ", modelocamaravideo=" + modelocamaravideo + '}';
    }

}
