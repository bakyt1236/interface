public  class Duck extends Aquticanimal implements Swimable{

    public Duck(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("Duck swim slowly");
    }
}



