package Block3.Hasenstall;

public class Osterhase extends Hase{
    public Osterhase(String name) {
        super(name);
        hoppeln();
        super.hoppeln();
    }

    public void versteckeOstereier(){
        System.out.println(name + " versteckt Ostereier.");
    }
    @Override
    public void hoppeln(){
        System.out.println(name+" hoppelt im Gras.");
    }
}
