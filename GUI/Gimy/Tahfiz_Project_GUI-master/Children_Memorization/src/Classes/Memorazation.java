package Classes;

import java.util.Date;

/**
 * Created by gimy on 11/05/2016.
 */
public class Memorazation {

    private String soura;
    private int from;
    private int to;
    private String evaluation;

    public Memorazation(){
        this.soura = "";
        this.from = 0;
        this.to = 0;
        this.evaluation = "";
    }

    public Memorazation(String soura, int from, int to, String evaluation) {
        this.soura = soura;
        this.from = from;
        this.to = to;
        this.evaluation = evaluation;
    }

    public String getSoura() {
        return soura;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }

    public String getEvaluation() {
        return evaluation;
    }

    public void setSoura(String soura) {
        this.soura = soura;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }

}
