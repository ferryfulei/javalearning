class VarArgs2{
  static void vaTest(String msg, int ... v){
    System.out.println(msg + v.length);
    System.out.println("Contents");
    for (int i = 0; i  <v.length ;i++ ) {
      System.out.println("arg" + i + ": "+v[i]);
    }
    System.out.println();
  }
  public static void main(String[] args) {
    vaTest("afakfj", 10);
    vaTest("Fafa", 1,3,4);
    vaTest("fafa");
  }
}
