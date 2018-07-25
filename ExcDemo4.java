class ExcDemo4{
  public static void main(String[] args) {
    int numer[] = {4,8,16,32,64,128,256,512};
    int denom[] = {2,0,4,4,0,8};
    for (int i = 0;i < numer.length ;i++ ) {
      try{
        System.out.println(numer[i]/denom[i]);
      }catch(ArithmeticException etc){
        System.out.println("Cannot be divided by zero");
      }catch(Throwable exc){
        System.out.println("Some error exists");
        throw exc;
      }
    }
  }
}
