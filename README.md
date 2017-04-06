Zadanie 1.
Stwórz klasę Osoba posiadającą następujące dane takie jak:
-name,
-surname,
-age,
-gender.
Stwórz odpowiedni konstruktor, który przyjmuje wszystkie argumenty. Dodaj metody dostępowe do zmiennych obiektu. Stwórz przykładowe 
obiekty.

Zadanie 2.
Stwórz klasę Samochód posiadającą następujące atrybuty:
-brand, 
-model,
-price.
Stwórz metody dostępowe do atrybutów. Stwórz metodę show wyświetlającą markę oraz cenę w jednej linii.

Zadanie 3.
Zdefiniuj dwie klasy odpowiedzialne za przechowywanie informacji o Grze oraz Zawodniku.
Klasa Game powinna zawierać:
- name,
- players.
Klasa Player powinna zawierać:
- name,
- username,
- points.
Klasa Game powinna zawierać również metodę 'winner', która wypisuje na ekranie imię i nazwisko wygrywającego. Wygrywa zawodnik, który
posiada więcej niż 100 punktów. Jeśli dwaj zawodnicy mają więcej niż 100 punktów, wygrywa ten, który ma ich więcej. Klasa Player
powinna zawierać metodę 'fullName' zwracającą, która powinna wypisać imię i nazwisko gracza.

Zadanie 4.
Napisz program, w którym utworzysz dwie klasy:
Employee -klasa,która będzie przedstawiała pracownika dowolnej firmy. Podstawowe informacje o pracowniku jakie są potrzebne pracodawcy
to imię,nazwisko, rok urodzenia, staż pracy.
Company - klasa, w której utworzysz 3 obiekty reprezentujące pracowników, a następnie wyświetlisz informację o nich na ekranie.

Zadanie5.
Zdefinuj klasę Product posiadającą name,description, specification. Dodaj odpowiedni konstruktor. Zdefiniuj Klasę Guarantee, która
odnosi się do danego produktu oraz dodatkowy atrybut validUntil. Zdefiniuj metodę publiczną isValid. Jeśli produkt jest ważny zwraca
true w przeciwnym wypadku false. Jeśli Gwarancja jest nieważna to czyści Gwarancję ustawiając validUntlioraz product na null.

Zadanie 6.
Stwórz klasę Book, która będzie zawierała informację o książce. Stwórzprzykładowe książki (stworzenie książki w klasie Library)

Zadanie 7.
Stwórz abstrakcyjną klasę Figure z dwoma polami a i b typu double, konstruktorem inicjującym te wartości oraz abstrakcyjną 
metodą do obliczania pola figury getArea(double a, double b). Następnie stwórz podklasy: Rectangle(prostokąt), 
Triangle (trójkąt prostokątny). W klasach pochodnych zaimplementuj metodę z klasy bazowej. Następnie stwórz klasę testową, 
utwórz w niej każdy z obiektów i wyświetl ich powierzchnie.

Zadanie 8.
Stwórz klasę Point2D, która przechowuje informacje na temat punktu  na przestrzeni dwuwymiarowej(współrzędne x oraz y).
Klasa powinna zawierać konstruktor przyjmujący dwa argumenty i ustawiający pola obiektu zgodnie z podanymi parametrami.
Napisz klasę Point3D dziedziczącą po Point2D, reprezentującą punkt w trójwymiarze (dodatkowe pole z). Klasa powinna zawierać 
konstruktor przyjmujący trzy argumenty i ustawiający pola obiektu zgodnie z podanymi parametrami.W klasie testowej utwórz obiekty
obu klas i wypisz ich współrzędne.
