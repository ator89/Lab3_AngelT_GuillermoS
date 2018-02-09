package lab3;

import java.util.ArrayList;

public class Extranjeras extends Empresas{

    private String pais, ciudad, pagina;

    public Extranjeras() {
        super();
    }

    public Extranjeras(String pais, String ciudad, String pagina, String nombre, String email, String password, String descripcion, int telefono) {
        super(nombre, email, password, descripcion, telefono);
        this.pais = pais;
        this.ciudad = ciudad;
        this.pagina = pagina;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPagina() {
        return pagina;
    }

    public void setPagina(String pagina) {
        this.pagina = pagina;
    }

    @Override
    public String toString() {
        return "Extranjeras{" + "pais=" + pais + ", ciudad=" + ciudad + ", pagina=" + pagina + '}';
    }

    
}
