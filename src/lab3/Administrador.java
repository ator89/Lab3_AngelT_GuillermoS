package lab3;

class Administrador extends Personas{

    private String usuario;
    private String contra;

    public Administrador() {
        super();
    }

    public Administrador(String usuario, String contra, int id, String email) {
        super(id, email);
        this.usuario = usuario;
        this.contra = contra;
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
        return "Administrador{" + "usuario=" + usuario + ", contra=" + contra + '}';
    }

    
    
    
    

}
