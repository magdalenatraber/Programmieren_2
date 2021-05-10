package Block5.Konto;

public class KontoDemo {
    public static void main(String[] args) {
        Konto a= new Konto("Magdalena");
        JugendGirokonto b = new JugendGirokonto("Caro",1000,400);
        Sparkonto c = new Sparkonto("Steff");
        Girokonto d= new Girokonto("Magdalena",10000);

        Konto e =b;


        e.einzahlen(1500);
        e.auszahlen(7000);
        System.out.println(e.kontostand);
        System.out.println("-------");
        Girokonto f = (Girokonto) e;

        f.einzahlen(400);
        f.auszahlen(600);
        System.out.println(f.kontostand);



        a.einzahlen(1000);






    }
}
