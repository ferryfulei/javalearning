class Break4{
  public static void main(String args[]){
    int i;
    for (i = 1; i < 4; i++ ) {
      one: {
        two: {
          three:{
            System.out.println("\ni is " + i);
            if (i == 1)   break one;
            if (i == 2)   break two;
            if (i == 3)   break three;
            System.out.println("will not print");
          }
          System.out.println("After block three.");
        }
        System.out.println("After block two.");
      }
      System.out.println("After blcok one.");
    }
    System.out.println("After for.");
  }
}
