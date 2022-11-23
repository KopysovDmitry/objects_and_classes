import java.util.Objects;

public class Book {
    private String name;
    private int year;
    private Autor AutorName;


    public Book (String name,int year,Autor AutorName){
        this.name = name;
        this.year = year;
        this.AutorName = AutorName;
    }
    public String getName(){
        return this.name;
    }
    public int getYear(){
        return  this.year;
    }
    public Autor getAutorName(){
        return this.AutorName;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setAutorName(Autor AutorName){
        if (name.equals(AutorName)){
            throw new IllegalArgumentException("Перепутаны поля заполнния");
        }
        this.AutorName = AutorName;
    }
    public Book(String name, int year) {
        this(name, year, null);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && name.equals(book.name) && AutorName.equals(book.AutorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year, AutorName);
    }

    @Override
    public String toString() {
        return this.name + " " + this.year +" " + AutorName;
    }


}
