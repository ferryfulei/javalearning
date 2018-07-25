class IfDemo{
  public static void main(String args[]){
    int a,b,c;
    a = 2;
    b = 3;
    if (a < b)
    System.out.println("a is less than b.");
    if (a == b)
    System.out.println("You will not see this.");
    System.out.println();
    c = a - b;
    System.out.println("c contians -1");
    if (c >= 0)
    System.out.println("c is non-negative.");
    if (c < 0)
    System.out.println("c is negative.");
    System.out.println();
    c = b - a;
    if (c >= 0)
    System.out.println("c is non-negative.");
    if (c < 0)
    System.out.println("c is negative.");
  }
}
