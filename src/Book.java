import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    int publicationYear;

    public Book( String name, Author author, int publicationYear){
        this.name=name;
        this.author=author;
        this.publicationYear=publicationYear;
    }
    public String getName() {
        return name;
    }
    public Author getAuthor() {
        return author;
    }
    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Книга \""+getName()+"\", автор "+ author.toString()+", год публикации издания "+getPublicationYear()+".";
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass()!=obj.getClass()){
            return false;
        }
        Book book = (Book) obj;
        return name.equals(book.name)&&author.equals(book.author);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, author);
    }
}
