package lab3;

import java.util.Date;

public class ProyectoWeb extends Proyecto{

    private DesarrolladorWeb devWeb;

    public ProyectoWeb() {
        super();
    }

    public ProyectoWeb(DesarrolladorWeb devWeb, String nombre, String empresa, String descripcion, Date inicio, Date entrega, int precio) {
        super(nombre, empresa, descripcion, inicio, entrega, precio);
        this.devWeb = devWeb;
    }

    public DesarrolladorWeb getDevWeb() {
        return devWeb;
    }

    public void setDevWeb(DesarrolladorWeb devWeb) {
        this.devWeb = devWeb;
    }

    @Override
    public String toString() {
        return "ProyectoWeb{" + "devWeb=" + devWeb + '}';
    }
    
    
    

}
