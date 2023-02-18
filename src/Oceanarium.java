import java.util.Arrays;

public class Oceanarium {

    private Shark[] sharks;
    private Duck[] ducks;
    private Fish[] fishs;

    public Oceanarium(Shark[] sharks, Duck[] ducks, Fish[] fishs) {
        this.sharks = sharks;
        this.ducks = ducks;
        this.fishs = fishs;
    }

    @Override
    public String toString() {
        return "Oceanarium=" +
                "Sharks=" + Arrays.toString(sharks) +"\n"+
                " Ducks=" + Arrays.toString(ducks) +"\n"+
                " Fishs=" + Arrays.toString(fishs);
    }
}

