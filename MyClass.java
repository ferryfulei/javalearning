class MyClass{
    public int beta;
    private int alpha;
    int gamma;
    void setAlpha(int a){
      alpha = a;
    }
    int getAlpha(){
      return alpha;
    }
}
class AccessDemo{
  public static void main(String[] args) {
    MyClass ob = new MyClass();
    ob.setAlpha(-99);
    System.out.println("ob.alpha is " + ob.getAlpha());
    ob.beta = 89;
    ob.gamma = 99;
  }
}
