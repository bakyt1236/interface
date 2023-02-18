public class Shark extends Aquticanimal implements Swimable{

    public Shark(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("Sharks swim 70 km/ч");

    }
}

