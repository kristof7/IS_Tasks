# Zadanie 8. Testy jednostkowe i Loggery

### Zadanie: Testy jednostkowe dla BookService - 5 pkt.

1. Otwórz projekt `Ex8` w IntelliJ IDEA.
2. Znajdziesz tam szkielet prostej aplikacji webowej - Bookcase :books:
3. Program Bookcase będzie pozwal na przeszukiwanie małego księgozbioru i wstępnie ma już zaimplementowane kilka metod w klasie BookService.
4. Zanim podłączymy aplikację do bazy danych chcielibyśmy przetestować, czy nasze metody do wyszukiwania książek działają prawidłowo.


##### Wymagania:
   - Napisać testy jednostkowe do metod w klasie `BookService`.
   - Testy jednostkowe powinny pokryć **70%** kodu (wykorzystaj "Run 'All Tests' with Coverage" do sprawdzenia).
   - Do assercji wykorzystaj metody z biblioteki JUnit 5 i AssertJ.
   - Nie posiadamy jeszcze żadnej implementacji BookDao, dlatego najlepszym rozwiązaniem będzie użycie biblioteki Mockito (+ 1 extra punkt), ale można również dodać testową implementację BookDao (tzw. `fake`), która po wywołaniu metody findAllBooks() zwróci przykładową listę książek.
   - Pamiętaj, że należy testować nie tylko "happy path", ale również przypadki brzegowe. Jeśli testy nie przechodzą, bo w testowanej metodzie jest błąd, należy wprowadzić niezbędne poprawki :wink: 
   - W klasie testowej również obowiązują zasady `clean code`.  
<br/>Maksymalną ilosćć punktów za zadanie można otrzymać tylko wówczas, jeśli pokrycie kodu testami wyniesie min. 70%.  


### Zadanie dla chętnych: Loggowanie w aplikacji - 2 pkt.

##### Wymagania:
   - Jest to zadanie domowe od Tomka Pyśko z warsztatów o Loggerach (Zadanie 2).
   - Dodaj do projektu zależności Maven dla slf4j + log4j2.
   - Dodaj konfigurację log4j2 w XML.
   - Zaimplementuj logowanie wyjątku w metodzie _createFile()_ w klasie _FileUtils_.
   - Błąd powinien być logowany na konsolę w postaci XML oraz do pliku jako JSON.
   - Zweryfikuj czy loggowanie działa prawidłowo uruchamiając test w klasie FileUtilsTest.   
<br/>Za zadanie dodatkowe można otrzymać maksymalnie 2 pkt.  

### Forma oddania zadania
Utwórz branch o nazwie wg konwencji `8_imieNazwisko`, np. `8_MariuszSzymanski`<br/>
Wykonaj zadanie na podanym branchu. <br/>
Utwórz Pull Request ze swojego brancha na master.


Dopiero tak zgłoszone zadanie podlega ocenie.


Do zdobycia jest :five: pkt. (+:three: pkt. extra)
Zadania oddane po terminie są oceniane na max połowę pkt.

​
#### Powodzenia! :smile:

### :clock12: Termin oddania:  
## Wtorek 30.06.2020 godz. 23:59
