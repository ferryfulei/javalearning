class ExcTest{
  static void genEecption(){
    int nums[] = new int[4];
    System.out.println("Before exception is generated.");
    nums[7] = 10;
    System.out.println("this will not be displayed");
  }
}
class ExcDemo2{
  public static void main(String[] args) {
    try{
      ExcTest.genEecption();
    }catch(ArrayIndexOutOfBoundsException exc){
      System.out.println("Index out of bound");
    }
  }
}
