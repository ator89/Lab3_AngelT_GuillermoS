package lab3;

import java.util.ArrayList;

class MediosAudiovisuales extends Freelance{

    private ArrayList<ProyectoPublicitario> ProyectosPublicitarios = new ArrayList();
    private String marca;
    private String modelV;

    public MediosAudiovisuales() {
        super();
    }

    public MediosAudiovisuales(String marca, String modelV, String nombre, String password, String genero, String ciudad, int edad, int dinero, int telefono, int id, String email) {
        super(nombre, password, genero, ciudad, edad, dinero, telefono, id, email);
        this.marca = marca;
        this.modelV = modelV;
    }

    public ArrayList<ProyectoPublicitario> getProyectosPublicitarios() {
        return ProyectosPublicitarios;
    }

    public void setProyectosPublicitarios(ArrayList<ProyectoPublicitario> ProyectosPublicitarios) {
        this.ProyectosPublicitarios = ProyectosPublicitarios;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelV() {
        return modelV;
    }

    public void setModelV(String modelV) {
        this.modelV = modelV;
    }

    @Override
    public String toString() {
        return "MediosAudiovisuales{" + "ProyectosPublicitarios=" + ProyectosPublicitarios + ", marca=" + marca + ", modelV=" + modelV + '}';
    }

    
    

}
