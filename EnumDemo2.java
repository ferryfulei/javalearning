enum Transprot{
  CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}
class EnumDemo2{
  public static void main(String[] args) {
    Transport tp;
    System.out.println("here are all transport constants");
    Transport allTransports[] = Transport.values();
    for (Transport t : allTransports ) {
      System.out.println(t);
    }
    System.out.println();
    tp = Transport.valueOf("AIRPLANE");
    System.out.println("tp contains" + tp);
  }
}
