public class Person {
    String imie;
    int wiek;
    boolean isALive;
    static int  ile;

    // imie, wiek, isalive - to są pola.

    void przedstawSie(){
        ile++;
        System.out.println("Cześć jestem " + imie);
    }
    void pelnoletnosc(){
        if (wiek>=18){
            System.out.println("Jestem pełnoletni");
        } else {
            System.out.println("Nie jestem pełnoletni");
        }
    }

    void ofic(boolean praca){
        if (praca){
            System.out.println("mam prace!");
        } else {
            System.out.println("nie mam pracy");
        }
    }
    static int ileLudzi(){
        return ile;
    }
}
