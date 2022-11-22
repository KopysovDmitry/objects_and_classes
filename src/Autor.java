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
}
