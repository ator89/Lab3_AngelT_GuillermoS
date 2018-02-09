package lab3;

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
