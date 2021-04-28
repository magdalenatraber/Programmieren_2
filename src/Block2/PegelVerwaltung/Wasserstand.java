package Block2.PegelVerwaltung;

public class Wasserstand {
    private int id;
    private String Gewässername;
    private String Ort;
    private double messwert;
    private double messwertFürAlarmierung;
    private int zeitpunkt;

    public Wasserstand(int id, String gewässername, String ort, double messwert, double messwertFürAlarmierung, int zeitpunkt) {
        this.id = id;
        Gewässername = gewässername;
        Ort = ort;
        this.messwert = messwert;
        this.messwertFürAlarmierung = messwertFürAlarmierung;
        this.zeitpunkt = zeitpunkt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGewässername() {
        return Gewässername;
    }

    public void setGewässername(String gewässername) {
        Gewässername = gewässername;
    }

    public String getOrt() {
        return Ort;
    }

    public void setOrt(String ort) {
        Ort = ort;
    }

    public double getMesswert() {
        return messwert;
    }

    public void setMesswert(double messwert) {
        this.messwert = messwert;
    }

    public double getMesswertFürAlarmierung() {
        return messwertFürAlarmierung;
    }

    public void setMesswertFürAlarmierung(double messwertFürAlarmierung) {
        this.messwertFürAlarmierung = messwertFürAlarmierung;
    }

    public int getZeitpunkt() {
        return zeitpunkt;
    }

    public void setZeitpunkt(int zeitpunkt) {
        this.zeitpunkt = zeitpunkt;
    }

    @Override
    public String toString() {
        return "Wasserstand{" +
                "id=" + id +
                ", Gewässername='" + Gewässername + '\'' +
                ", Ort='" + Ort + '\'' +
                ", messwert=" + messwert +
                ", messwertFürAlarmierung=" + messwertFürAlarmierung +
                ", zeitpunkt=" + zeitpunkt +
                '}';
    }
}
