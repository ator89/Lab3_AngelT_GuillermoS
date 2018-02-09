package lab3;

class Administrador {

    private String nombre;
    private String usuario;
    private String contra;

    public Administrador() {
    }

    public Administrador(String nombre, String usuario, String contra) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.contra = contra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    @Override
    public String toString() {
        return "Administrador{" + "nombre=" + nombre + ", usuario=" + usuario + ", contra=" + contra + '}';
    }

}
