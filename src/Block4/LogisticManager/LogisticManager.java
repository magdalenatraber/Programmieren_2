package Block4.LogisticManager;

import java.util.ArrayList;

public class LogisticManager {
    ArrayList<Movable> logisticManager;

    LogisticManager() {
        logisticManager = new ArrayList<>();
    }
public void add(Movable m){
        logisticManager.add(m);
}
    public void moveAll(String destination){
        for (Movable m: logisticManager) {
            m.move(destination);
        }
    }

}
