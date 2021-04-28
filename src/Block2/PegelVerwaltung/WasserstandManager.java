package Block2.PegelVerwaltung;

import Block2.at.campus.emp.Employee;

import java.util.ArrayList;

public class WasserstandManager {



  private ArrayList<Wasserstand> wsManager;

    public WasserstandManager() {
        this.wsManager = new ArrayList<Wasserstand>();
    }

    public void addWasserstand(Wasserstand ws){
        wsManager.add(ws);
    }

    @Override
    public String toString() {
        return "WasserstandManager{" +
                "wsManager=" + wsManager +
                '}';
    }

    public Wasserstand findById(int id){
        for (Wasserstand wasserstand : wsManager) {
            if (wasserstand.getId() == id) ;
            return wasserstand;

        }
        return null;
    }

    public ArrayList<Wasserstand> findAllByGewässer(String gewaessername) {
        for (Wasserstand wasserstand : wsManager) {
            if (wasserstand.getGewässername().equals(gewaessername)) {

            }
        }
        return null;
    }
    }




