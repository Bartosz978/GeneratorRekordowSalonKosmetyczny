package org.example.constants;

import java.util.Random;

public class Wartosci_Losowe {
    private static Random random = new Random();

    public static final String[] nazwiska = {"Nowak", "Kowalski", "Wisniewski", "Wojcik", "Kowalczyk",
            "Kaminski", "Lewandowski", "Zielinski", "Szymanski", "Wozniak"};

    public static final String[] imiona = {"Antoni", "Jan", "Jakub", "Aleksander", "Szymon", "Franciszek",
            "Filip", "Mikolaj", "Wojciech", "Adam", "Kamil", "Michal",
            "Karol", "Dawid", "Konrad", "Maciej"};

    public static final String[] kategorieKosmetyczne = {
            "Pielegnacja skory",
            "Makijaz",
            "Produkty do pielegnacji wlosów",
            "Perfumy",
            "Produkty do pielegnacji paznokci",
            "Artykuly do higieny osobistej",
            "Produkty do opalania",
            "Produkty do depilacji",
            "Kosmetyki dla mezczyzn",
            "Produkty do pielegnacji ciala"
    };

    public static final String koncowkiEmail = "@example.com";
    public static final  String[] countries = {"Polska", "Niemcy", "Francja", "Wlochy", "Hiszpania", "USA", "Kanada", "Japonia", "Brazylia", "Australia"};

    // Tablica miast dla każdego kraju
    public static final String[][] cities = {
            {"Warszawa", "Krakow", "Gdansk", "Lodz", "Poznan", "Wroclaw", "Szczecin", "Katowice", "Gdynia", "Bydgoszcz"},
            {"Berlin", "Monachium", "Frankfurt", "Hamburg", "Kolonia", "Stuttgart", "Dortmund", "Drezno", "Lipsk", "Hanower"},
            {"Paryz", "Lyon", "Marsylia", "Tuluza", "Nantes", "Nica", "Strasburg", "Bordeaux", "Lille", "Rennes"},
            {"Rzym", "Mediolan", "Neapol", "Turyn", "Palermo", "Genua", "Bolonia", "Florencja", "Bari", "Katania"},
            {"Madryt", "Barcelona", "Walencja", "Sewilla", "Zaragoza", "Malaga", "Murcja", "Palma de Mallorca", "Las Palmas", "Bilbao"},
            {"Nowy Jork", "Los Angeles", "Chicago", "Houston", "Filadelfia", "Phoenix", "San Antonio", "San Diego", "Dallas", "San Jose"},
            {"Toronto", "Montreal", "Vancouver", "Calgary", "Edmonton", "Ottawa", "Winnipeg", "Quebec", "Hamilton", "London"},
            {"Tokio", "Kioto", "Osaka", "Jokohama", "Nagoja", "Sapporo", "Kobe", "Fukuoka", "Kawasaki", "Saitama"},
            {"Sao Paulo", "Rio de Janeiro", "Brasilia", "Salvador", "Fortaleza", "Belo Horizonte", "Manaus", "Curitiba", "Recife", "Porto Alegre"},
            {"Sydney", "Melbourne", "Brisbane", "Perth", "Adelaide", "Canberra", "Gold Coast", "Newcastle", "Wollongong", "Hobart"}
    };



    public static final String[] Stanowiska = {
            "Kosmetyczka",
            "Masażystka",
            "Fryzjerka",
            "Wizazystka",
            "Specjalistka od paznokci",
            "Recepcjonistka",
            "Asystentka salonu",
            "Specjalistka od depilacji",
            "Manager salonu",
            "Specjalistka od mikrodermabrazji"
    };
    public static final String[] weirdVoivodeships = {
            "Złotogródzkie", "Srebrnopol", "Rubinów", "Szmaragdowe", "Ametystowe", "Bursztyniany", "Diamentopol", "Perłowo", "Topazowe", "Szafirowy Kraniec",
            "Rubinowo", "Żelaznodrzewne", "Szklanogród", "Szafirowo", "Kryształówka", "Korundowo", "Opalowe Wzgórze", "Granitowo", "Szmaragdowy Kąt", "Obsydianowo",
            "Perłogród", "Szafirowe Wzgórze", "Malachitowo", "Platynogród", "Rubinkowo", "Szmaragdowa Dolina", "Szafirówka", "Srebrnogród", "Szmaragdowe Wzgórze",
            "Bursztynowo", "Rubiniany", "Srebrnogród", "Szmaragdowa Równina", "Ametystowo", "Platyniany", "Szafirowe Pola", "Diamentowo", "Szmaragdowy Las",
            "Perłowy Las", "Topaziany", "Szmaragdowe Pole", "Rubiniowy Kraniec", "Szafirowe Góry", "Diamentowo", "Srebrnowo", "Szmaragdowe Wrzosowisko", "Rubinowo",
            "Szafirowa Dolina", "Topazowo", "Szmaragdowy Skraj", "Złotogródzkie", "Srebrnopol", "Rubinów", "Szmaragdowe", "Ametystowe", "Bursztyniany", "Diamentopol",
            "Perłowo", "Topazowe", "Szafirowy Kraniec", "Rubinowo", "Żelaznodrzewne", "Szklanogród", "Szafirowo", "Kryształówka", "Korundowo", "Opalowe Wzgórze",
            "Granitowo", "Szmaragdowy Kąt", "Obsydianowo", "Perłogród", "Szafirowe Wzgórze", "Malachitowo", "Platynogród", "Rubinkowo", "Szmaragdowa Dolina",
            "Szafirówka", "Srebrnogród", "Szmaragdowe Wzgórze", "Bursztynowo", "Rubiniany", "Srebrnogród", "Szmaragdowa Równina", "Ametystowo", "Platyniany",
            "Szafirowe Pola", "Diamentowo", "Szmaragdowy Las", "Perłowy Las", "Topaziany", "Szmaragdowe Pole", "Rubiniowy Kraniec", "Szafirowe Góry", "Diamentowo",
            "Srebrnowo", "Szmaragdowe Wrzosowisko", "Rubinowo", "Szafirowa Dolina", "Topazowo", "Szmaragdowy Skraj", "Złotogródzkie", "Srebrnopol", "Rubinów",
            "Szmaragdowe", "Ametystowe", "Bursztyniany", "Diamentopol", "Perłowo", "Topazowe", "Szafirowy Kraniec", "Rubinowo", "Żelaznodrzewne", "Szklanogród",
            "Szafirowo", "Kryształówka", "Korundowo", "Opalowe Wzgórze", "Granitowo", "Szmaragdowy Kąt", "Obsydianowo", "Perłogród", "Szafirowe Wzgórze",
            "Malachitowo", "Platynogród", "Rubinkowo", "Szmaragdowa Dolina", "Szafirówka", "Srebrnogród", "Szmaragdowe Wzgórze", "Bursztynowo", "Rubiniany",
            "Srebrnogród", "Szmaragdowa Równina", "Ametystowo", "Platyniany", "Szafirowe Pola", "Diamentowo", "Szmaragdowy Las", "Perłowy Las", "Topaziany",
            "Szmaragdowe Pole", "Rubiniowy Kraniec", "Szafirowe Góry", "Diamentowo", "Srebrnowo", "Szmaragdowe Wrzosowisko", "Rubinowo", "Szafirowa Dolina",
            "Topazowo", "Szmaragdowy Skraj", "Złotogródzkie", "Srebrnopol", "Rubinów", "Szmaragdowe", "Ametystowe", "Bursztyniany", "Diamentopol", "Perłowo",
            "Topazowe", "Szafirowy Kraniec", "Rubinowo", "Żelaznodrzewne", "Szklanogród", "Szafirowo", "Kryształówka", "Korundowo", "Opalowe Wzgórze",
            "Granitowo", "Szmaragdowy Kąt", "Obsydianowo", "Perłogród", "Szafirowe Wzgórze", "Malachitowo", "Platynogród", "Rubinkowo", "Szmaragdowa Dolina",
            "Szafirówka", "Srebrnogród", "Szmaragdowe Wzgórze", "Bursztynowo", "Rubiniany", "Srebrnogród", "Szmaragdowa Równina", "Ametystowo", "Platyniany",
            "Szafirowe Pola", "Diamentowo", "Szmaragdowy Las", "Perłowy Las", "Topaziany", "Szmaragdowe Pole", "Rubiniowy Kraniec", "Szafirowe Góry", "Diamentowo",
            "Srebrnowo", "Szmaragdowe Wrzosowisko", "Rubinowo", "Szafirowa Dolina", "Topazowo", "Szmaragdowy Skraj"
    };
    public static final  String[] weirdStreets = {
            "Ulica Bezimienna", "Skrzyżowanie Marzeń", "Zakręt Śmiechu", "Aleja Zaklęć", "Plac Tajemniczy", "Skwer Szalonych Kotów", "Trakt Niezwykłości", "Rondo Fantastyczne", "Wąwóz Marzeń", "Most Nadziei",
            "Wzgórze Ciekawości", "Tęczowa Aleja", "Aleja Zmysłów", "Ulica Marzeń", "Plac Nadziei", "Zakątek Tajemniczy", "Główna Aleja", "Zaułek Czarów", "Ulica Niezwykła", "Skwer Uśmiechu",
            "Aleja Przygód", "Trakt Fantazji", "Rondo Niezwykłe", "Róg Niesamowitości", "Most Zabaw", "Ulica Zwariowana", "Skrzyżowanie Ciekawości", "Plac Fantastyczny", "Wzgórze Wyobraźni", "Aleja Wrażeń",
            "Ulica Zagadkowa", "Plac Zwierząt", "Zakręt Wesołości", "Aleja Przyjaciół", "Skwer Niezwykły", "Most Przygód", "Rondo Zabaw", "Wąwóz Fantazji", "Trakt Zabawy", "Aleja Nadziei",
            "Ulica Niespodzianek", "Plac Czarów", "Zaułek Śmiechu", "Róg Radości", "Most Marzeń", "Ulica Ciekawości", "Skrzyżowanie Zabawy", "Plac Zwariowany", "Wzgórze Szczęścia", "Aleja Radości",
            "Ulica Uśmiechu", "Skwer Marzeń", "Most Zwariowany", "Rondo Przyjemności", "Plac Zabawy", "Trakt Radości", "Zakręt Zwariowany", "Wąwóz Zabaw", "Aleja Uśmiechu", "Ulica Zwariowana",
            "Skrzyżowanie Przyjemności", "Zakątek Wesołości", "Róg Uśmiechu", "Plac Wesołości", "Most Nadziei", "Wzgórze Wesołości", "Aleja Zabawy", "Ulica Przyjemności", "Skwer Radości", "Rondo Uśmiechu",
            "Plac Zwariowany", "Zakręt Wesołości", "Trakt Wesołości", "Wąwóz Wesołości", "Most Radości", "Rondo Wesołości", "Aleja Wesołości", "Ulica Wesołości", "Skwer Wesołości", "Plac Wesołości",
            "Zakręt Radości", "Trakt Uśmiechu", "Wzgórze Radości", "Most Uśmiechu", "Rondo Zwariowany", "Aleja Zwariowana", "Ulica Zwariowana", "Skwer Zwariowany", "Plac Zwariowany", "Zakręt Zwariowany",
            "Trakt Zwariowany", "Wzgórze Zwariowane", "Most Zwariowany", "Rondo Zwariowane", "Aleja Zwariowana", "Ulica Zwariowana", "Skwer Zwariowany", "Plac Zwariowany", "Zakręt Zwariowany",
            "Trakt Zwariowany", "Wzgórze Zwariowane", "Most Zwariowany", "Rondo Zwariowane", "Aleja Zwariowana", "Ulica Zwariowana", "Skwer Zwariowany", "Plac Zwariowany", "Zakręt Zwariowany",
            "Trakt Zwariowany", "Wzgórze Zwariowane", "Most Zwariowany", "Rondo Zwariowane", "Aleja Zwariowana", "Ulica Zwariowana", "Skwer Zwariowany", "Plac Zwariowany", "Zakręt Zwariowany",
            "Trakt Zwariowany", "Wzgórze Zwariowane", "Most Zwariowany", "Rondo Zwariowane", "Aleja Zwariowana", "Ulica Zwariowana", "Skwer Zwariowany", "Plac Zwariowany", "Zakręt Zwariowany",
            "Trakt Zwariowany", "Wzgórze Zwariowane", "Most Zwariowany", "Rondo Zwariowane", "Aleja Zwariowana", "Ulica Zwariowana", "Skwer Zwariowany", "Plac Zwariowany", "Zakręt Zwariowany",
            "Trakt Zwariowany", "Wzgórze Zwariowane", "Most Zwariowany", "Rondo Zwariowane", "Aleja Zwariowana", "Ulica Zwariowana", "Skwer Zwariowany", "Plac Zwariowany", "Zakręt Zwariowany",
            "Trakt Zwariowany", "Wzgórze Zwariowane", "Most Zwariowany", "Rondo Zwariowane", "Aleja Zwariowana", "Ulica Zwariowana", "Skwer Zwariowany", "Plac Zwariowany", "Zakręt Zwariowany",
            "Trakt Zwariowany", "Wzgórze Zwariowane", "Most Zwariowany", "Rondo Zwariowane", "Aleja Zwariowana", "Ulica Zwariowana", "Skwer Zwariowany", "Plac Zwariowany", "Zakręt Zwariowany",
            "Trakt Zwariowany", "Wzgórze Zwariowane", "Most Zwariowany", "Rondo Zwariowane", "Aleja Zwariowana", "Ulica Zwariowana", "Skwer Zwariowany", "Plac Zwariowany", "Zakręt Zwariowany",
            "Trakt Zwariowany", "Wzgórze Zwariowane", "Most Zwariowany", "Rondo Zwariowane", "Aleja Zwariowana", "Ulica Zwariowana", "Skwer Zwariowany", "Plac Zwariowany", "Zakręt Zwariowany",
            "Trakt Zwariowany", "Wzgórze Zwariowane", "Most Zwariowany", "Rondo Zwariowane", "Aleja Zwariowana", "Ulica Zwariowana", "Skwer Zwariowany", "Plac Zwariowany", "Zakręt Zwariowany",
            "Trakt Zwariowany", "Wzgórze Zwariowane", "Most Zwariowany", "Rondo Zwariowane", "Aleja Zwariowana", "Ulica Zwariowana", "Skwer Zwariowany", "Plac Zwariowany", "Zakręt Zwariowany",
            "Trakt Zwariowany", "Wzgórze Zwariowane", "Most Zwariowany", "Rondo Zwariowane", "Aleja Zwariowana", "Ulica Zwariowana", "Skwer Zwariowany", "Plac Zwariowany", "Zakręt Zwariowany",
            "Trakt Zwariowany", "Wzgórze Zwariowane", "Most Zwariowany", "Rondo Zwariowane", "Aleja Zwariowana", "Ulica Zwariowana", "Skwer Zwariowany", "Plac Zwariowany", "Zakręt Zwariowany",
            "Trakt Zwariowany", "Wzgórze Zwariowane", "Most Zwariowany", "Rondo Zwariowane", "Aleja Zwariowana", "Ulica Zwariowana", "Skwer Zwariowany", "Plac Zwariowany", "Zakręt Zwariowany",
            "Trakt Zwariowany", "Wzgórze Zwariowane", "Most Zwariowany", "Rondo Zwariowane", "Aleja Zwariowana", "Ulica Zwariowana", "Skwer Zwariowany", "Plac Zwariowany", "Zakręt Zwariowany",
            "Trakt Zwariowany", "Wzgórze Zwariowane", "Most Zwariowany", "Rondo Zwariowane", "Aleja Zwariowana", "Ulica Zwariowana", "Skwer Zwariowany", "Plac Zwariowany", "Zakręt Zwariowany",
            "Trakt Zwariowany", "Wzgórze Zwariowane", "Most Zwariowany", "Rondo Zwariowane", "Aleja Zwariowana", "Ulica Zwariowana", "Skwer Zwariowany", "Plac Zwariowany", "Zakręt Zwariowany"
    };


    public static final int LosujzTablciy(String[] array) {
        int index = array.length;
        return random.nextInt(index);
    }

    public static String generujOpis() {
        StringBuilder s = new StringBuilder();
        int word = random.nextInt(10) + 7;
        for (int i = 0; i < word; i++) {

            s.append((char) (random.nextInt(25) + 97));
        }

        return s.toString();
    }

    public static String generujEmail() {
        String opis = generujOpis();
        opis = opis.substring(0, 5);
        return opis + koncowkiEmail;
    }

    public static String generujTelefon() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 9; i++) {

            s.append((char) (random.nextInt(9) + 48));
        }
        return s.toString();
    }
}