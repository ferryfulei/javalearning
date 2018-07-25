package bookpackext;
class ExtBook extends bookpack.Book{
  private String publisher;
  public ExtBook(String t, String a, int d, String p){
    super(t,a,d);
    publisher = p;
  }
  public String getTitle(){return title;}
}
class ProtectDemo{
  public static void main(String[] args) {
    ExtBook book = new ExtBook("a","A",2018,"af");
    System.out.println(book.getTitle());
  }
}
