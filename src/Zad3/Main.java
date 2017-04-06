package Zad3;

public class Main {

    /*Zdefiniuj dwie klasy odpowiedzialne za przechowywanie informacji o Grze oraz Zawodniku.
Klasa Game powinna zawierać:
- name,
- players.
Klasa Player powinna zawierać:
- name,
- username,
- points.
Klasa Game powinna zawierać również metodę 'winner', która wypisuje na ekranie imię i nazwisko wygrywającego. Wygrywa
zawodnik, który posiada więcej niż 100 punktów. Jeśli dwaj zawodnicy mają więcej niż 100 punktów, wygrywa ten, który ma
ich więcej. Klasa Player powinna zawierać metodę 'fullName' zwracającą, która powinna wypisać imię i nazwisko gracza.*/

    public static void main(String[] args) {

        Player[] players = {new Player("Ania", "Nowak", 40), new Player("Kasia", "Nowak", 300), new Player("Zosia", "Samosia", 350)};
        Game game = new Game("Heros", players);

        System.out.println(game.winner());
    }
}
