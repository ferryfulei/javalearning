class Helloworld{
  String state;
  synchronized void Hello(boolean running){
    if (!running) {
      state = "Helloed";
      notify();
      return;
    }
    System.out.println("Hello ");
    state = "Helloed";
    System.out.println("Thread 1 held on");
    try{
      Thread.sleep(300);
    }catch(InterruptedException exc){
      System.out.println("Main thread interrupted");
    }
    notify();
    try{
      while(!state.equals("worlded"))
        wait();
    }catch(InterruptedException exc){
      System.out.println("Thread interrupted");
    }
  }
  synchronized void world(boolean running){
    if (!running) {
      state = "worlded";
      notify();
      return;
    }
    System.out.println("world");
    state = "worlded";
    System.out.println("Thread 2 held on");
    try{
      Thread.sleep(300);
    }catch(InterruptedException exc){
      System.out.println("Main thread interrupted");
    }
    notify();
    try{
      while(!state.equals("Helloed"))
      wait();
    }catch(InterruptedException exc){
      System.out.println("Thread interrupted");
    }
  }
}
class MyThread implements Runnable{
  Thread thrd;
  Helloworld ttob;
  MyThread(String name, Helloworld tt){
    thrd = new Thread(this,name);
    ttob = tt;
  }
  public static MyThread createAndStart(String name, Helloworld tt) {
    MyThread myThrd = new MyThread(name, tt);
    myThrd.thrd.start();
    return myThrd;
  }
  public  void run(){
    if (thrd.getName().compareTo("Hello") == 0) {
      for (int i = 0;i < 5 ;i++ ) ttob.Hello(true);
      ttob.Hello(false);
    }
    else{
      for (int i = 0;i < 5 ;i++ ) ttob.world(true);
      ttob.world(false);
      }
    }
  }
class ThreadCom{
  public static void main(String[] args) {
    Helloworld tt = new Helloworld();
    MyThread mt1 = MyThread.createAndStart("Hello", tt);
    MyThread mt2 = MyThread.createAndStart("World", tt);
    int count = 0;
    do{
      System.out.print(".");
      count++;
      if (count %3 == 0) {
        System.out.print("\n");
      }
      try{
        Thread.sleep(100);
      }catch(InterruptedException exc){
        System.out.println("Main thread interrupted");
      }
    }while(mt1.thrd.isAlive()||mt2.thrd.isAlive());
    try{
      mt1.thrd.join();
      mt2.thrd.join();
    }catch(InterruptedException exc){
      System.out.println("Main thread interrupted");
    }
  }
}
