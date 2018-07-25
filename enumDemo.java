enum Transport{
  CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}
class EnumDemo{
  public static void main(String[] args) {
    Transport tp;
    tp = Transport.AIRPLANE;
    System.out.println(tp);
    tp = Transport.TRAIN;
    if (tp == Transport.TRAIN) {
      System.out.println("tp contains train");
    }

    switch(tp){
      case TRUCK:
        System.out.println("A truck carries freight");
        break;
      case TRAIN:
        System.out.println("A train runs on rail");
        break;
    }
  }
}
