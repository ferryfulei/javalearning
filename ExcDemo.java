class ExcTest{
  static void genException(){
    int nums[] = new int[4];
    nums[7] = 10;
  }
}
class ExcDemo2{
  public static void main(String[] args) {
    int nums[] = new int[4];
    try{
      ExcTest.genException();
    }catch(ArrayIndexOutOfBoundsException exc){
      System.out.println("hi");
    }
  }
}
