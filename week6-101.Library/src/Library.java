import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library(){
        books = new ArrayList<Book>();
    }

    public void addBook(Book b){
        books.add(b);
    }

    public void printBooks(){
        for (Book b:books) {
            System.out.println(b);
        }
    }

    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> temp = new ArrayList<Book>();
        for (Book b:books) {
            if (StringUtils.included(b.title(), title)){
                temp.add(b);
            }
        }
        return temp;
    }

    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> temp = new ArrayList<Book>();
        for (Book b:books) {
            if (StringUtils.included(b.publisher(), publisher)){
                temp.add(b);
            }
        }
        return temp;
    }

    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> temp = new ArrayList<Book>();
        for (Book b:books) {
            if (b.year()==year){
                temp.add(b);
            }
        }
        return temp;
    }
}
