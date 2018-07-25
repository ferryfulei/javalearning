enum TrafficLightColor{
  RED, GREEN, YELLOW
}
class Counter implements Runnable{
  Thread counterThrd;
  static boolean stop = false;
  Counter(){
      counterThrd = new Thread(this);
      counterThrd.start();
  }
  static void startCounter(){
    Counter mycount  = new Counter();
  }
  public void run(){
    try{
      while(!stop) {
        System.out.print(". ");
        Thread.sleep(25);
      }
    }catch(InterruptedException exc){
      System.out.println(exc);
    }
}
  static void stop(){
    stop = true;
  }
}
class TrafficLightsSimulator implements Runnable{
  private TrafficLightColor tlc;
  private boolean stop = false;
  private boolean changed  = false;
  TrafficLightsSimulator (TrafficLightColor init){
  tlc = init;
}
  TrafficLightsSimulator(){
    tlc = TrafficLightColor.RED;
  }
  public void run(){
    while(!stop){
      try{
        switch(tlc){
          case GREEN:
            Thread.sleep(1000);
            break;
          case YELLOW:
            Thread.sleep(200);
            break;
          case RED:
            Thread.sleep(1200);
            break;
        }
      }catch(InterruptedException exc){
        System.out.println(exc);
      }
      changeColor();
    }
  }
   void changeColor(){
    switch(tlc){
      case RED:
        tlc = TrafficLightColor.GREEN;
        break;
      case YELLOW:
        tlc = TrafficLightColor.RED;
        break;
      case GREEN:
        tlc = TrafficLightColor.YELLOW;
        break;
    }
    changed = true;
    System.out.println((Thread.currentThread().getName() == "#1" ? "walker " : "car " )+ tlc);
  }
  synchronized void cancel(){
    stop = true;
  }
}
class TrafficLightDemo{
  public static void main(String[] args) {
    TrafficLightsSimulator t1 = new TrafficLightsSimulator(TrafficLightColor.GREEN);
    TrafficLightsSimulator t2 = new TrafficLightsSimulator(TrafficLightColor.RED);
    Thread thrd2 = new Thread(t2);
    Thread thrd1 = new Thread(t1);
    thrd1.setName("#1");
    thrd2.setName("#2");
    Counter.startCounter();
    thrd1.start();
    thrd2.start();
    try{
      Thread.sleep(10000);
    }catch (InterruptedException e) {
      System.out.println(e);
    }
    t1.cancel();
    t2.cancel();
    Counter.stop();
  }
}
