class Summation{
  int sum;
  Summation(int num){
    sum = 0;
    for (int t = 1;t <= num ;t++ ) {
      sum += ta;
    }
  }
  Summation(Summation ob){
    sum = ob.sum;
  }
}
class SumDemo{
  public static void main(String[] args) {
    Summation s1 = new Summation(5);
    Summation s2 = new Summation(s1);
    System.out.println(s1.sum);
    System.out.println(s2.sum);
  }
}
