public class Main {
    public static void main(String[] args) {
        System.out.println("How a shark swims a duck,fish?");

        Shark shark1 = new Shark("Deysi");shark1.swim();
        Shark shark2 = new Shark("SSD");
        Shark shark3 = new Shark("LLG");
        Shark shark4 = new Shark("Bad");
        Shark shark5 = new Shark("HP");
        Shark sharks[] = {shark1, shark2, shark3, shark4, shark5};

        Duck duck1 = new Duck("A");duck1.swim();
        Duck duck2 = new Duck("B");
        Duck duck3 = new Duck("C");
        Duck duck4 = new Duck("D");
        Duck duck5 = new Duck("E");
        Duck ducks[] = {duck1, duck2, duck3, duck4, duck5};

        Fish fish1 = new Fish("Green");fish1.swim();
        Fish fish2 = new Fish("Black");
        Fish fish3 = new Fish("Blue");
        Fish fish4 = new Fish("Nemo");
        Fish fish5 = new Fish("Saiman");
        Fish fishs[] = {fish1, fish2, fish3, fish4, fish5};

        Oceanarium oceanarium = new Oceanarium(sharks, ducks, fishs);
        System.out.println(oceanarium);


    }
}
