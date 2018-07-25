class Factorial{
  int factR(int n){
    int result;
    if (n == 1) {
      return 1;
    }
    result = factR(n-1) * n;
    return result;
  }
}
class Recursion{
  public static void main(String[] args) {
    Factorial f = new Factorial();
    System.out.println(f.factR(3));
  }
}
