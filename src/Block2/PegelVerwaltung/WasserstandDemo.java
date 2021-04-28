package Block2.PegelVerwaltung;

public class WasserstandDemo {
    public static void main(String[] args) {
        Wasserstand ws1 = new Wasserstand(1,"Mondsee","Salzburg",221.45,250,450);
        Wasserstand ws2 = new Wasserstand(2,"Grundlsee","Obersteiermark",221.45,250,450);
        Wasserstand ws3 = new Wasserstand(3,"Sulmsee","Leibnitz",221.45,250,450);

    WasserstandManager manager = new WasserstandManager();
    manager.addWasserstand(ws1);
    manager.addWasserstand(ws2);
    manager.addWasserstand(ws3);

        System.out.println(manager.findById(1));



    }

}
