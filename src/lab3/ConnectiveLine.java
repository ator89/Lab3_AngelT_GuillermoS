package lab3;

import java.util.ArrayList;

public class ConnectiveLine {

    private ArrayList<Empresas> empresas = new ArrayList();
    private ArrayList<Personas> persona = new ArrayList();
    private ArrayList<ingresos> ingresos = new ArrayList();

    public ConnectiveLine() {
    }

    public ArrayList<Empresas> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(ArrayList<Empresas> empresas) {
        this.empresas = empresas;
    }

    public ArrayList<Personas> getPersona() {
        return persona;
    }

    public void setPersona(ArrayList<Personas> persona) {
        this.persona = persona;
    }

    public ArrayList<ingresos> getIngresos() {
        return ingresos;
    }

    public void setIngresos(ArrayList<ingresos> ingresos) {
        this.ingresos = ingresos;
    }

    @Override
    public String toString() {
        return "ConnectiveLine{" + "empresas=" + empresas + ", persona=" + persona + ", ingresos=" + ingresos + '}';
    }
    
    

}
