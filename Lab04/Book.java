import java.util.ArrayList;

public class Book extends Media {
    private ArrayList<String> authors;
    
    public Book(int id, String title, String category, ArrayList<String> authors) {
        super(id, title, category);
        this.authors = authors;
    }
    
    public ArrayList<String> getAuthors() {
        return authors;
    }
    
    public void setAuthors(ArrayList<String> authors) {
        this.authors = authors;
    }
    
    public void addAuthor(String authorName) {
        authors.add(authorName);
    }
    
    public void removeAuthor(String authorName) {
        authors.remove(authorName);
    }
}
