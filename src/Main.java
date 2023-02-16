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

        // To są dwa obiekty klasy Person


        /*Tworzenie metody:
        1. W klasie person zadeklarować metodę, która nic nie zwraca (void)
        2. Nawiasy sugerują że to jest metoda - void przedstawSie(){}
        3. Wywołanie funkcji w klasie main
        4. metode wywolywac dla danego obiektu


         */
        pawel.przedstawSie();
        mateusz.przedstawSie();
        pawel.przedstawSie();
        pawel.pelnoletnosc();
        mateusz.pelnoletnosc();
        //Person.ileLudzi();
        System.out.println(Person.ileLudzi());

        /*Argumenty metod:
          1. Wskazać w klasie Person jaki typ danych może przyjąć metoda (oraz zmienna) Np. void pelnoletnosc(boolean forma){}
          2. W klasie main przekazujemy tylko wartość. Czyli np. pawel.pelnoletnosc(true/false);

         */
        pawel.ofic(true);
        mateusz.ofic(false);
    }

        /*
        Po co ten void? (void - metoda nic nie zwraca) Nie ma metody, która uruchamia main, bez sensu było by coś tam zwracać.
        1. Jeżeli usunę voida z metody to MUSZĘ używać return.
        2. Jeżeli nie void to inny zwrot np. String -> String przedstawSie()
        3. Wtedy zamiast System.out.print -> return
        4. W klasie main zapisać w zmiennej: pawel.przedstawSie(); -> String przywitanie = pawel.przedstawSie()
        5. Potem muszę wywołać: System.out.print(przywitanie);

         */

        /*
        Po co ten static?
        Static - oznacza że metoda jest przypisana do całej klasy, a nie do konkretnego obiektu tej klasy
        0. Działa np. przy zliczaniu uruchumień danej funkcji.
        1. Są metody statyczne: (static int ileludzi() )  i pola statyczne: static int ile; )
         */
}
