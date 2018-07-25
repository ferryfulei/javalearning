class UseFinally{
  public static void genException(int what){
    int t;
    int nums[] = new int [2];
    System.out.println(what);
    try{
      switch(what){
        case 0:
          t = 10/what;
        case 1:
          nums[4] = 10;
        case 2:
          return;
      }}catch(ArithmeticException exc){
        System.out.println("No matching element found.");
      }catch(ArrayIndexOutOfBoundsException exc){
        System.out.println("Index out of range");
      }finally{
        System.out.println("Leaving try");
      }
    }
  }

class FinallyDemo{
  public static void main(String[] args) {
    for (int i = 0; i < 3 ;i++ ) {
      UseFinally.genException(i);
    }
  }
}
