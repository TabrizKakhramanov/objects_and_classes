import java.util.concurrent.atomic.AtomicStampedReference;

public class Main {
    public static void main(String[] args) {
        Author firstAuthor = new Author("Лев", "Толстой");
        Author secondAuthor = new Author("Сергей", "Пушкин");
        Book firstBook = new Book("Война и Мир", firstAuthor, 2008);
        Book secondBook = new Book("Евгений Онегин", secondAuthor, 2010);

        System.out.println(firstBook.toString());
        firstBook.setPublicationYear(2024);


        System.out.println(firstBook.toString());
        System.out.println(secondBook.toString());
    }
}