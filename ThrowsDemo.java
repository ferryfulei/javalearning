class ThrowsDemo{
  public static char prompt(String str){
      System.out.print(str + ": ");
      return (char) System.in.read();
  }
  public static void main(String[] args) {
    char ch;
    ch = prompt("Enter a letter");
    System.out.println("You pressed " + ch);
  }
}
