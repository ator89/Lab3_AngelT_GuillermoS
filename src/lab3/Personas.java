/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Memo
 */
public class Personas {

    private String id;
    private String correo;
    private Administrador admin;
    private Freelance free;

    public Personas() {
    }

    public Personas(String id, String correo, Administrador admin, Freelance free) {
        this.id = id;
        this.correo = correo;
        this.admin = admin;
        this.free = free;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Administrador getAdmin() {
        return admin;
    }

    public void setAdmin(Administrador admin) {
        this.admin = admin;
    }

    public Freelance getFree() {
        return free;
    }

    public void setFree(Freelance free) {
        this.free = free;
    }

    @Override
    public String toString() {
        return "Personas{" + "id=" + id + ", correo=" + correo + ", admin=" + admin + ", free=" + free + '}';
    }

}
