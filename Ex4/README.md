# Zadanie 4. Java Struktury Danych, Date API, Optional
​
### Zadanie A - 1 pkt

Dla tablicy wejściowej _input_ zawierającej liczby typu int zwrócić tablicę zawierającą ilość elementów ujemnych oraz sumę elementów dodatnich. 

Jeśli tablica będzie pusta lub null, wtedy należy zwrócić pustą tablicę.


Przykład: 

Wejście: _input_ int[] {-3, -2, -1, 0, 1, 2, 3, 4, 5} 

Program powinien zwrócić: int[] {3, 15}, czyli 3 liczby ujemne i suma liczb dodatnich równa 15.
<br/><br/>

### Zadanie B - 1 pkt

Dla tablicy wejściowej _input_ zawierającej liczby typu int zwrócić mapę zawierającą:
- ilość elementów ujemnych 
- ilość elementów dodatnich 
- ilość zer
- sumę elementów ujemnych 
- sumę elementów dodatnich


Przykład: 

Wejście: _input_ int[] {-3, -2, -1, 0, 1, 2, 3, 4, 5} 

Program powinien zwrócić: 
{number of negative numbers=3, number of positive numbers=5, number of zeros=1, sum of negative numbers=-6, sum of positive numbers=15}
<br/><br/>

### Zadanie C - 1 pkt

Stwórz metodę, która przyjmuje parametr String (imię) i zwraca wartość logiczną _true/false_.
<br/><br/>
Metoda sprawdza, czy w danym parametrze (imieniu) powtarza się jakaś litera (ignoruj wielkość znaków)
- jeśli tak, to zwraca _true_
- jeśli nie, to zwraca _false_
<br/><br/>

Wypisz wynik w postaci _imię – wynikMetody_ np.:
- _Adam, true_
- _Jan, false_
<br/><br/>

Metoda powinna wykorzystywać jedną z poznanych struktur danych:
- Tablica/Lista/Set/Mapa - wybierz najlepszą do tego celu
<br/><br/>

### Zadanie D - 1 pkt

Napisz metodę, która wyświetli informację, ile czasu pozostało do końca kursu (czyli do 26 lipca 2020 14:00).
<br/><br/>
Np.:

_Do końca kursu: 153 dni 6 godzin 20 minut._

Metoda powinna wykorzystywać Date API (JSR-310).
<br/><br/>

### Zadanie E - 1 pkt

Napisz metodę, która przyjmuje parametr String (imię) i wyświetla na konsoli informację jaką ocenę uzyskał kursant za zadanie domowe.

Utwórz strukturę danych zawierającą niezbędne informacje (kursant + ocena).

Wejście: _Karol_

Program powinien wyświetlić: 
- _Karol za zadanie domowe Ex4 uzyskał 5 pkt._ (jeśli Karol oddał pracę domową)

- _Karol nie wykonał jeszcze zadania domowego_ (jeśli Karol nie oddał jeszcze pracy domowej; ocena = null)

- _Nie znaleziono kursanta o imieniu "Artur"_ (jeśli kursant o podanym imieniu nie istnieje)


Metoda powinna wykorzystywać Java 8 Optional.
<br/><br/>



​
​
# Forma oddania zadania
Utwórz branch o nazwie wg konwencji `4_imieNazwisko`, np. `4_MariuszSzymanski`<br/>
Wykonaj zadanie na podanym branchu. <br/>
Utwórz Pull Request ze swojego brancha na master:heavy_exclamation_mark:


Dopiero tak zgłoszone zadanie podlega ocenie.


Do zdobycia jest :five: pkt.
Zadania oddane po terminie są oceniane na max połowę pkt.

​
#### Powodzenia!

### :clock12: Termin oddania:  
## 28.02.2020 godz. 23:59
