
interface Instrument {
    void play();
    void tune();

    double pi = 3.14;

}


class Piano implements Instrument {
    @Override
    public void play() {
        System.out.println("Playing the piano.");
    }

    @Override
    public void tune() {
        System.out.println("Tuning the piano.");
    }
}


class Guitar implements Instrument {
    @Override
    public void play() {
        System.out.println("Playing the guitar.");
    }

    @Override
    public void tune() {
        System.out.println("Tuning the guitar.");
    }
}


public class InterfaceExample {
    public static void main(String[] args) {
        Instrument piano = new Piano();
        piano.play();
        piano.tune();


        System.out.println(piano.pi);

        Instrument guitar = new Guitar();
        guitar.play();
        guitar.tune();
    }
}
