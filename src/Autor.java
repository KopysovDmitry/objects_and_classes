import java.util.Objects;

public class Autor {
    private String autorFirstName;
    private String autorLastName;

    public Autor (String autorFirstName, String autorLastName) {
        this.autorFirstName = autorFirstName;
        this.autorLastName = autorLastName;
    }
    public String getAutorFirstName(){
        return this.autorFirstName;
    }
    public  String getAutorLastName(){
        return this.autorLastName;
    }
    @Override
    public String toString() {
        return autorFirstName + " " + autorLastName;
    }

    public void setAutorFirstName(String autorFirstName) {
        this.autorFirstName = autorFirstName;
    }

    public void setAutorLastName(String autorLastName) {
        if (autorLastName.equals(autorFirstName)){
            throw new IllegalArgumentException("НЕ правильно указаны имя и фамилия автора");
        }
        this.autorLastName = autorLastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return autorFirstName.equals(autor.autorFirstName) && autorLastName.equals(autor.autorLastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autorFirstName, autorLastName);
    }
}
