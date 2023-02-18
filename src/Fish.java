public class Fish extends Aquticanimal implements Swimable{

    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("Fish swim fast");
    }
}




