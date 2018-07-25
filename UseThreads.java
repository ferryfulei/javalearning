class MyThreads implements Runnable{
  Thread thrd;
  String thrdName;
  MyThreads(String name){
    thrd = new Thread(this, name);
  }
  public static void createAndStart(String name){
    MyThreads mythrd = new MyThreads(name);
    mythrd.thrd.start();
  }
  public void run() {
    System.out.println(thrdName + " starting");
    try{
      for (int count = 0; count < 10 ; count ++ ) {
        Thread.sleep(400);
        System.out.println(thrd.getName() + " saying " + count);
      }
    }catch(InterruptedException exc){
      System.out.println(thrd.getName() + " interrupted");
    }
    System.out.println(thrd.getName() + " terminating");
  }
}
class UseThreads{
  public static void main(String[] args) {
    System.out.println("Main thread starting.");
    MyThreads.createAndStart("thread1");
    for (int  i = 0; i < 50 ;i++ ) {
      System.out.println(". main thread saying hello world");
      try{
        Thread.sleep(100);
      }catch(InterruptedException exc){
        System.out.println("Main thread interrupted");
      }
    }
    System.out.println("Main thread ending.");
  }
}
