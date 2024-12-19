public class Book {
    private String title;
    private int pages;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }
    public void readBook()
    {
        System.out.println("this is "+this.getClass().getSimpleName());
    }
    public static Book getBook(String type, String title, int pages)
    {
        return switch (type.charAt(0)){
            case 'F'->new Fiction(title,pages);
            case 'N'->new NonFiction(title,pages);
            case 'T'->new Textbook(title,pages);
            default -> new Book(title,pages);
        };
    }
}
class Fiction extends Book
{
    public Fiction(String title, int pages) {
        super(title, pages);
    }

    @Override
    public void readBook() {
        super.readBook();
        System.out.printf("  %s\n".repeat(2),"get lost in imaginary world","Just like Harry Potter");
    }
}
class NonFiction extends Book
{
    public NonFiction(String title, int pages) {
        super(title, pages);
    }

    @Override
    public void readBook() {
        super.readBook();
        System.out.printf("  %s\n".repeat(2),"Read to know History","Read it to know truth");
    }
}
class Textbook extends Book
{
    public Textbook(String title, int pages) {
        super(title, pages);
    }

    @Override
    public void readBook() {
        super.readBook();
        System.out.printf("  %s\n".repeat(2),"Read it to gain knowledge","Read it to earn money");
    }
}
