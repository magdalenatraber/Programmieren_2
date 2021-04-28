package Block3.Dog;

public class Beagle extends Dog{
    public String lovedFood;

    public Beagle(String lovedFood) {
        this.lovedFood = lovedFood;
    }

    public void jump(int height){
        System.out.println("Beagle jumps" + height + " cm high");
    }

    @Override
    public String toString() {
        return "Beagle{" +
                "lovedFood='" + lovedFood + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", weight=" + weight +
                '}';
    }
}
