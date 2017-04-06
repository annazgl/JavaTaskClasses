package Zad4;

public class Company {
        /* Napisz program, w którym utworzysz dwie klasy:
         Employee - klasa, która będzie przedstawiała pracownika dowolnej firmy. (Podstawowe informacje o pracowniku
         jakie są potrzebne pracodawcy to imię, nazwisko, rok urodzenia, staż pracy)
         Company - klasa, w której utworzysz 3 obiekty reprezentujące pracowników, a następnie wyświetlisz informację
          o nich na ekranie*/

    public static void main(String[] args) {
        Employee jan = new Employee("Jan", "Kowalski", 1990, 5);
        Employee adam = new Employee("Adam", "Nowak", 1960, 20);
        Employee zofia = new Employee("Zofia", "Dąbek", 1980, 15);

        jan.show();
        adam.show();
        zofia.show();
    }

}

