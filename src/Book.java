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
        this.AutorName = AutorName;
    }
    public Book(String name, int year) {
        this(name, year, null);
    }

}
