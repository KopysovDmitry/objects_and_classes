public class Main {
    public static void main(String[] args) {
        Autor bibleAutor = new Autor("Lev", "Tolstoy");
        //bibleAutor.setAutorLastName("Lev");


        Book holybook = new Book("Holybook", 2022, bibleAutor);
        System.out.println(holybook);


        holybook.setYear(2023);
        System.out.println("holybook.getYear() = " + holybook.getYear());


        Autor westernBook = new Autor("John", "Wein");


        Book western = new Book("wild west", 1890, westernBook);
        System.out.println(western);

        if (holybook.equals(western)) {
            System.out.println("Книги одинаковые");
        } else {
            System.out.println("Это две разные книги");
        }
        System.out.println(holybook.equals(western));
        System.out.println(bibleAutor.equals(westernBook));

    }
}