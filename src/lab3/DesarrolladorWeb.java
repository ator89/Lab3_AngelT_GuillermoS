package lab3;

import java.util.ArrayList;

class DesarrolladorWeb extends Freelance{

    private String LenguajeP;
    private String Universidad;
    private String idioma;
    private ArrayList<ProyectoWeb> proyectosweb = new ArrayList();

    public DesarrolladorWeb() {
        super();
    }

    public DesarrolladorWeb(String LenguajeP, String Universidad, String idioma, String nombre, String password, String genero, String ciudad, int edad, int dinero, int telefono, int id, String email) {
        super(nombre, password, genero, ciudad, edad, dinero, telefono, id, email);
        this.LenguajeP = LenguajeP;
        this.Universidad = Universidad;
        this.idioma = idioma;
    }

    public String getLenguajeP() {
        return LenguajeP;
    }

    public void setLenguajeP(String LenguajeP) {
        this.LenguajeP = LenguajeP;
    }

    public String getUniversidad() {
        return Universidad;
    }

    public void setUniversidad(String Universidad) {
        this.Universidad = Universidad;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public ArrayList<ProyectoWeb> getProyectosweb() {
        return proyectosweb;
    }

    public void setProyectosweb(ArrayList<ProyectoWeb> proyectosweb) {
        this.proyectosweb = proyectosweb;
    }

    @Override
    public String toString() {
        return "DesarrolladorWeb{" + "LenguajeP=" + LenguajeP + ", Universidad=" + Universidad + ", idioma=" + idioma + ", proyectosweb=" + proyectosweb + '}';
    }

}
