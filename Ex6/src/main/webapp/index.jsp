<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<body>
<h2>Witaj w bibliotece :-)</h2>
<h3>Zadanie domowe Ex6:</h3>
<ol type="1">
    <li>Na potrzeby zadania jest już przygotowany zbiór książek (com.isa.com.isa.bookcase.repository.Books).</li>
    <li>Utwórz servlet <b>Bookcase</b> który w kontekście webowym <b>/books</b> wyświetli wszystkie książki z repozytorium na jedynym widoku:</li>
    <ul>
        <li>każda pozycja na liście powinna wyświetlać wszystkie dostępne informacje o danej książce.</li>
    </ul>
    <li>Dodaj servlet <b>RandomBook</b>:</li>
    <ul>
        <li>w konteście <b>/book-for-today</b> powinna się wyświetlić losowa książka z repozytorium.</li>
    </ul>
    <li>Dodaj kolejny servlet <b>FindBook</b> w konteście <b>/find-book</b>:</li>
    <ul>
        <li>zaimplementuj wyszukiwanie książki po zadanym w request parametrze <b>author</b>,</li>
        <li>jeśli parametr author nie został podany w request, zwróć status BAD_REQUEST (wykorzystaj klasę HttpServletResponse),</li>
        <li>jeśli jako wartość parametru została podana np. tylko litera "A", powinny się wyświetlić wszystkie książki z imieniem lub nazwiskiem autora rozpoczynającym się na literę "A",</li>
        <li>zaimplementuj wyszukiwanie książki po zadanym w request parametrze <b>title</b>,</li>
        <li>w przypadku parametru title wyszukiwanie powinno działać w ten sam sposób jak dla parametru author (można podać dowolny ciąg znaków).</li>
    </ul>
    <li>Do rozwiązania wykorzystaj klasy domain, repository, service (podobnie jak na warsztatach).</li>
    <li>Twoja aplikacja powinna być zbudowana w oparciu o poznane mechanizmy JEE (m.in. EJB, CDI).</li>
    <li>Szczególną uwagę należy zwrócić na zasady <b>clean-code</b>.</li>
</ol>
<p></p>
<p></p>
<h4>Wymagania i punktacja:</h4>
<ol>
    <li>Aplikacja powinna być napisana obiektowo i z wykorzystaniem mechanizmów JEE.</li>
    <li>Prawidłowo działający kontekst <b>/books</b> - <b>1 pkt.</b></li>
    <li>Prawidłowo działający kontekst <b>/book-for-today</b> - <b>1 pkt.</b></li>
    <li>Prawidłowo działający kontekst <b>/find-book</b> - <b>2 pkt.</b></li>
    <li>Aplikacja napisana zgodnie z zasadami <b>clean-code</b> - <b>1 pkt.</b></li>
</ol>
<p>Maksymalną ilość punktów za zadanie (5 pkt.) można otrzymać tylko wówczas, jeśli wszystkie powyższe polecenia zostały wykonane prawidłowo.</p>
</body>
</html>
