package lab3;

import java.util.Date;

public class Proyecto {

    private String nombre, empresa, descripcion;
    private Date inicio, entrega;
    private int precio;

    public Proyecto() {
    }

    public Proyecto(String nombre, String empresa, String descripcion, Date inicio, Date entrega, int precio) {
        this.nombre = nombre;
        this.empresa = empresa;
        this.descripcion = descripcion;
        this.inicio = inicio;
        this.entrega = entrega;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getEntrega() {
        return entrega;
    }

    public void setEntrega(Date entrega) {
        this.entrega = entrega;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "nombre=" + nombre + ", empresa=" + empresa + ", descripcion=" + descripcion + ", inicio=" + inicio + ", entrega=" + entrega + ", precio=" + precio + '}';
    }

}
