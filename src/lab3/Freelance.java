/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Memo
 */
class Freelance {

    private DesarrolladorWeb DW;
    private DisenadorGrafico DG;
    private Fotografo F;
    private MediosAudiovisuales MA;
    private Marketing M;
    private Contador C;

    public Freelance() {
    }

    public Freelance(DesarrolladorWeb DW, DisenadorGrafico DG, Fotografo F, MediosAudiovisuales MA, Marketing M, Contador C) {
        this.DW = DW;
        this.DG = DG;
        this.F = F;
        this.MA = MA;
        this.M = M;
        this.C = C;
    }

    public DesarrolladorWeb getDW() {
        return DW;
    }

    public void setDW(DesarrolladorWeb DW) {
        this.DW = DW;
    }

    public DisenadorGrafico getDG() {
        return DG;
    }

    public void setDG(DisenadorGrafico DG) {
        this.DG = DG;
    }

    public Fotografo getF() {
        return F;
    }

    public void setF(Fotografo F) {
        this.F = F;
    }

    public MediosAudiovisuales getMA() {
        return MA;
    }

    public void setMA(MediosAudiovisuales MA) {
        this.MA = MA;
    }

    public Marketing getM() {
        return M;
    }

    public void setM(Marketing M) {
        this.M = M;
    }

    public Contador getC() {
        return C;
    }

    public void setC(Contador C) {
        this.C = C;
    }

    @Override
    public String toString() {
        return "Freelance{" + "DW=" + DW + ", DG=" + DG + ", F=" + F + ", MA=" + MA + ", M=" + M + ", C=" + C + '}';
    }

}
