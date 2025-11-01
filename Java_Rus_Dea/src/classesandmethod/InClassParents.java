package classesandmethod;

public class InClassParents {
    public static void main(String[] args) {

        // playSound class
        PlaySound playSounds = new PlaySound();
        playSounds.musicsInfo();
        playSounds.authors();

        // guitar class
        Guitar guitar = new Guitar();
        guitar.guitar = "Rock";
        guitar.author = "Said";
        guitar.musicsInfo();
        guitar.authors();

        // piano class
        Piano piano = new Piano();
        piano.piano = "silent music";
        piano.musicsInfo();

        // baraban class
        Baraban baraban = new Baraban();
        baraban.baraban = "k-pop";
        baraban.musicsInfo();

    }
}

// parent class
class PlaySound{
    String guitar;
    String piano;
    String baraban;
    String author;


    void musicsInfo(){
        System.out.println("Instruments Info.");
    }
    void authors() {
        System.out.println("This method shows the Authors.");
    }

}

// child classes
class Guitar extends PlaySound {
    @Override
    void musicsInfo() {
        System.out.println("This music is playing:" + guitar);
    }


    @Override
    void authors() {
        System.out.println(author + " is playing " + guitar);
    }

}

class Piano extends PlaySound {
    @Override
    void musicsInfo() {
        System.out.println("This music is playing:" + piano);
    }

    @Override
    void authors() {
        System.out.println(author + " is playing " + piano);
    }

}

class Baraban extends PlaySound {
    @Override
    void musicsInfo() {
        System.out.println("This music is playing:" + baraban);
    }

    @Override
    void authors() {
        System.out.println(author + " is playing " + baraban);
    }

}


