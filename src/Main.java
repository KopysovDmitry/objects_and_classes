public class Main {
    public static void main(String[] args) {
        Autor bibleAutor = new Autor("Lev","Tolstoy");
        System.out.println("bibleAutor.getAutorFirstName() = " + bibleAutor.getAutorFirstName());
        System.out.println("bibleAutor.getAutorLastName() = " + bibleAutor.getAutorLastName());

        Book holybook = new Book("Holybook", 2022, bibleAutor);
        System.out.println("holybook.name = " + holybook.getName());
        System.out.println("holybook.year = " + holybook.getYear());
        System.out.println("holybook.getAutorName() = " + holybook.getAutorName());


        holybook.setYear(2023);
        System.out.println("holybook.getYear() = " + holybook.getYear());


        Autor westernBook = new Autor("John", "Wein");
        System.out.println("western.getAutorFirstName() = " + westernBook.getAutorFirstName());
        System.out.println("western.getAutorLastName() = " + westernBook.getAutorLastName());

        Book western = new Book("wild west",1890);
        System.out.println("western.getName() = " + western.getName());
        System.out.println("western.getYear() = " + western.getYear());
    }
}