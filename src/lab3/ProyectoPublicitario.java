package lab3;

import java.util.Date;

public class ProyectoPublicitario extends Proyecto{

    private Freelance freelance;

    public ProyectoPublicitario() {
        super();
    }

    public ProyectoPublicitario(Freelance freelance, String nombre, String empresa, String descripcion, Date inicio, Date entrega, int precio) {
        super(nombre, empresa, descripcion, inicio, entrega, precio);
        if (freelance instanceof DisenadorGrafico || freelance instanceof Fotografo || freelance instanceof MediosAudiovisuales){
            this.freelance = freelance;
        }
    }

    public Freelance getFreelance() {
        return freelance;
    }

    public void setFreelance(Freelance freelance) {
        if (freelance instanceof DisenadorGrafico || freelance instanceof Fotografo || freelance instanceof MediosAudiovisuales){
            this.freelance = freelance;
        }
    }

    @Override
    public String toString() {
        return "ProyectoPublicitario{" + "freelance=" + freelance + '}';
    }
    
    
    
    
    

}
