/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Memo
 */
public class ingresos {

    private Empresas emp;
    private Freelance freelan;
    private double dinero;

    public ingresos() {
    }

    public ingresos(Empresas emp, Freelance freelan, double dinero) {
        this.emp = emp;
        this.freelan = freelan;
        this.dinero = dinero;
    }

    public Empresas getEmp() {
        return emp;
    }

    public void setEmp(Empresas emp) {
        this.emp = emp;
    }

    public Freelance getFreelan() {
        return freelan;
    }

    public void setFreelan(Freelance freelan) {
        this.freelan = freelan;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "ingresos{" + "emp=" + emp + ", freelan=" + freelan + ", dinero=" + dinero + '}';
    }

}
