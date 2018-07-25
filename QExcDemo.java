class QExcDemo{
  public static void main(String[] args) {
    FixedQueue q1= new FixedQueue(10);
    char ch;
    int i;
    try{
      for (i = 0;i<11 ;i++ ) {
        System.out.print((char)('A' + i));
        q1.put((char)('A'+i));
        System.out.println("OK");
      }
    }catch(QueueFullException exc){
      System.out.println(exc);
    }
  }
}
