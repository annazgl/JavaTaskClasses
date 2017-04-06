package Zad1;

public class Main {
    /*Stwórz klasę Osoba posiadającą następujące dane takie jak:
-name,
-surname,
-age,
-gender.
Stwórz odpowiedni konstruktor, który przyjmuje wszystkie argumenty. Dodaj metody dostępowe do zmiennych obiektu.
Stwórz przykładowe obiekty.*/

    public static void main(String[] args) {
        Person person1 = new Person("Anna", "Zglejszewska", 27, 'K');
        Person person2 = new Person("Adam", "Nowak", 45, 'M');
        Person person3 = new Person("Kasia", "Kowalska", 13, 'K');

        System.out.println(person1.showIn());
        System.out.println(person2.showIn());
        System.out.println(person3.showIn());
    }
}

