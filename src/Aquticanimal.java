public class Aquticanimal implements Swimable{
    private String name;

    public Aquticanimal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Aquticanimal=" +
                "name=" + name + "\n";
    }

    @Override
    public void swim() {

    }
}
