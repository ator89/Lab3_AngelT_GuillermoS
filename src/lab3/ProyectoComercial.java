package lab3;

import java.util.Date;

public class ProyectoComercial extends Proyecto{

    private Freelance freelance;

    public ProyectoComercial() {
        super();
    }

    public ProyectoComercial(Freelance freelance, String nombre, String empresa, String descripcion, Date inicio, Date entrega, int precio) {
        super(nombre, empresa, descripcion, inicio, entrega, precio);
        if (freelance instanceof Contador || freelance instanceof Marketing){
            this.freelance = freelance;
        }
        
    }

    public Freelance getFreelance() {
        return freelance;
    }

    public void setFreelance(Freelance freelance) {
        if (freelance instanceof Contador || freelance instanceof Marketing){
            this.freelance = freelance;
        }
    }

    @Override
    public String toString() {
        return "ProyectoComercial{" + "freelance=" + freelance + '}';
    }
    
    
    
    

}
