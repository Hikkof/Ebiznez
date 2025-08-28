# Ebiznez
Zadanie 1 Docker<br />
✅ 3.0 obraz ubuntu z Pythonem w wersji 3.10<br />
❌ 3.5 obraz ubuntu:24.02 z Javą w wersji 8 oraz Kotlinem<br />
❌ 4.0 do powyższego należy dodać najnowszego Gradle’a oraz paczkę JDBC SQLite w ramach projektu na Gradle (build.gradle)<br />
❌ 4.5 stworzyć przykład typu HelloWorld oraz uruchomienie aplikacji przez CMD oraz gradle<br />
❌ 5.0 dodać konfigurację docker-compose<br />
Plik: Docker<br />
<br />
Zadanie 2 Scala<br />
✅ 3.0 Należy stworzyć kontroler do Produktów<br />
❌ 3.5 Do kontrolera należy stworzyć endpointy zgodnie z CRUD - dane pobierane z listy<br />
❌ 4.0 Należy stworzyć kontrolery do Kategorii oraz Koszyka + endpointy zgodnie z CRUD<br />
❌ 4.5 Należy aplikację uruchomić na dockerze (stworzyć obraz) oraz dodać skrypt uruchamiający aplikację via ngrok (nie podawać tokena ngroka w gotowym rozwiązaniu)<br />
❌ 5.0 Należy dodać konfigurację CORS dla dwóch hostów dla metod CRUD<br />
Plik: Scala<br />
<br />
Zadanie 3 Kotlin<br />
✅ 3.0 Należy stworzyć aplikację kliencką w Kotlinie we frameworku Ktor, która pozwala na przesyłanie wiadomości na platformę Discord<br />
❌ 3.5 Aplikacja jest w stanie odbierać wiadomości użytkowników z platformy Discord skierowane do aplikacji (bota)<br />
❌ 4.0 Zwróci listę kategorii na określone żądanie użytkownika<br />
❌ 4.5 Zwróci listę produktów wg żądanej kategorii<br />
❌ 5.0 Aplikacja obsłuży dodatkowo jedną z platform: Slack, Messenger, Webex<br />
Plik: Kotlin<br />
Zadanie 4 Go<br />
✅ 3.0 Należy stworzyć aplikację we frameworki echo w j. Go, która będzie miała kontroler Produktów zgodny z CRUD<br />
❌ 3.5 Należy stworzyć model Produktów wykorzystując gorm oraz wykorzystać model do obsługi produktów (CRUD) w kontrolerze (zamiast listy)<br />
❌ 4.0 Należy dodać model Koszyka oraz dodać odpowiedni endpoint<br />
❌ 4.5 Należy stworzyć model kategorii i dodać relację między kategorią, a produktem<br />
❌ 5.0 pogrupować zapytania w gorm’owe scope'y<br />
Plik: Go<br />
Zadanie 5 Frontend<br />
✅ 3.0 W ramach projektu należy stworzyć dwa komponenty: Produkty oraz Płatności; Płatności powinny wysyłać do aplikacji serwerowej dane, a w Produktach powinniśmy pobierać dane o produktach z aplikacji serwerowej<br />
❌ 3.5 Należy dodać Koszyk wraz z widokiem; należy wykorzystać routing<br />
❌ 4.0 Dane pomiędzy wszystkimi komponentami powinny być przesyłane za pomocą React hooks<br />
❌ 4.5 Należy dodać skrypt uruchamiający aplikację serwerową oraz kliencką na dockerze via docker-compose<br />
❌ 5.0 Należy wykorzystać axios’a oraz dodać nagłówki pod CORS<br />
Plik: Frontend<br />
Zadanie 6 Testy<br />
✅ 3.0 Należy stworzyć 20 przypadków testowych w CypressJS lub Selenium (Kotlin, Python, Java, JS, Go, Scala)<br />
❌ 3.5 Należy rozszerzyć testy funkcjonalne, aby zawierały minimum 50 asercji<br />
❌ 4.0 Należy stworzyć testy jednostkowe do wybranego wcześniejszego projektu z minimum 50 asercjami<br />
❌ 4.5 Należy dodać testy API, należy pokryć wszystkie endpointy z minimum jednym scenariuszem negatywnym per endpoint<br />
❌ 5.0 Należy uruchomić testy funkcjonalne na Browserstacku<br />
Plik: Selenium<br />
Zadanie 7 Sonar<br />
✅ Należy dodać litera do odpowiedniego kodu aplikacji serwerowej w hookach gita<br />
❌ Należy wyeliminować wszystkie bugi w kodzie w Sonarze (kod aplikacji serwerowej)<br />
❌ Należy wyeliminować wszystkie zapaszki w kodzie w Sonarze (kod aplikacji serwerowej)<br />
❌ Należy wyeliminować wszystkie podatności oraz błędy bezpieczeństwa w kodzie w Sonarze (kod aplikacji serwerowej)<br />
❌ Należy wyeliminować wszystkie błędy oraz zapaszki w kodzie aplikacji klienckiej<br />
Plik: Kotlin<br />
