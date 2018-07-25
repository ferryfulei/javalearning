package bookpackext;
import bookpack.*;
class UseBook{
  public static void main(String[] args) {
    Book book[] = new Book[2];
    book[0] = new Book("Java","Schildt",2018);
    book[1] = new Book("Beginner","Schildt",2019);
    for (int i = 0;i < book.length ;i++ ) {
      book[1].show();
    }
    }
}
