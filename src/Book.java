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
}
