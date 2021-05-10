package Block5.Property;

public class PropertyApp {
    public static void main(String[] args) {
House a = new House("Magdalena",200,"Kerngasse 1,8010 Graz", 1950);
House b = new House("Michi",100,"Kerngasse 1,8010 Graz", 2021);
House c = new House("Manuel",150,"Kerngasse 1,8010 Graz", 2000);
Flat d = new Flat("Magdalena",50,"Kerngasse 1,8010 Graz", true,1);
RentedFlat e = new RentedFlat("Magdalena",200,"Kerngasse 1,8010 Graz", true,2,true);

        System.out.println(a.monthlyCost());
        System.out.println(a.upfrontCost());
        System.out.println(b.monthlyCost());
        System.out.println(b.upfrontCost());
        System.out.println(c.monthlyCost());
        System.out.println(c.upfrontCost());
        System.out.println(d.monthlyCost());
        System.out.println(d.upfrontCost());
      System.out.println(e.monthlyCost());
     System.out.println(e.upfrontCost());


    }


}
