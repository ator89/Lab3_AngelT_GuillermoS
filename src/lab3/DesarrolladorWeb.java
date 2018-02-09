
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
class DesarrolladorWeb {

    private String LenguajeP;
    private String Universidad;
    private String idioma;
    private ArrayList<String> proyectosweb = new ArrayList();

    public DesarrolladorWeb() {
    }

    public DesarrolladorWeb(String LenguajeP, String Universidad, String idioma) {
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

    public ArrayList<String> getProyectosweb() {
        return proyectosweb;
    }

    public void setProyectosweb(ArrayList<String> proyectosweb) {
        this.proyectosweb = proyectosweb;
    }

    @Override
    public String toString() {
        return "DesarrolladorWeb{" + "LenguajeP=" + LenguajeP + ", Universidad=" + Universidad + ", idioma=" + idioma + ", proyectosweb=" + proyectosweb + '}';
    }

}
