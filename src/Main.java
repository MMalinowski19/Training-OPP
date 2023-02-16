public class Main {

    public static void main(String[] args) { //
        // public - publicznie dostepne i widoczne w innych klasach
        // static - metoda widoczna na poziomie całej klasy, dostepna z poziomu klasy
        // void - metoda nic nie zwraca
        // main - nazwa metody
        // string [] args - parametry
        Person pawel = new Person(); // To jest tworzenie nowego obiektu, 1 obiekt
        pawel.imie = "Pawel";
        pawel.wiek = 18;
        pawel.isALive = true;
        Person mateusz = new Person(); // To jest tworzenie nowego obiektu, 2 obiekt
        mateusz.imie = "Mateusz";
        mateusz.wiek = 12;
        mateusz.isALive = true;

        // To są dwa obiekty klasy Person.


        /*Tworzenie metody:
        1. W klasie person zadeklarować metodę, która nic nie zwraca (void)
        2. Nawiasy sugerują że to jest metoda - void przedstawSie(){}
        3. Wywołanie funkcji w klasie main
        4. metode wywolywac dla danego obiektu


         */
        pawel.przedstawSie();
        mateusz.przedstawSie();
        pawel.pelnoletnosc();
        mateusz.pelnoletnosc();

        /*Argumenty metod:
          1. Wskazać w klasie Person jaki typ danych może przyjąć metoda (oraz zmienna) Np. void pelnoletnosc(boolean forma){}
          2. W klasie main przekazujemy tylko wartość. Czyli np. pawel.pelnoletnosc(true/false);

         */
        pawel.ofic(true);
        mateusz.ofic(false);
    }
}
