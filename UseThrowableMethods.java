class ExcTest{
  static void genEecption(){
    int nums[] = new int[4];
    nums[7] = 10;
  }
}
class  UseThrowableMethods{
  public static void main(String[] args) {
    try{
      ExcTest.genEecption();
    }catch(ArrayIndexOutOfBoundsException exc){
      System.out.println(exc);
      exc.printStackTrace();
      }
  }
}
