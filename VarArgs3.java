class VarArgs3{
  static void vaTest(int ... v){
    System.out.println(v.length);
    for (int i = 0; i < v.length ;i++ ) {
      System.out.println(v[i]);
    }
    System.out.println();
  }
  static void vaTest(boolean ... v){
    System.out.println(v.length);
    for (int i = 0; i < v.length ;i++ ) {
      System.out.println(v[i]);
    }
    System.out.println();
  }
  static void vaTest(String msg, int ... v){
    System.out.println(v.length);
    for (int i = 0; i < v.length ;i++ ) {
      System.out.println(v[i]);
    }
    System.out.println();
  }
  public static void main(String[] args) {
    vaTest(1,2,3);
    vaTest("Ffa",1,2);
    vaTest(false,true,false);
  }
}
